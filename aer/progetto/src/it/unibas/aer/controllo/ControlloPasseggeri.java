package it.unibas.aer.controllo;

import it.unibas.aer.Costanti;
import it.unibas.aer.eccezioni.DAOException;
import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Modello;
import it.unibas.aer.modello.Volo;
import it.unibas.aer.modello.strategy.IStrategy;
import it.unibas.aer.modello.strategy.PannelloPasseggeriStrategy;
import it.unibas.aer.persistenza.DAOMockAereoporto;
import it.unibas.aer.persistenza.IDAOVolo;
import it.unibas.aer.vista.VistaPasseggeri;
import it.unibas.aer.vista.VistaScelta;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class ControlloPasseggeri implements Serializable {

    @ManagedProperty(value= "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaPasseggeri}")
    private VistaPasseggeri vista;
    @ManagedProperty(value = "#{dAOVoloHibernate}")
    private IDAOVolo daoVolo;
    private IStrategy strategy = new PannelloPasseggeriStrategy();
    
    public void initBeans() throws DAOException{
        List<Volo> lista = modello.getListaVoli();
        List<Volo> listaTrovati = strategy.visualizzaPannello(lista);
        vista.setListaVoli(listaTrovati);
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaPasseggeri getVista() {
        return vista;
    }

    public void setVista(VistaPasseggeri vista) {
        this.vista = vista;
    }

    public IDAOVolo getDaoVolo() {
        return daoVolo;
    }

    public void setDaoVolo(IDAOVolo daoVolo) {
        this.daoVolo = daoVolo;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    
}
