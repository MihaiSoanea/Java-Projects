/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.datamasking.modello.strategy;

import it.unibas.datamasking.modello.Verbale;
import it.unibas.datamasking.modello.chain.GestoreChain;

/**
 *
 * @author Mihai Soanea
 */
public class StrategyPersistence implements IStrategy{

    private GestoreChain gestore;

    public StrategyPersistence(GestoreChain gestore) {
        this.gestore = gestore;
    }
    
    public String elabora(Verbale v) {
        String nuovoTesto = gestore.oscuraTesto(v.getTesto());
        v.setTesto(nuovoTesto);
        return nuovoTesto;
    }
    
}
