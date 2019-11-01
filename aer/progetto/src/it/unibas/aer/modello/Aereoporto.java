/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.modello;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */

public class Aereoporto {


    private String nome;
    private Calendar orarioDiBase;
    private List<Volo> listaVoli = new ArrayList<Volo>();

    public Aereoporto() {
    }

    public Aereoporto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return "Aereoporto di Napoli";
    }


    public List<Volo> getListaVoli() {
        return listaVoli;
    }

    public void setListaVoli(List<Volo> listaVoli) {
        this.listaVoli = listaVoli;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Calendar getOrarioDiBase() {
        return orarioDiBase;
    }

    public void setOrarioDiBase(Calendar orarioDiBase) {
        this.orarioDiBase = orarioDiBase;
    }

  
    public void addVolo(Volo volo){
        listaVoli.add(volo);
    }
    
    public void aggiornaStatoVoli(){
        for(Volo v : listaVoli){
            v.getState().gestisciVolo(this, v);
        }
    }
    
    public void settaOraEMinuti(int ora, int minuti){
        this.orarioDiBase.set(Calendar.HOUR_OF_DAY, ora);
        this.orarioDiBase.set(Calendar.MINUTE, minuti);
        aggiornaStatoVoli();
    }
}
