package it.unibas.riumane.controllo;

import it.unibas.riumane.Costanti;
import it.unibas.riumane.eccezioni.DAOException;
import it.unibas.riumane.modello.Modello;
import it.unibas.riumane.modello.Utente;
import it.unibas.riumane.modello.composite.AbstractPersona;
import it.unibas.riumane.modello.visitor.IVisitor;
import it.unibas.riumane.modello.visitor.VisitorStampa;
import it.unibas.riumane.persistenza.DAOMockPersonale;
import it.unibas.riumane.persistenza.IDAOUtente;
import it.unibas.riumane.vista.VistaIniziale;
import it.unibas.riumane.vista.VistaLogin;
import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@ManagedBean
@ViewScoped
public class ControlloIniziale implements Serializable {

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaIniziale}")
    private VistaIniziale vista;
    
    public void init(){
       AbstractPersona managerPrimo = DAOMockPersonale.carica();
       IVisitor visitor = new VisitorStampa();
       managerPrimo.accept(visitor);
       String ris = visitor.getSb();
       vista.setRisultato(ris);

    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaIniziale getVista() {
        return vista;
    }

    public void setVista(VistaIniziale vista) {
        this.vista = vista;
    }
  

    

}
