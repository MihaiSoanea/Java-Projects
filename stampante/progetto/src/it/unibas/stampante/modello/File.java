/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.stampante.modello;
import java.util.Calendar;
/**
 *
 * @author Mihai Soanea
 */
public class File implements Comparable<File>{
    
    private String percorso, messaggio;
    private int dimensione;
    private Calendar dataCreazione, dataEsecuzione;

    public File(String percorso, int dimensione, Calendar dataCreazione) {
        this.percorso = percorso;
        this.dimensione = dimensione;
        this.dataCreazione = dataCreazione;
    }

    public String getPercorso() {
        return percorso;
    }

    public void setPercorso(String percorso) {
        this.percorso = percorso;
    }

    public int getDimensione() {
        return dimensione;
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public Calendar getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(Calendar dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public Calendar getDataEsecuzione() {
        return dataEsecuzione;
    }

    public void setDataEsecuzione(Calendar dataEsecuzione) {
        this.dataEsecuzione = dataEsecuzione;
    }

    @Override
    public String toString() {
        return "File{" + "percorso=" + percorso +'}';
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public int compareTo(File o) {
        if(this.dimensione < o.getDimensione()){
            return 1;
        }else if(this.dimensione > o.getDimensione()){
            return -1;
        }
        return 0;
    }
    
    
}
