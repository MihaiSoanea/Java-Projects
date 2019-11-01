package it.unibas.riumane.vista;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class VistaNoManager implements Serializable {

    private int criterio = 1;
    private String valore1 = "", valore2= "", valore3 = "";
    private int risultato;
    
    

    public int getCriterio() {
        return criterio;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }

    public String getValore1() {
        return valore1;
    }

    public void setValore1(String valore1) {
        this.valore1 = valore1;
    }

    public String getValore2() {
        return valore2;
    }

    public void setValore2(String valore2) {
        this.valore2 = valore2;
    }

    public int getRisultato() {
        return risultato;
    }

    public void setRisultato(int risultato) {
        this.risultato = risultato;
    }

    public String getValore3() {
        return valore3;
    }

    public void setValore3(String valore3) {
        this.valore3 = valore3;
    }
    
    
    
}

