/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.modello;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Mihai Soanea
 */

public class Brano {

    private String titolo, testo;
    private Calendar data;

    public Brano(String titolo, String testo, Calendar data) {
        this.titolo = titolo;
        this.testo = testo;
        this.data = data;
    }


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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return titolo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Brano altroBRano = (Brano) obj;
        return this.titolo.equals(altroBRano.getTitolo());
    }
    
    public String getDataFormattata(){
        Date time = data.getTime();
        DateFormat dateInstance = DateFormat.getDateInstance();
        return dateInstance.format(time);
    }

    
    
}
