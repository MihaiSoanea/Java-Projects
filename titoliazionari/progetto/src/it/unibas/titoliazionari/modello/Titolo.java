/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Mihai Soanea
 */
public class Titolo {
    private String nome, societa, tipologia, area, settore;
    private Calendar data;
    private List<Quotazione> listaQuotazioni = new ArrayList<Quotazione>();

    public Titolo(String nome, String societa, String tipologia, String settore, String area, Calendar data) {
        this.nome = nome;
        this.societa = societa;
        this.tipologia = tipologia;
        this.settore = settore;
        this.area = area; 
        this.data = data;
    }

    public Titolo() {
    }

    public String getSocieta() {
        return societa;
    }

    public void setSocieta(String societa) {
        this.societa = societa;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSettore() {
        return settore;
    }

    public void setSettore(String settore) {
        this.settore = settore;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Quotazione> getListaQuotazioni() {
        return listaQuotazioni;
    }

    public void addQuotazioni(Quotazione quotazione) {
        this.listaQuotazioni.add(quotazione);
    }

    public void setListaQuotazioni(List<Quotazione> listaQuotazioni) {
        this.listaQuotazioni = listaQuotazioni;
    }
    
    

    @Override
    public String toString() {
        return "Titolo{"+ "nome=" + nome + "societa=" + societa + ", tipologia=" + tipologia + ", area=" + area + ", settore=" + settore  + '}';
    }
    
    public double getAndamentoTitolo(){ //Configurazione c
        double andamento = 0.0;
       //ComparatoreData comparatoreData = new ComparatoreData();
       // Collections.sort(listaQuotazioni, comparatoreData);
       // Collections.sort(listaQuotazioni, new ComparatoreValore());
        Collections.sort(listaQuotazioni);
        //if(c.getData1() != null && c.getData2() != null){
        //    andamento = (listaQuotazioni.get(listaQuotazioni.size()-1).getValore() - listaQuotazioni.get(0).getValore())*100/listaQuotazioni.get(0).getValore();
        //}
        return andamento = (listaQuotazioni.get(listaQuotazioni.size()-1).getValore() - listaQuotazioni.get(0).getValore())*100/listaQuotazioni.get(0).getValore();
    }
    
    
}
