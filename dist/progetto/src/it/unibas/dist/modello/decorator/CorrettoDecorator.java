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
public class CorrettoDecorator implements IBevanda{
    
    private IBevanda prodotto;
    private String nome = " corretto";
    private double prezzo = 0.5;

    public CorrettoDecorator(IBevanda prodotto) {
        this.prodotto = prodotto;
    }

    public String getNome() {
        return prodotto.getNome() + this.nome;
    }

    public double getPrezzo() {
        return prodotto.getPrezzo() + this.prezzo;
    }
    
}
