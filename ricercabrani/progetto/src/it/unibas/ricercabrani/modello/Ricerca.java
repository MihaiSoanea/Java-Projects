/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.modello;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Mihai Soanea
 */
@Entity(name="ricerca")
public class Ricerca {
    private Long id;
    private String ricerca;
    private Calendar data = new GregorianCalendar();
    private int size;

    public Ricerca() {
    }

    public Ricerca(String ricerca, int size) {
        this.ricerca = ricerca;
        this.size = size;
    }
    
    @Id@GeneratedValue(strategy=GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRicerca() {
        return ricerca;
    }

    public void setRicerca(String ricerca) {
        this.ricerca = ricerca;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
