package it.unibas.scatolificio.controllo;

import it.unibas.scatolificio.Costanti;
import it.unibas.scatolificio.eccezioni.DAOException;
import it.unibas.scatolificio.modello.CartoneDecorator;
import it.unibas.scatolificio.modello.FirmataDecorator;
import it.unibas.scatolificio.modello.GlissettaturaDecorator;
import it.unibas.scatolificio.modello.IscatolificioDecorator;
import it.unibas.scatolificio.modello.Modello;
import it.unibas.scatolificio.modello.NullObjectDecorator;
import it.unibas.scatolificio.modello.PlasticaDecorator;
import it.unibas.scatolificio.modello.PunteggiatturaDecorator;
import it.unibas.scatolificio.modello.Scatola;
import it.unibas.scatolificio.modello.StriaturaDecorator;
import it.unibas.scatolificio.modello.Utente;
import it.unibas.scatolificio.modello.colore.Argento;
import it.unibas.scatolificio.modello.colore.Bronzo;
import it.unibas.scatolificio.modello.colore.Dorato;
import it.unibas.scatolificio.modello.colore.IColore;
import it.unibas.scatolificio.modello.finiture.Foratura;
import it.unibas.scatolificio.modello.finiture.Ifiniture;
import it.unibas.scatolificio.modello.finiture.Martellatura;
import it.unibas.scatolificio.modello.finiture.Quadrettatura;
import it.unibas.scatolificio.persistenza.IDAOScatola;
import it.unibas.scatolificio.persistenza.IDAOUtente;
import it.unibas.scatolificio.vista.VistaIniziale;
import it.unibas.scatolificio.vista.VistaLogin;
import it.unibas.scatolificio.vista.VistaNuova;
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
public class ControlloNuova implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloNuova.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaNuova}")
    private VistaNuova vista;
    @ManagedProperty(value = "#{dAOScatolaHibernate}")
    private IDAOScatola dao;
    private Ifiniture finiture;
    private IColore colore;
    private IscatolificioDecorator decoratore;

    public String salva() throws DAOException{
        decoratore = new NullObjectDecorator();
        if(vista.getCriterioFiniture()==1){
            colore = new Dorato();
        }else if(vista.getCriterioFiniture()==2){
            colore = new Bronzo();
        }else if(vista.getCriterioFiniture()==3){
            colore = new Argento();
        }
        if(vista.getCriterioColore()==1){
            finiture = new Quadrettatura();
        }else if(vista.getCriterioColore()==2){
            finiture = new Foratura();
        }else if(vista.getCriterioColore()==3){
            finiture = new Martellatura();
        }     
        if(vista.getCriterioMateriale() == 1){
            decoratore = new CartoneDecorator(finiture, colore, decoratore);
        }else if(vista.getCriterioMateriale() == 2){
            decoratore = new PlasticaDecorator(decoratore, colore, finiture);
        }
        if(vista.isGlisettatura()){
            decoratore = new GlissettaturaDecorator(decoratore);
        }
        if(vista.isPunteggiatura()){
            decoratore = new PunteggiatturaDecorator(decoratore);
        }
        if(vista.isStriatura()){
            decoratore = new StriaturaDecorator(decoratore);
        }
        if(vista.isFirmata()){
            decoratore = new FirmataDecorator(decoratore);
        }
        String descrizione = decoratore.getNome();
        String codice = decoratore.getCodice();
        double prezzo = decoratore.getPrezzo();
        Scatola s = new Scatola(prezzo, codice, descrizione);
        dao.makePersistent(s);
        return "/schermoIniziale" + Costanti.REDIRECT;
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaNuova getVista() {
        return vista;
    }

    public void setVista(VistaNuova vista) {
        this.vista = vista;
    }

    public IDAOScatola getDao() {
        return dao;
    }

    public void setDao(IDAOScatola dao) {
        this.dao = dao;
    }
    
    
    
}
