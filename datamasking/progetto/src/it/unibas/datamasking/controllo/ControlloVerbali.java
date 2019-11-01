package it.unibas.datamasking.controllo;

import it.unibas.datamasking.Costanti;
import it.unibas.datamasking.eccezioni.DAOException;
import it.unibas.datamasking.modello.Modello;
import it.unibas.datamasking.modello.Utente;
import it.unibas.datamasking.modello.Verbale;
import it.unibas.datamasking.persistenza.IDAOUtente;
import it.unibas.datamasking.persistenza.IDAOVerbale;
import it.unibas.datamasking.vista.VistaLogin;
import it.unibas.datamasking.vista.VistaVerbali;
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
import java.util.List;

@ManagedBean
@ViewScoped
public class ControlloVerbali implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloVerbali.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaVerbali}")
    private VistaVerbali vista;
    @ManagedProperty(value = "#{dAOVerbaleHibernate}")
    private IDAOVerbale dao;

    public void initBeans() throws DAOException {
        vista.setListaVerbali(dao.findAll());
    }
    
    public String dettagli(){
        Verbale v = vista.getVerbaleSelezionato();
        if(v == null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Seleziona un verbale!"));
            return null;
        }
        modello.setVerbaleSelezionato(v);
        return "/schermoDataMasking" + Costanti.REDIRECT;
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaVerbali getVista() {
        return vista;
    }

    public void setVista(VistaVerbali vista) {
        this.vista = vista;
    }

    public IDAOVerbale getDao() {
        return dao;
    }

    public void setDao(IDAOVerbale dao) {
        this.dao = dao;
    }

    

}
