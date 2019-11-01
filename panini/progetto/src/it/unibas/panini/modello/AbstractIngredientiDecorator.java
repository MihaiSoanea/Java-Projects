/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.panini.modello;

import java.util.HashSet;

/**
 *
 * @author Mihai Soanea
 */
public abstract class AbstractIngredientiDecorator implements IingredienteDecorator{
    
    protected double prezzo;
    protected String titolo;
    private IingredienteDecorator ingrediente;
    protected HashSet<String> insiemeIngredienti;

    public AbstractIngredientiDecorator(IingredienteDecorator ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    public double getPrezzo() {
        return ingrediente.getPrezzo() + this.prezzo;
    }

    public HashSet<String> getIngredienti() {
        HashSet<String> ingredientiMomentanei = new HashSet<String>();
        ingredientiMomentanei.addAll(insiemeIngredienti);
        ingredientiMomentanei.addAll(ingrediente.getIngredienti());
        return ingredientiMomentanei;
    }

    public String getTitolo() {
        return ingrediente.getTitolo() + this.titolo;
    }

    
    
    
    
    
    
}
