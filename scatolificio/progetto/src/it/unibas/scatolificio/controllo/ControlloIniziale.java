package it.unibas.scatolificio.controllo;

import it.unibas.scatolificio.Costanti;
import it.unibas.scatolificio.eccezioni.DAOException;
import it.unibas.scatolificio.modello.Modello;
import it.unibas.scatolificio.modello.Scatola;
import it.unibas.scatolificio.modello.Utente;
import it.unibas.scatolificio.persistenza.IDAOScatola;
import it.unibas.scatolificio.persistenza.IDAOUtente;
import it.unibas.scatolificio.vista.VistaIniziale;
import it.unibas.scatolificio.vista.VistaLogin;
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
public class ControlloIniziale implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloIniziale.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaIniziale}")
    private VistaIniziale vista;
    @ManagedProperty(value = "#{dAOScatolaHibernate}")
    private IDAOScatola dao;


    public void initBeans() throws DAOException {
        List<Scatola> listaScatole = dao.findAll();
        vista.setListaScatole(listaScatole);
    }
    
    public String aggiungi(){
        return "/schermoNuova" + Costanti.REDIRECT;
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

    public IDAOScatola getDao() {
        return dao;
    }

    public void setDao(IDAOScatola dao) {
        this.dao = dao;
    }

    
}
