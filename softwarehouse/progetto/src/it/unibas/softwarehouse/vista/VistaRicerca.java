package it.unibas.softwarehouse.vista;

import it.unibas.softwarehouse.modello.Credenziali;
import it.unibas.softwarehouse.modello.composite.Pagina;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class VistaRicerca implements Serializable {

    private List<Pagina> listaPagine;
    private int criterio = 1;

    public int getCriterio() {
        return criterio;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }

    public List<Pagina> getListaPagine() {
        return listaPagine;
    }

    public void setListaPagine(List<Pagina> listaPagine) {
        this.listaPagine = listaPagine;
    }
    
    
    
}

