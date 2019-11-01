/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.panini.modello.sigla;

/**
 *
 * @author Mihai Soanea
 */
public class DOP implements ISigla{
    
    public DOP() {
    }
    
    public String getTitolo() {
        return "DOP ";
    }

    public double getPrezzo() {
        return 1.5;
    }
    
}
