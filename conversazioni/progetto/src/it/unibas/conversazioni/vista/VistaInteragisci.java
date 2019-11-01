package it.unibas.conversazioni.vista;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@SessionScoped
public class VistaInteragisci implements Serializable {

    private String nomeCanale, dataCreazione, messaggio;
    private int totaleIscritti;

    public String getNomeCanale() {
        return nomeCanale;
    }

    public void setNomeCanale(String nomeCanale) {
        this.nomeCanale = nomeCanale;
    }

    public String getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(String dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public int getTotaleIscritti() {
        return totaleIscritti;
    }

    public void setTotaleIscritti(int totaleIscritti) {
        this.totaleIscritti = totaleIscritti;
    }
    
    

}

