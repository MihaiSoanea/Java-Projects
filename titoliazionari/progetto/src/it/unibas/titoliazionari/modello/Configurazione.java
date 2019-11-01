/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello;
import java.util.List;
import java.util.Calendar;
/**
 *
 * @author Mihai Soanea
 */
public class Configurazione {
    private String societa, tipologia, settore, areaGeografica;
    private Calendar data1, data2;

    public Configurazione(String societa, String tipologia, String settore, String areaGeografica, Calendar data1, Calendar data2) {
        this.societa = societa;
        this.tipologia = tipologia;
        this.settore = settore;
        this.areaGeografica = areaGeografica;
        this.data1 = data1;
        this.data2 = data2;
    }
    
    public Configurazione() {
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

    public String getSettore() {
        return settore;
    }

    public void setSettore(String settore) {
        this.settore = settore;
    }

    public String getAreaGeografica() {
        return areaGeografica;
    }

    public void setAreaGeografica(String areaGeografica) {
        this.areaGeografica = areaGeografica;
    }

    @Override
    public String toString() {
        return "Configurazione{" + "societa=" + societa + ", tipologia=" + tipologia + ", settore=" + settore + ", areaGeografica=" + areaGeografica + '}';
    }

    public Calendar getData1() {
        return data1;
    }

    public void setData1(Calendar data1) {
        this.data1 = data1;
    }

    public Calendar getData2() {
        return data2;
    }

    public void setData2(Calendar data2) {
        this.data2 = data2;
    }
 
    
}
