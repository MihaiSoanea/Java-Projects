package it.unibas.conversazioni.controllo;

import it.unibas.conversazioni.Costanti;
import it.unibas.conversazioni.eccezioni.DAOException;
import it.unibas.conversazioni.modello.Modello;
import it.unibas.conversazioni.modello.Utente;
import it.unibas.conversazioni.persistenza.IDAOUtente;
import it.unibas.conversazioni.vista.VistaLogin;
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
public class ControlloLogin implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloLogin.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaLogin}")
    private VistaLogin vista;
    @ManagedProperty(value = "#{dAOUtenteHibernate}")
    private IDAOUtente daoUtente;
    private String messaggio;
    private String errore;

    public void initBeans() {
    }

    public String verifica() {
        Utente utente = null;
        try {
            utente = getDaoUtente().findByNomeUtente(vista.getCredenziali().getNomeUtente());
        } catch (DAOException sqle) {
            logger.error(sqle);
            FacesContext.getCurrentInstance().addMessage("formLogin:nomeUtente", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Errore db", "Errore nell'accesso al db" + sqle.getMessage()));
            FacesContext.getCurrentInstance().addMessage("formLogin:pwd", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Errore db", "Errore nell'accesso al db"));
            return null;
        }
        logger.debug("+++ Accesso effettuato dall'utente: " + vista.getCredenziali().getNomeUtente());
        modello.setUtente(utente);
        utente.setLastLogin(new GregorianCalendar());
        try {
            daoUtente.save(utente);
        } catch (DAOException ex) {
            logger.error("\n @@@ [ControlloLogin] " + ex.getMessage());
        }
        return "/schermoPrincipale" + Costanti.REDIRECT;
    }

    public String loginAmministratore() {
        Utente utente = new Utente();
        utente.setNomeUtente("amministratore");
        utente.setRuolo("amministratore");
        utente.setNome("Amministratore");
        modello.setUtente(utente);
        return "/admin/schermoAmministratore" + Costanti.REDIRECT;
    }

    public String esci() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "/schermoLogin" + Costanti.REDIRECT;
    }

    // GET e SET
    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaLogin getVista() {
        return vista;
    }

    public void setVista(VistaLogin vista) {
        this.vista = vista;
    }

    public IDAOUtente getDaoUtente() {
        return daoUtente;
    }

    public void setDaoUtente(IDAOUtente daoUtente) {
        this.daoUtente = daoUtente;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getErrore() {
        return errore;
    }

    public void setErrore(String errore) {
        this.errore = errore;
    }

    private String getSchermoDefaultByRuolo(String ruolo) {
        if (ruolo.equals("amministratore")) {
            return "/admin/schermoAmministratore" + Costanti.REDIRECT;
        } 
        return "/schermoLogin";
    }

}
