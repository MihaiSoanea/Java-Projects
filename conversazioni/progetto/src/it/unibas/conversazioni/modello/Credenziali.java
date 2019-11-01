package it.unibas.conversazioni.modello;

import java.io.Serializable;

public class Credenziali implements Serializable {

    private String nomeUtente;

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

}
