package it.unibas.riumane.controllo;

import it.unibas.riumane.Costanti;
import it.unibas.riumane.modello.Modello;
import it.unibas.riumane.modello.composite.AbstractPersona;
import it.unibas.riumane.modello.strategy.AnzianitaPremi;
import it.unibas.riumane.modello.strategy.BenesserePremi;
import it.unibas.riumane.modello.strategy.IStrategy;
import it.unibas.riumane.modello.strategy.PresenzaPremi;
import it.unibas.riumane.modello.strategy.ProduttivitaPremi;
import it.unibas.riumane.modello.visitor.IVisitor;
import it.unibas.riumane.modello.visitor.VisitorPremi;
import it.unibas.riumane.modello.visitor.VisitorStampa;
import it.unibas.riumane.persistenza.DAOMockPersonale;
import it.unibas.riumane.vista.VistaIniziale;
import it.unibas.riumane.vista.VistaNoManager;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class ControlloNoManager implements Serializable {

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaNoManager}")
    private VistaNoManager vista;
    private AbstractPersona managerPrimo;
    private IStrategy strategia;
    
    public void init(){
       managerPrimo = DAOMockPersonale.carica();
    }
    
    public String ricerca(){
        int criterio = vista.getCriterio();
        int valore1 = Integer.parseInt(vista.getValore1());
        int valore2 = Integer.parseInt(vista.getValore2());
        int valore3 = Integer.parseInt(vista.getValore3());

        if(criterio == 1){
            strategia = new ProduttivitaPremi(valore1, valore2);
        }else if(criterio ==2){
            strategia = new PresenzaPremi(valore1, valore3);
        }else if(criterio == 3){
            strategia = new AnzianitaPremi();
        }else if(criterio == 4){
            strategia = new BenesserePremi(valore2);
        }
        IVisitor visitor = new VisitorPremi(strategia);
        managerPrimo.accept(visitor);
        List<AbstractPersona> ris = visitor.getListaNoManager();
        int dimRisultato = ris.size();
        vista.setRisultato(dimRisultato);
        return "/schermoNoManager" + Costanti.REDIRECT;
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaNoManager getVista() {
        return vista;
    }

    public void setVista(VistaNoManager vista) {
        this.vista = vista;
    }

    public AbstractPersona getManagerPrimo() {
        return managerPrimo;
    }

    public void setManagerPrimo(AbstractPersona managerPrimo) {
        this.managerPrimo = managerPrimo;
    }

}
