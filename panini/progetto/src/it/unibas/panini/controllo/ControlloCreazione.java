package it.unibas.panini.controllo;

import it.unibas.panini.Costanti;
import it.unibas.panini.eccezioni.DAOException;
import it.unibas.panini.modello.Bresaola;
import it.unibas.panini.modello.Crudo;
import it.unibas.panini.modello.Focaccia;
import it.unibas.panini.modello.Francesina;
import it.unibas.panini.modello.IingredienteDecorator;
import it.unibas.panini.modello.Ketchup;
import it.unibas.panini.modello.Maionese;
import it.unibas.panini.modello.NullObject;
import it.unibas.panini.modello.Panino;
import it.unibas.panini.modello.Worcester;
import it.unibas.panini.modello.sigla.DOP;
import it.unibas.panini.modello.sigla.IGP;
import it.unibas.panini.persistenza.IDAOPanino;
import it.unibas.panini.vista.VistaCreazione;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.HashSet;

@ManagedBean
@SessionScoped
public class ControlloCreazione implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloCreazione.class);

    @ManagedProperty(value = "#{vistaCreazione}")
    private VistaCreazione vista;
    @ManagedProperty(value = "#{dAOPaninoHibernate}")
    private IDAOPanino daoPanino;
    
    public void initBeans(){ 
    }
    
    public String crea() throws DAOException{
        IingredienteDecorator decoratore = new NullObject();
        int pane = vista.getPane();
        int salume = vista.getSalume();
        if(pane == 1){
            decoratore = new Focaccia(decoratore);
        }else if(pane == 2){
            decoratore = new Francesina(decoratore);
        }
        if(salume == 1){
            decoratore = new Bresaola(new DOP(),"AFa","faf",3, decoratore);
        }else if(salume == 2){
            decoratore = new Crudo(new IGP(),"AFa","faf",3, decoratore);
        }
        if(vista.isMayo() == true){
            decoratore = new Maionese(decoratore);
        }
        if(vista.isKetchup()==true){
            decoratore = new Ketchup(decoratore);
        }
        if(vista.isWinchester()==true){
            decoratore = new Worcester(decoratore);
        }
        String nome = decoratore.getTitolo();
        vista.setNome(nome);
        HashSet<String> ingredient = decoratore.getIngredienti();
        vista.setIngredienti(ingredient.toString());
        double prezzo = decoratore.getPrezzo();
        vista.setPrezzo(prezzo);
        Panino p = new Panino(nome, prezzo, ingredient.toString());
        daoPanino.makePersistent(p);
        return "/schermoPanini" + Costanti.REDIRECT;
    }


    public VistaCreazione getVista() {
        return vista;
    }

    public void setVista(VistaCreazione vista) {
        this.vista = vista;
    }

    public IDAOPanino getDaoPanino() {
        return daoPanino;
    }

    public void setDaoPanino(IDAOPanino daoPanino) {
        this.daoPanino = daoPanino;
    }
    
    
}
