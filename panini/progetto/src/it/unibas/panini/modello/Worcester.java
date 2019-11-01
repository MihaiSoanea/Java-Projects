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
public class Worcester extends AbstractIngredientiDecorator{
    
    public Worcester(IingredienteDecorator ingrediente) {
        super(ingrediente);
        super.prezzo = 1.2;
        super.titolo = "*";
        super.insiemeIngredienti = initSet();
    }

    private HashSet<String> initSet(){
        HashSet<String> momentaneo = new HashSet<String>();
        momentaneo.add("peperoncino");
        momentaneo.add("cipolla");
        momentaneo.add("acciughe");
        return momentaneo;
    }
}
