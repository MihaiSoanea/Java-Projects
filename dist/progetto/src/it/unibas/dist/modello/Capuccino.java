/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.dist.modello;

/**
 *
 * @author Mihai Soanea
 */
public class Capuccino implements IBevanda{
    
    private String nome = "Capuccino";
    private double prezzo = 0.7;

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }


    
}
