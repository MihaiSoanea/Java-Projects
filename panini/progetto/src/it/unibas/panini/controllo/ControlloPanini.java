package it.unibas.panini.controllo;

import it.unibas.panini.Costanti;
import it.unibas.panini.eccezioni.DAOException;
import it.unibas.panini.modello.Panino;
import it.unibas.panini.persistenza.IDAOPanino;
import it.unibas.panini.vista.VistaPanini;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;

@ManagedBean
@ViewScoped
public class ControlloPanini implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloPanini.class);

    @ManagedProperty(value = "#{vistaPanini}")
    private VistaPanini vista;
    @ManagedProperty(value = "#{dAOPaninoHibernate}")
    private IDAOPanino daoPanino;


    public void initBeans() throws DAOException {
        List<Panino> lista = daoPanino.findAll();
        vista.setListaPanini(lista);
    }

    public String elimina() throws DAOException{
        Panino p = vista.getSelezionato();
        daoPanino.makeTransient(p);
        return "/schermoPanini" + Costanti.REDIRECT;
    }

    public VistaPanini getVista() {
        return vista;
    }

    public void setVista(VistaPanini vista) {
        this.vista = vista;
    }

    public IDAOPanino getDaoPanino() {
        return daoPanino;
    }

    public void setDaoPanino(IDAOPanino daoPanino) {
        this.daoPanino = daoPanino;
    }
    
    

}
