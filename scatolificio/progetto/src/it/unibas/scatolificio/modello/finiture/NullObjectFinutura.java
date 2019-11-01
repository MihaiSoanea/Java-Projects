/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.scatolificio.modello.finiture;

/**
 *
 * @author Mihai Soanea
 */
public class NullObjectFinutura implements Ifiniture{

    public double getPrezzo() {
        return 0;
    }

    public String getNome() {
        return "";
    }

    public String getCodice() {
        return "";
    }
    
}
