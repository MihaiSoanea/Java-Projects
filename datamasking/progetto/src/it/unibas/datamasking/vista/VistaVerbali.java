package it.unibas.datamasking.vista;

import it.unibas.datamasking.modello.Credenziali;
import it.unibas.datamasking.modello.Verbale;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class VistaVerbali implements Serializable {

    private List<Verbale> listaVerbali;
    private Verbale verbaleSelezionato;

    public List<Verbale> getListaVerbali() {
        return listaVerbali;
    }

    public void setListaVerbali(List<Verbale> listaVerbali) {
        this.listaVerbali = listaVerbali;
    }

    public Verbale getVerbaleSelezionato() {
        return verbaleSelezionato;
    }

    public void setVerbaleSelezionato(Verbale verbaleSelezionato) {
        this.verbaleSelezionato = verbaleSelezionato;
    }
    
    

}

