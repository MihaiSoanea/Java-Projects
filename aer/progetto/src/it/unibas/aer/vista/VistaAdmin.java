package it.unibas.aer.vista;

import it.unibas.aer.modello.Volo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;
import java.util.List;

@ManagedBean
@ViewScoped
public class VistaAdmin implements Serializable {

   private Volo voloSelezionato;
   private List<Volo> listaVoli;



    public List<Volo> getListaVoli() {
        return listaVoli;
    }

    public void setListaVoli(List<Volo> listaVoli) {
        this.listaVoli = listaVoli;
    }

    public Volo getVoloSelezionato() {
        return voloSelezionato;
    }

    public void setVoloSelezionato(Volo voloSelezionato) {
        this.voloSelezionato = voloSelezionato;
    }

   
   

}

