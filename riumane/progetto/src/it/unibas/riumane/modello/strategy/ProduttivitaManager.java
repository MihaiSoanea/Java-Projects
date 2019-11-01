/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.strategy;

import it.unibas.riumane.modello.composite.AbstractPersona;
import it.unibas.riumane.modello.composite.Manager;
import it.unibas.riumane.modello.composite.NoManager;

/**
 *
 * @author Mihai Soanea
 */
public class ProduttivitaManager implements IStrategy{

    public double seleziona(Manager manager) {
        double produttivita = 0;
        int n = 0;
        for(AbstractPersona a : manager.getListaSottoposti()){
            produttivita += a.getIndiceProduttivita();
            n++;
        }
        return produttivita/n;
    }
    
    public boolean verifica(NoManager nomanager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
