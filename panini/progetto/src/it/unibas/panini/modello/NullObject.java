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
public class NullObject implements IingredienteDecorator{

    public double getPrezzo() {
        return 0;
    }

    public HashSet<String> getIngredienti() {
        return new HashSet<String>();
    }

    public String getTitolo() {
        return "";
    }

    
    
}
