package it.unibas.conversazioni.modello;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Modello implements Serializable {
    private Utente utente;
    private Map<String, Canale> mappaCanali;
    private Canale canale;

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Map<String, Canale> getMappaCanali() {
        return mappaCanali;
    }

    public void setMappaCanali(Map<String, Canale> mappaCanali) {
        this.mappaCanali = mappaCanali;
    }

    public Canale getCanale() {
        return canale;
    }

    public void setCanale(Canale canale) {
        this.canale = canale;
    }
    
    

}


