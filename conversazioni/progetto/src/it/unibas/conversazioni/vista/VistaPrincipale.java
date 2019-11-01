package it.unibas.conversazioni.vista;

import it.unibas.conversazioni.modello.Canale;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VistaPrincipale implements Serializable {

    private Canale canale;
    private String nomeUtente;
    private List<Canale> canali = new ArrayList<Canale>();

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public List<Canale> getCanali() {
        return canali;
    }

    public void setCanali(List<Canale> canali) {
        this.canali = canali;
    }

    public Canale getCanale() {
        return canale;
    }

    public void setCanale(Canale canale) {
        System.out.println("Dalla Vista, canale ->" + canale.getNome());
        this.canale = canale;
    }
   
}

