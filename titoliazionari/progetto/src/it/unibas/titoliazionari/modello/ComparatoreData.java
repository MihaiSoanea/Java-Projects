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

public class ComparatoreData implements Comparator<Quotazione>{

    public int compare(Quotazione o1, Quotazione o2) {
         if(o1.getDataRilevazione().after(o2.getDataRilevazione())){
            return 1; //piu grande;
        }else if(o1.getDataRilevazione().before(o2.getDataRilevazione())){
            return -1;
        }
        return 0;
    }
    
}
