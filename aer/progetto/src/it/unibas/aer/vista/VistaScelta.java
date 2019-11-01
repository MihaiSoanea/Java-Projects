package it.unibas.aer.vista;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

@ManagedBean
@ViewScoped
public class VistaScelta implements Serializable {

    private String ora= " ", minuti= " ";
    private int criterio = 1;

    public int getCriterio() {
        return criterio;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }


    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getMinuti() {
        return minuti;
    }

    public void setMinuti(String minuti) {
        this.minuti = minuti;
    }


   
   

}

