package it.unibas.aer.controllo;

import it.unibas.aer.Costanti;
import it.unibas.aer.eccezioni.DAOException;
import it.unibas.aer.modello.Modello;
import it.unibas.aer.modello.Volo;
import it.unibas.aer.modello.strategy.IStrategy;
import it.unibas.aer.persistenza.IDAOVolo;
import it.unibas.aer.vista.VistaAdmin;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ControlloAdmin implements Serializable {

    @ManagedProperty(value= "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaAdmin}")
    private VistaAdmin vista;
    @ManagedProperty(value = "#{dAOVoloHibernate}")
    private IDAOVolo daoVolo;

    public void initBeans() throws DAOException{
        List<Volo> listaVoli = modello.getListaVoli();
        vista.setListaVoli(listaVoli);
    }
    
    public String modifica(){
        Volo voloSelezionato = vista.getVoloSelezionato();
        if(voloSelezionato==null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Seleziona un volo"));
            return null;
        }
        modello.setVoloSelezionato(voloSelezionato);
        return "/schermoModifica" + Costanti.REDIRECT;
    }


    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaAdmin getVista() {
        return vista;
    }

    public void setVista(VistaAdmin vista) {
        this.vista = vista;
    }

    public IDAOVolo getDaoVolo() {
        return daoVolo;
    }

    public void setDaoVolo(IDAOVolo daoVolo) {
        this.daoVolo = daoVolo;
    }


    
 
}
