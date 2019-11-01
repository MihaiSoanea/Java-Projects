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
public class ComboManager implements IStrategy{

    public double seleziona(Manager manager) {
        double produttivita = new ProduttivitaManager().seleziona(manager);
        double assenze = new AssenzeManager().seleziona(manager);
        return produttivita/assenze;
    }
    
    public boolean verifica(NoManager nomanager) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
