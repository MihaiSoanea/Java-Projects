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
public class DecafDecorator implements IBevanda{
    private String nome = " decaffeinato";
    private double prezzo = 0;
    private IBevanda prodotto;

    public DecafDecorator(IBevanda prodotto) {
        this.prodotto = prodotto;
    }

    public String getNome() {
        return prodotto.getNome() + this.nome;
    }

    public double getPrezzo() {
        return prodotto.getPrezzo() + this.prezzo;
    }
}
