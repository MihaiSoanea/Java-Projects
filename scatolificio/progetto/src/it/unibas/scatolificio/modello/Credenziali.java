package it.unibas.scatolificio.modello;

import java.io.Serializable;

public class Credenziali implements Serializable {

    private String nomeUtente;
    private String password;

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
}
