/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello;

import it.unibas.softwarehouse.modello.composite.Pagina;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mihai Soanea
 */
@Entity(name="view")
public class View {
    
    private Long id;
    private Pagina pagina;
    private String paese, urlArrivo, urlDestinazione, browser;
    private int tempoSecondi;

    public View(String paese, String urlArrivo, String urlDestinazione, String browser, int tempoSecondi) {
        this.paese = paese;
        this.urlArrivo = urlArrivo;
        this.urlDestinazione = urlDestinazione;
        this.browser = browser;
        this.tempoSecondi = tempoSecondi;
    }

    public View() {
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public String getUrlArrivo() {
        return urlArrivo;
    }

    public void setUrlArrivo(String urlArrivo) {
        this.urlArrivo = urlArrivo;
    }

    public String getUrlDestinazione() {
        return urlDestinazione;
    }

    public void setUrlDestinazione(String urlDestinazione) {
        this.urlDestinazione = urlDestinazione;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public int getTempoSecondi() {
        return tempoSecondi;
    }

    public void setTempoSecondi(int tempoSecondi) {
        this.tempoSecondi = tempoSecondi;
    }

    @Id @GeneratedValue(strategy=GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne
    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }
    
    
    
}
