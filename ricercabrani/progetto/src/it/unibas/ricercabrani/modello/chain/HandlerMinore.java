/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.modello.chain;

import it.unibas.ricercabrani.modello.Brano;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Mihai Soanea
 */
public class HandlerMinore extends IHandlerAbstract{

    @Override
    public boolean isHandler(String parola) {
        char c = parola.charAt(0);
        return c == '<';
    }

    @Override
    public HashSet<Brano> filtra(List<Brano> tuttiBrani) {
        HashSet<Brano> risultato = new HashSet<Brano>();
        for(Brano brano : tuttiBrani){
            if(brano.getTesto().contains(parola.substring(0, parola.length()-1))){
                risultato.add(brano);
            }            
        }
        return risultato;
    }
    
        @Override
    public IHandlerAbstract createNewInstance() {
        return new HandlerMinore();
    }

    @Override
    public String toString() {
        return "<" + parola;
    }
    
}
