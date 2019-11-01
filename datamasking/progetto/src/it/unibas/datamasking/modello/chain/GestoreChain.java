/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.datamasking.modello.chain;

/**
 *
 * @author Mihai Soanea
 */

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GestoreChain {
    
    private HandlerIndirizzo indirizzo = new HandlerIndirizzo();
    private List<IGestore> listaHandler = initHandlers();
    
    private List<IGestore> initHandlers(){
        List<IGestore> lista = new ArrayList<IGestore>();
        lista.add(new HandlerCF());
        lista.add(new HandlerData());
        lista.add(new HandlerEMail());
        lista.add(new HandlerIBAN());
        lista.add(indirizzo);
        return lista;
    }
    
    public String oscuraTesto(String testo){
        StringBuilder risultato = new StringBuilder();
        StringTokenizer st = new StringTokenizer(testo, " ");
        while(st.hasMoreTokens()){
            String parola = st.nextToken();
            for (IGestore g : listaHandler) {
                parola = g.elabora(parola);
            }
            risultato.append(parola).append(" ");
        }
        return risultato.append(indirizzo.flush()).toString().substring(2);
        //return risultato.append(indirizzo.elabora("")).append(indirizzo.elabora("")).toString().substring(2);
    }
    
}
