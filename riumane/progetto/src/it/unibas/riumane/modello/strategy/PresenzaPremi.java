/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.strategy;

import it.unibas.riumane.modello.composite.Manager;
import it.unibas.riumane.modello.composite.NoManager;

/**
 *
 * @author Mihai Soanea
 */
public class PresenzaPremi implements IStrategy{
    
    private int eta, presenza;

    public PresenzaPremi(int eta, int presenza) {
        this.eta = eta;
        this.presenza = presenza;
    }

    public double seleziona(Manager manager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean verifica(NoManager nomanager) {
        if(nomanager.getEta() < eta && nomanager.getTassoAssenze() < presenza){
            return true;
        }
        return false;
    }
    
}
