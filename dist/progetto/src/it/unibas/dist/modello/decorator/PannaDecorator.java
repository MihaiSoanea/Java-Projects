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
public class PannaDecorator implements IBevanda{
    
    private IBevanda prodotto;
    private String nome = " con panna";
    private double prezzo = 0.1;

    public PannaDecorator(IBevanda prodotto) {
        this.prodotto = prodotto;
    }

    public String getNome() {
        if(prodotto.getNome().contains("Caffe")){
            return prodotto.getNome().replace("Caffe", "Espressino");
        }
        return prodotto.getNome() + this.nome;
    }

    public double getPrezzo() {
        return prodotto.getPrezzo() + this.prezzo;
    }
    
}
