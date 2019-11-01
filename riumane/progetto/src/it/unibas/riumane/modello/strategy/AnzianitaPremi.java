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
public class AnzianitaPremi implements IStrategy{

    public double seleziona(Manager manager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean verifica(NoManager nomanager) {
        if(nomanager.isIsOperaio() && nomanager.getAnniServizio() > 40){
            return true;
        }
        if(!nomanager.isIsOperaio() && nomanager.getAnniServizio() > 43){
            return true;
        }
        return false;
    }
    
}
