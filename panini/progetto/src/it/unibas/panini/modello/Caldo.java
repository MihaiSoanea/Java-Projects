/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.panini.modello;

import it.unibas.panini.modello.sigla.ISigla;
import java.util.HashSet;

/**
 *
 * @author Mihai Soanea
 */
public class Caldo extends AbstractIngredientiDecorator{
   
    public Caldo(IingredienteDecorator ingrediente) {
        super(ingrediente);
        prezzo = 0.5;
        titolo = "HOT ";
        insiemeIngredienti = new HashSet<String>();
    }
    
    
}
