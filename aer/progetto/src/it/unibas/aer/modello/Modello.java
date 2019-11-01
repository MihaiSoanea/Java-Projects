package it.unibas.aer.modello;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class Modello implements Serializable {
    private Utente utente;
    private Aereoporto aereoporto;
    private List<Volo> listaVoli;
    private Volo voloSelezionato;

    public Volo getVoloSelezionato() {
        return voloSelezionato;
    }

    public void setVoloSelezionato(Volo voloSelezionato) {
        this.voloSelezionato = voloSelezionato;
    }
    

    public Aereoporto getAereoporto() {
        return aereoporto;
    }

    public void setAereoporto(Aereoporto aereoporto) {
        this.aereoporto = aereoporto;
    }

    public List<Volo> getListaVoli() {
        return listaVoli;
    }

    public void setListaVoli(List<Volo> listaVoli) {
        this.listaVoli = listaVoli;
    }
    
    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

}


