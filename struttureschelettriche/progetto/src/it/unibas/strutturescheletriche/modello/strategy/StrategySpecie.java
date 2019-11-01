/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello.strategy;
import java.util.List;
/**
 *
 * @author Mihai Soanea
 */
public class StrategySpecie implements IStrategy<List<String>>{

    public String confronta(List<String> struttura1, List<String> struttura2) {
        int n = Math.max(struttura1.size(), struttura2.size());
        int contatore = 0;
        for(String stringa : struttura1){
            for(String stringa2 : struttura2){
                if(stringa.equals(stringa2)){
                    contatore++;
                }
            }
        }
        if((double)contatore/n >= 0.8){
            return "SIMILI A LIVELLO DI SPECIE";
        }
        return "NON SIMILI A LIVELLO DI SPECIE";
    }
    
}
