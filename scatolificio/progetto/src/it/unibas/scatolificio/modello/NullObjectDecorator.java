/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.scatolificio.modello;

/**
 *
 * @author Mihai Soanea
 */
public class NullObjectDecorator implements IscatolificioDecorator{

    public double getPrezzo() {
        return 0;
    }

    public String getCodice() {
        return "";
    }

    public String getNome() {
        return "";
    }
    
    
    
}
