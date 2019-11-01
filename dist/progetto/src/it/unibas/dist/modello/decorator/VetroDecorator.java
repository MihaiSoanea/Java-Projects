/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.dist.modello.decorator;

import it.unibas.dist.modello.IBevanda;

/**
 *
 * @author Mihai Soanea
 */
public class VetroDecorator implements IBevanda{
    
    private IBevanda prodotto;
    private String nome = " in vetro";
    private double prezzo = 0;

    public VetroDecorator(IBevanda prodotto) {
        this.prodotto = prodotto;
    }

    public String getNome() {
        return prodotto.getNome() + this.nome;
    }

    public double getPrezzo() {
        return prodotto.getPrezzo() + this.prezzo;
    }
    
}
