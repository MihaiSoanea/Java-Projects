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
public class HandlerAsterisco extends IHandlerAbstract{

    public boolean isHandler(String parola) {
        char c = parola.charAt(0);
        return c == '*';
    }

    public HashSet<Brano> filtra(List<Brano> tuttiBrani) {
        HashSet<Brano> risultato = new HashSet<Brano>();
        for(Brano brano : tuttiBrani){
            int contatore = 0;
            StringTokenizer st = new StringTokenizer(brano.getTesto(), " ");
            while(st.hasMoreTokens()){
                String stringChiave = st.nextToken().replace(",", "").replace(".", "");
                if(stringChiave.equals(parola)){
                    contatore++;
                }
            }
            if(contatore>1){
                 risultato.add(brano);
            }
        }
       return risultato;
    }

    @Override
    public IHandlerAbstract createNewInstance() {
        return new HandlerAsterisco();
    }

    @Override
    public String toString() {
        return "*" + parola;
    }

    
}
