package it.unibas.aer.vista;

import it.unibas.aer.modello.Volo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class VistaPasseggeri implements Serializable {

   private List<Volo> listaVoli;

    public List<Volo> getListaVoli() {
        return listaVoli;
    }

    public void setListaVoli(List<Volo> listaVoli) {
        this.listaVoli = listaVoli;
    }

   
   

}

