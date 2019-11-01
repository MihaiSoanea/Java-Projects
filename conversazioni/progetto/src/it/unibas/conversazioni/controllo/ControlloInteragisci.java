package it.unibas.conversazioni.controllo;

import it.unibas.conversazioni.Costanti;
import it.unibas.conversazioni.modello.Canale;
import it.unibas.conversazioni.modello.Modello;
import it.unibas.conversazioni.persistenza.IDAOIstruzione;
import it.unibas.conversazioni.vista.VistaInteragisci;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@ManagedBean
@SessionScoped
public class ControlloInteragisci implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloInteragisci.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaInteragisci}")
    private VistaInteragisci vista;
    @ManagedProperty(value = "#{dAOIstruzioneHibernate}")
    private IDAOIstruzione daoIstruzione;
    

    public void initBeans() {
        Canale c = modello.getCanale();
        vista.setNomeCanale(c.getNome());
        vista.setDataCreazione(c.getDataFormattata());
    }
    
    public void invia(){
        
    }
    
    public String utentiAttivi(){
        return "/schermoInteragisci" + Costanti.REDIRECT;
    }

    public String esci(){
        return "/schermoLogin" + Costanti.REDIRECT;
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaInteragisci getVista() {
        return vista;
    }

    public void setVista(VistaInteragisci vista) {
        this.vista = vista;
    }

    public IDAOIstruzione getDaoIstruzione() {
        return daoIstruzione;
    }

    public void setDaoIstruzione(IDAOIstruzione daoIstruzione) {
        this.daoIstruzione = daoIstruzione;
    }

    
}
