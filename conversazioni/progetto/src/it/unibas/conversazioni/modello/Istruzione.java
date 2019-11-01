/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.modello;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Transient;

/**
 *
 * @author Mihai Soanea
 */
@Entity(name="istruzione")
public class Istruzione {
    
    private Long id;
    private String utente;
    private String comando;
    private String nomeCanale;
    private String messaggio;

    public Istruzione(String utente, String comando, String nomeCanale, String messaggio) {
        this.utente = utente;
        this.comando = comando;
        this.nomeCanale = nomeCanale;
        this.messaggio = messaggio;
    }

    public Istruzione() {
    }

    @Id@GeneratedValue(strategy=GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public String getUtente() {
        return utente;
    }

    public String getComando() {
        return comando;
    }

    public String getNomeCanale() {
        return nomeCanale;
    }

    @Transient
    public String getMessaggio() {
        return messaggio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUtente(String utente) {
        this.utente = utente;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public void setNomeCanale(String nomeCanale) {
        this.nomeCanale = nomeCanale;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
    
  
}
