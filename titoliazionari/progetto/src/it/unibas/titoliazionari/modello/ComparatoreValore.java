/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello;

/**
 *
 * @author Mihai Soanea
 */
import java.util.Comparator;

public class ComparatoreValore implements Comparator<Quotazione>{

    public int compare(Quotazione o1, Quotazione o2) {
        double val1 = o1.getValore();
        double val2 = o2.getValore();
        if(val1 > val2){
            return 1;
        }
        if(val1 < val2){
            return -1;
        }
        return 0;
    }
    
}
