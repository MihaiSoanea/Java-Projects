package it.unibas.softwarehouse.controllo;

import it.unibas.softwarehouse.Costanti;
import it.unibas.softwarehouse.modello.Modello;
import it.unibas.softwarehouse.modello.composite.AbstractNodo;
import it.unibas.softwarehouse.modello.composite.Pagina;
import it.unibas.softwarehouse.modello.strategy.IStrategy;
import it.unibas.softwarehouse.modello.strategy.PagineEstereStrategy;
import it.unibas.softwarehouse.modello.strategy.PagineItaliaStrategy;
import it.unibas.softwarehouse.modello.visitor.IVisitor;
import it.unibas.softwarehouse.modello.visitor.VisitorStrategia;
import it.unibas.softwarehouse.persistenza.DAOMockPortale;
import it.unibas.softwarehouse.vista.VistaRicerca;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;

@ManagedBean
@SessionScoped
public class ControlloRicerca implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloRicerca.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaRicerca}")
    private VistaRicerca vista;
    private AbstractNodo portale;
    private IStrategy strategia;
    private IVisitor visitor;
;   
    public void init(){
       
    }
    
    
    public String ricerca(){ 
        if(vista.getCriterio()==1){
            strategia = new PagineItaliaStrategy(51);
        }else if(vista.getCriterio()==2){
            strategia = new PagineEstereStrategy(51);
        }
        portale = DAOMockPortale.carica();
        visitor = new VisitorStrategia(strategia);
        portale.accept(visitor);
        List<Pagina> lista = visitor.getListaPagineTrovate();

        vista.setListaPagine(lista);
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

    public AbstractNodo getPortale() {
        return portale;
    }

    public void setPortale(AbstractNodo portale) {
        this.portale = portale;
    }

    

    
    
    

}
