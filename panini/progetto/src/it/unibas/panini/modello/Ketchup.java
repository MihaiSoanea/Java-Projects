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
public class Ketchup extends AbstractIngredientiDecorator{

    public Ketchup(IingredienteDecorator ingrediente) {
        super(ingrediente);
        prezzo = 0.5;
        titolo = "+";
        insiemeIngredienti = initSet();
    }
    
    private HashSet<String> initSet(){
        HashSet<String> momentaneo = new HashSet<String>();
        momentaneo.add("pomodoro");
        momentaneo.add("zucchero");
        momentaneo.add("acidificante");
        return momentaneo;
    }
}
