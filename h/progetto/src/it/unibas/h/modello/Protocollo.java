/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello;

/**
 *
 * @author Mihai Soanea
 */
public class Protocollo {
    
    private String nome;
    private int numeroContatti;

    public Protocollo(String nome, int numeroContatti) {
        this.nome = nome;
        this.numeroContatti = numeroContatti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroContatti() {
        return numeroContatti;
    }

    public void setNumeroContatti(int numeroContatti) {
        this.numeroContatti = numeroContatti;
    }
  
}
