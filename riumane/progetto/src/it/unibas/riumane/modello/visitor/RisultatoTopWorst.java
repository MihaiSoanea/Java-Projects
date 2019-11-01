/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.visitor;

import it.unibas.riumane.modello.composite.Manager;

/**
 *
 * @author Mihai Soanea
 */
public class RisultatoTopWorst {
    private Manager manager;
    private double valore;

    public RisultatoTopWorst(Manager manager, double valore) {
        this.manager = manager;
        this.valore = valore;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public double getValore() {
        return valore;
    }

    public void setValore(double valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return "RisultatoTopWorst{" + "manager=" + manager + ", valore=" + valore + '}';
    }

    
}
