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
public interface IStrategy {
    public double seleziona(Manager manager);
    public boolean verifica(NoManager nomanager);
}
