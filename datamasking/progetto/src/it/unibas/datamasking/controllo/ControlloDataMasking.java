package it.unibas.datamasking.controllo;

import it.unibas.datamasking.Costanti;
import it.unibas.datamasking.eccezioni.DAOException;
import it.unibas.datamasking.modello.Modello;
import it.unibas.datamasking.modello.Utente;
import it.unibas.datamasking.modello.Verbale;
import it.unibas.datamasking.modello.chain.GestoreChain;
import it.unibas.datamasking.modello.strategy.IStrategy;
import it.unibas.datamasking.modello.strategy.StrategyDynamic;
import it.unibas.datamasking.modello.strategy.StrategyPersistence;
import it.unibas.datamasking.persistenza.IDAOUtente;
import it.unibas.datamasking.persistenza.IDAOVerbale;
import it.unibas.datamasking.vista.VistaDataMasking;
import it.unibas.datamasking.vista.VistaLogin;
import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@ManagedBean
@SessionScoped
public class ControlloDataMasking implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloDataMasking.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaDataMasking}")
    private VistaDataMasking vista;
    @ManagedProperty(value = "#{dAOVerbaleHibernate}")
    private IDAOVerbale dao;
    private Verbale v;
    private IStrategy strategia;
    private GestoreChain g = new GestoreChain();
    
    public void initBeans(){
        v = modello.getVerbaleSelezionato();
        vista.setVerbaleSelezionato(v);
        vista.setDataVerbale(v.getDataFormattata());
        vista.setTestoVerbale(v.getTesto());
        vista.setTitoloVerbale(v.getNome());
    }
    
    public String modifica(){
        String nome = vista.getTitolo();
        if(nome != null ){
            v.setNome(nome);
        }
        String testo = vista.getTesto();
        if(testo != null){
            v.setTesto(testo);
        }
        Date data = vista.getData();
        Calendar date = new GregorianCalendar();
        if(data != null){
            date.setTime(data);
            v.setData(date);
        }
        return "/schermoDataMasking" + Costanti.REDIRECT;
    }
    
    public String oscura(){
        if(vista.getCriterio() == 1){
            strategia = new StrategyDynamic(g);
        }else if(vista.getCriterio() == 2){
            strategia = new StrategyPersistence(g);
        }
        String risultato = strategia.elabora(modello.getVerbaleSelezionato());
        logger.debug(risultato);
        vista.setRisultato(risultato);
        return "/schermoDataMasking" + Costanti.REDIRECT;
    }
    
    public String home(){
        return "/schermoVerbali" + Costanti.REDIRECT;
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaDataMasking getVista() {
        return vista;
    }

    public void setVista(VistaDataMasking vista) {
        this.vista = vista;
    }

    public IDAOVerbale getDao() {
        return dao;
    }

    public void setDao(IDAOVerbale dao) {
        this.dao = dao;
    }
    
    

}
