/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.scatolificio.modello.colore;

/**
 *
 * @author Mihai Soanea
 */
public class NullObjectColore implements IColore{

    public String getCodice() {
        return "";
    }

    public String getNome() {
        return "";
    }

    public double getPrezzo() {
        return 0;
    }
    
}
