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
public class Asiago extends AbstractIngredientiDecorator{

    public Asiago(IingredienteDecorator ingrediente) {
        super(ingrediente);
        prezzo = 0.8;
        titolo = "Asiago ";
        insiemeIngredienti = initSet();
    }

    private HashSet<String> initSet(){
        HashSet<String> momentaneo = new HashSet<String>();
        momentaneo.add("Asiago");
        return momentaneo;
    }
    
}
