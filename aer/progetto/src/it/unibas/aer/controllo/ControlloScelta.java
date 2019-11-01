package it.unibas.aer.controllo;

import it.unibas.aer.Costanti;
import it.unibas.aer.eccezioni.DAOException;
import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Modello;
import it.unibas.aer.modello.Volo;
import it.unibas.aer.modello.strategy.IStrategy;
import it.unibas.aer.modello.strategy.PannelloPasseggeriStrategy;
import it.unibas.aer.persistenza.IDAOVolo;
import it.unibas.aer.vista.VistaScelta;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@ManagedBean
@ViewScoped
public class ControlloScelta implements Serializable {

    @ManagedProperty(value= "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaScelta}")
    private VistaScelta vista;
    @ManagedProperty(value="#{dAOVoloHibernate}")
    private IDAOVolo dAOVolo;
    private List<Volo> listaV = new ArrayList<Volo>();
    private Aereoporto a;
    
     private static transient Log logger = LogFactory.getLog(ControlloScelta.class);
    
    public void initBeans() throws DAOException{
        listaV = dAOVolo.findAll();
        a = new Aereoporto("Aereoporto di Napoli");
        a.setOrarioDiBase(new GregorianCalendar(2018,5,22,10, 0 ));
        a.setListaVoli(listaV);
        
        modello.setAereoporto(a);
        modello.setListaVoli(a.getListaVoli());
    }

    public String conferma(){    
        logger.debug("|||||||||||||||||" + a.getOrarioDiBase().toString());
        logger.debug("|||||||||||||||||" + listaV.get(0).getOrarioPrevisto().toString());
        a.settaOraEMinuti(Integer.parseInt(vista.getOra()),Integer.parseInt(vista.getMinuti()));
        if(vista.getCriterio() == 2){
            return "/schermoPasseggeri"+Costanti.REDIRECT;
        }
        return "/schermoAdmin" + Costanti.REDIRECT;
    }
    

    public Modello getModello() {
        return modello;
    }
    

    public VistaScelta getVista() {
        return vista;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public void setVista(VistaScelta vista) {
        this.vista = vista;
    }

    public IDAOVolo getdAOVolo() {
        return dAOVolo;
    }

    public void setdAOVolo(IDAOVolo dAOVolo) {
        this.dAOVolo = dAOVolo;
    }

    public List<Volo> getListaV() {
        return listaV;
    }

    public void setListaV(List<Volo> listaV) {
        this.listaV = listaV;
    }
    
 
    
    
}
