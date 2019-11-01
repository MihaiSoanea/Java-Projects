package it.unibas.aer.controllo;

import it.unibas.aer.Costanti;
import it.unibas.aer.eccezioni.DAOException;
import it.unibas.aer.modello.Modello;
import it.unibas.aer.modello.Volo;
import it.unibas.aer.modello.state.CancellatoState;
import it.unibas.aer.modello.state.IState;
import it.unibas.aer.modello.state.PartitoState;
import it.unibas.aer.modello.strategy.IStrategy;
import it.unibas.aer.persistenza.IDAOVolo;
import it.unibas.aer.vista.VistaAdmin;
import it.unibas.aer.vista.VistaModifica;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@ManagedBean
@ViewScoped
public class ControlloModifica implements Serializable {
    
    private static transient Log logger = LogFactory.getLog(ControlloModifica.class);

    @ManagedProperty(value= "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaModifica}")
    private VistaModifica vista;
    private Volo v;

    public void initBeans(){
        v = modello.getVoloSelezionato();
    }
    
    public String cancellato(){
        String descrizione = vista.getDescrizione();
        v.impostaCancellato(descrizione);
        return "/schermoAdmin" + Costanti.REDIRECT;
    }
    
    public String partito(){
        int ora = Integer.parseInt(vista.getOra());
        int minuti = Integer.parseInt(vista.getMinuti());
        GregorianCalendar orario = new GregorianCalendar(2018, 5, 22, ora, minuti);
        v.setOrarioEffettivo(orario);
        v.impostaPartito(orario);
        
        return "/schermoAdmin" + Costanti.REDIRECT;
    }
    
    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaModifica getVista() {
        return vista;
    }

    public void setVista(VistaModifica vista) {
        this.vista = vista;
    }

 
}
