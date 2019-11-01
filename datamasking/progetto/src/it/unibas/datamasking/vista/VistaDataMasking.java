package it.unibas.datamasking.vista;

import it.unibas.datamasking.modello.Credenziali;
import it.unibas.datamasking.modello.Verbale;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

@ManagedBean
@SessionScoped
public class VistaDataMasking implements Serializable {

   private String titolo, testo, risultato, titoloVerbale, testoVerbale, dataVerbale;
   private Date data;
   private int criterio = 1;
   private Verbale verbaleSelezionato;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getRisultato() {
        return risultato;
    }

    public void setRisultato(String risultato) {
        this.risultato = risultato;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCriterio() {
        return criterio;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }

    public Verbale getVerbaleSelezionato() {
        return verbaleSelezionato;
    }

    public void setVerbaleSelezionato(Verbale verbaleSelezionato) {
        this.verbaleSelezionato = verbaleSelezionato;
    }

    public String getTitoloVerbale() {
        return titoloVerbale;
    }

    public void setTitoloVerbale(String titoloVerbale) {
        this.titoloVerbale = titoloVerbale;
    }

    public String getTestoVerbale() {
        return testoVerbale;
    }

    public void setTestoVerbale(String testoVerbale) {
        this.testoVerbale = testoVerbale;
    }

    public String getDataVerbale() {
        return dataVerbale;
    }

    public void setDataVerbale(String dataVerbale) {
        this.dataVerbale = dataVerbale;
    }
   
    

}

