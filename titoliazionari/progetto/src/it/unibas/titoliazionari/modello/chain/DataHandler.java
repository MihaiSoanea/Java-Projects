/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello.chain;

import it.unibas.titoliazionari.modello.Configurazione;
import it.unibas.titoliazionari.modello.Quotazione;
import it.unibas.titoliazionari.modello.Titolo;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */
public class DataHandler implements IHandler{

    public HashSet<Titolo> getTitoliTrovati(List<Titolo> listaTitoli, Configurazione c) {
        HashSet<Titolo> momentaneo = new HashSet<Titolo>();
        List<Quotazione> lista = new ArrayList<Quotazione>();
        for(Titolo titolo : listaTitoli){
            Titolo t = titolo;
            for(Quotazione quotazione : titolo.getListaQuotazioni()){
                if(c.getData1() != null && c.getData2() != null){
                    if((quotazione.getDataRilevazione().after(c.getData1()) || quotazione.getDataRilevazione().equals(c.getData1())) &&(quotazione.getDataRilevazione().before(c.getData2()) || quotazione.getDataRilevazione().equals(c.getData2()))){
                        lista.add(quotazione);
                        //System.out.println(lista.toString());
                        t.setListaQuotazioni(lista);
                        momentaneo.add(t);
                    }
                }
            }
        }
        return momentaneo;        
    }
    
}
