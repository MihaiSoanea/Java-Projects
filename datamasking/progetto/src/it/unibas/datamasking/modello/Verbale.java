/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.datamasking.modello;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
/**
 *
 * @author Mihai Soanea
 */
@Entity(name="verbale")
public class Verbale {
    
    private Long id;
    private String nome, testo;
    private Calendar data;

    public Verbale(String nome, String testo, Calendar data) {
        this.nome = nome;
        this.testo = testo;
        this.data = data;
    }

    public Verbale() {
    }

    @Id@GeneratedValue(strategy=GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    @Transient
    public String getDataFormattata(){
        DateFormat dateInstance = DateFormat.getDateInstance();
        return dateInstance.format(data.getTime());
    }

}
