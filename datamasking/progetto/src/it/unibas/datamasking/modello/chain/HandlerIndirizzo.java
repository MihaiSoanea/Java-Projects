/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.datamasking.modello.chain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Mihai Soanea
 */
public class HandlerIndirizzo implements IGestore{
    
    private List<String> blackList = initList();
    private List<String> coda = new LinkedList<String>();

    public String elabora(String stringaDaAnalizzare) {
        coda.add(0, stringaDaAnalizzare);
        if(coda.size() == 3){
            if(blackList.contains(coda.get(2)) && controllaNumero(coda.get(0))){
                coda.set(1, "Xxxxxx");
            }
            return coda.remove(2);
        }
        return "";
    }
    
    public String flush(){
        if (coda.size() == 0) {
            return "";
        }
        if (coda.size() == 1) {
            return coda.get(0);
        }
        return coda.get(1) + " " + coda.get(0);
    }
    
    private boolean controllaNumero(String s){
        try{
            Integer.parseInt(s);
        } catch (NumberFormatException e){
            return false;
        } 
        return true; 
    }
    
    private List<String> initList(){
        List<String> lista = new ArrayList<String>();
        lista.add("Via");
        lista.add("Viale");
        lista.add("Contrada");
        lista.add("Piazzale");
        lista.add("Piazza");
        return lista;
    }
}
