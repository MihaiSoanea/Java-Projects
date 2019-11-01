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
public class Bronzo implements IColore{

    public String getCodice() {
        return "-bronzo";
    }

    public String getNome() {
        return "di colore bronzo ";
    }

    public double getPrezzo() {
        return 0.1;
    }
    
}
