package it.unibas.riumane.controllo;

import it.unibas.riumane.Costanti;
import it.unibas.riumane.modello.Modello;
import it.unibas.riumane.modello.composite.AbstractPersona;
import it.unibas.riumane.modello.strategy.AssenzeManager;
import it.unibas.riumane.modello.strategy.ComboManager;
import it.unibas.riumane.modello.strategy.IStrategy;
import it.unibas.riumane.modello.strategy.ProduttivitaManager;
import it.unibas.riumane.modello.visitor.IVisitor;
import it.unibas.riumane.modello.visitor.RisultatoTopWorst;
import it.unibas.riumane.modello.visitor.VisitorTopWorst;
import it.unibas.riumane.persistenza.DAOMockPersonale;
import it.unibas.riumane.vista.VistaManager;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;
import javax.faces.bean.SessionScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@ManagedBean
@SessionScoped
public class ControlloManager implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloManager.class);
    
    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaManager}")
    private VistaManager vista;
    private AbstractPersona managerPrimo;
    private IStrategy strategia;
    
    public void init(){
       managerPrimo = DAOMockPersonale.carica();
    }
    
    public String ricerca(){
        boolean top = vista.isTop();
        int size = Integer.parseInt(vista.getDimensione());
        if(vista.getCriterio() == 1){
            strategia = new ProduttivitaManager();
        }else if(vista.getCriterio() == 2){
            strategia = new AssenzeManager();
        }else if(vista.getCriterio() == 3){
            strategia = new ComboManager();
        }
        IVisitor visitor = new VisitorTopWorst(strategia);
        managerPrimo.accept(visitor);
        List<RisultatoTopWorst> listaRisultati = visitor.getRisultato(top, size);
        int dimListaRis = listaRisultati.size();
        vista.setRisultato(dimListaRis);
        logger.debug("|||||||||||||||||||||||||||||||||||||||||||||!" + dimListaRis);
        return "/schermoManager" + Costanti.REDIRECT;
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaManager getVista() {
        return vista;
    }

    public void setVista(VistaManager vista) {
        this.vista = vista;
    }

    public AbstractPersona getManagerPrimo() {
        return managerPrimo;
    }

    public void setManagerPrimo(AbstractPersona managerPrimo) {
        this.managerPrimo = managerPrimo;
    }


    

}
