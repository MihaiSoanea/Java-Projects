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
public interface IingredienteDecorator {
    
    public double getPrezzo();
    public HashSet<String> getIngredienti();
    public String getTitolo();
    
}
