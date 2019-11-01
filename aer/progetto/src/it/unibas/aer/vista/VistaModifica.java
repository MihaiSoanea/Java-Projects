package it.unibas.aer.vista;

import it.unibas.aer.modello.Volo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.annotation.PostConstruct;

@ManagedBean
@ViewScoped
public class VistaModifica implements Serializable {

   private String descrizione;
   private String ora, minuti;


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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

