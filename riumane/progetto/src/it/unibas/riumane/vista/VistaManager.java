package it.unibas.riumane.vista;


import it.unibas.riumane.modello.visitor.RisultatoTopWorst;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class VistaManager implements Serializable {

      private int criterio=1;
      private String dimensione;
      private boolean top;
      private int risultato;

    public int getCriterio() {
        return criterio;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public int getRisultato() {
        return risultato;
    }

    public void setRisultato(int risultato) {
        this.risultato = risultato;
    }
   
}

