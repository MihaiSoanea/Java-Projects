/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello;
import java.util.Calendar;
/**
 *
 * @author Mihai Soanea
 */
public class Quotazione implements Comparable<Quotazione>{
    private double valore;
    private Calendar dataRilevazione;

    public Quotazione(double valore, Calendar dataRilevazione) {
        this.valore = valore;
        this.dataRilevazione = dataRilevazione;
    }

    public double getValore() {
        return valore;
    }

    public void setValore(double valore) {
        this.valore = valore;
    }

    public Calendar getDataRilevazione() {
        return dataRilevazione;
    }

    public void setDataRilevazione(Calendar dataRilevazione) {
        this.dataRilevazione = dataRilevazione;
    }

    public int compareTo(Quotazione o) {
        if(this.getDataRilevazione().after(o.getDataRilevazione())){
            return 1; //piu grande;
        }else if(this.getDataRilevazione().before(o.getDataRilevazione())){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return  valore + ", " + dataRilevazione.getTime() + " ";
    }
    
    
}
