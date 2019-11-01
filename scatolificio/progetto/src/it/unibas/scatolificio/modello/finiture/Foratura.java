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
public class Foratura implements Ifiniture{

    public Foratura() {
    }

    public double getPrezzo() {
        return 0.5;
    }

    public String getNome() {
        return " con foratura ";
    }

    public String getCodice() {
        return "+foratura+";
    }
    
}
