package it.unibas.ricercabrani.controllo;

import it.unibas.ricercabrani.Costanti;
import it.unibas.ricercabrani.eccezioni.DAOException;
import it.unibas.ricercabrani.modello.Brano;
import it.unibas.ricercabrani.modello.Modello;
import it.unibas.ricercabrani.modello.Ricerca;
import it.unibas.ricercabrani.modello.Utente;
import it.unibas.ricercabrani.modello.chain.GestoreChainDinamica;
import it.unibas.ricercabrani.modello.chain.GestoreChainStatica;
import it.unibas.ricercabrani.modello.chain.IHandlerAbstract;
import it.unibas.ricercabrani.persistenza.DAOBrani;
import it.unibas.ricercabrani.persistenza.IDAORicerca;
import it.unibas.ricercabrani.persistenza.IDAOUtente;
import it.unibas.ricercabrani.vista.VistaLogin;
import it.unibas.ricercabrani.vista.VistaRicerca;
import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import org.primefaces.component.calendar.Calendar;

@ManagedBean
@SessionScoped
public class ControlloRicerca implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloRicerca.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaRicerca}")
    private VistaRicerca vista;
    @ManagedProperty(value = "#{dAORicercaHibernate}")
    private IDAORicerca dao;
    private Brano brano;
    
    
    public String ricerca() throws DAOException{
        String r = vista.getRicercaInserita();
        GestoreChainStatica g = new GestoreChainStatica();
        List<IHandlerAbstract> listaHandler = g.getChainDinamica(r);
        GestoreChainDinamica d = new GestoreChainDinamica();
        d.setListaHandlerRicerca(listaHandler);
        HashSet<Brano> risultato = d.ricerca();
        List<Brano> trovati = new ArrayList<Brano>(risultato);
        vista.setListaBrani(trovati);
        int size = trovati.size();
        for(int i = 0; i< size; i++){
            if(trovati.get(i).getData().get(GregorianCalendar.YEAR) == GregorianCalendar.getInstance().get(GregorianCalendar.YEAR)){
                vista.setStringaVerifica("font-weight: bold");
            }else{
                vista.setStringaVerifica("font-weight: normal");
            }
        }
        Ricerca ricercaDaSalvare = new Ricerca(r,size);
        dao.makePersistent(ricercaDaSalvare);
        return "/schermoRicerca" + Costanti.REDIRECT;
    }


    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaRicerca getVista() {
        return vista;
    }

    public void setVista(VistaRicerca vista) {
        this.vista = vista;
    }

    public IDAORicerca getDao() {
        return dao;
    }

    public void setDao(IDAORicerca dao) {
        this.dao = dao;
    }

    
    
}
