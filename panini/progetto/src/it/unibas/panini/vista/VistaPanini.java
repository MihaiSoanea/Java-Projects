package it.unibas.panini.vista;

import it.unibas.panini.modello.Credenziali;
import it.unibas.panini.modello.Panino;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class VistaPanini implements Serializable {

    private Panino selezionato;
    private List<Panino> listaPanini;

    public Panino getSelezionato() {
        return selezionato;
    }

    public void setSelezionato(Panino selezionato) {
        this.selezionato = selezionato;
    }

    public List<Panino> getListaPanini() {
        return listaPanini;
    }

    public void setListaPanini(List<Panino> listaPanini) {
        this.listaPanini = listaPanini;
    }
    
    
}

