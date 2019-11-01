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
public class Martellatura implements Ifiniture{
    

    public Martellatura() {
    }

    public double getPrezzo() {
        return 3;
    }

    public String getNome() {
        return " con martellatura ";
    }

    public String getCodice() {
        return "+martellatura+";
    }
    
}
