/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.dist.modello;

import java.util.Date;
import java.text.DateFormat;
import java.util.GregorianCalendar;


/**
 *
 * @author Mihai Soanea
 */
public class Distributore {
    
    private IBevanda bevanda;

    public IBevanda getBevanda() {
        return bevanda;
    }

    public void setBevanda(IBevanda bevanda) {
        this.bevanda = bevanda;
    }
    
    public String scontrino(){
        Date time = new GregorianCalendar().getTime();
        DateFormat dateInstance = DateFormat.getDateInstance(); 
        StringBuilder sb = new StringBuilder();
        sb.append(bevanda.getNome()).append("\n");
        sb.append("Costo: ").append(bevanda.getPrezzo() + 0.1).append(" €\n");
        sb.append(dateInstance.format(time));
        return sb.toString();
    }
}
