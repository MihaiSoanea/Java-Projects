/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello.strategy;

import it.unibas.strutturescheletriche.modello.AbstractOssoComposite;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Mihai Soanea
 */
public class StrategyIndividuo implements IStrategy<List<AbstractOssoComposite>>{

    public String confronta(List<AbstractOssoComposite> struttura1, List<AbstractOssoComposite> struttura2) {
        if(struttura1.size() != struttura2.size()){
            return "NON SIMILI A LIVELLO DI INDIVIDUO";
        }
        for(int i = 0; i < struttura1.size(); i++){
            if(!struttura1.get(i).isEquals(struttura2.get(i))){
                return "NON SIMILI A LIVELLO DI INDIVIDUO";
            }
        }
        return "SIMILI A LIVELLO DI INDIVIDUO";
    }
    
}
