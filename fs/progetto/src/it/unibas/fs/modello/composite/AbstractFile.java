/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.fs.modello.composite;

import it.unibas.fs.modello.visitor.IVisitor;

/**
 *
 * @author Mihai Soanea
 */
public abstract class AbstractFile implements INodo{
    
    protected String nome;
    protected String estensione;

    public AbstractFile(String nome, String estensione) {
        this.nome = nome;
        this.estensione = estensione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstensione() {
        return estensione;
    }

    public void setEstensione(String estensione) {
        this.estensione = estensione;
    }
    
    public void accept(IVisitor visitor){
        visitor.visitaFoglia(this);
    }
    
}
