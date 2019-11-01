package it.unibas.datamasking.modello;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Modello implements Serializable {
    private Utente utente;
    private Verbale verbaleSelezionato;

    public Verbale getVerbaleSelezionato() {
        return verbaleSelezionato;
    }

    public void setVerbaleSelezionato(Verbale verbaleSelezionato) {
        this.verbaleSelezionato = verbaleSelezionato;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

}


