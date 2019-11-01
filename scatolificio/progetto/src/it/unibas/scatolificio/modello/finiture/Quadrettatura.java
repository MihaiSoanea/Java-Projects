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
public class Quadrettatura implements Ifiniture{

    public Quadrettatura() {
    }
    
    public double getPrezzo() {
        return 0.7;
    }

    public String getNome() {
        return " con quadrettatura ";
    }

    public String getCodice() {
        return "+quadrettatura+";
    }
    
}
