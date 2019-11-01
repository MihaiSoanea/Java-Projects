/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.fs.modello.composite;

import it.unibas.fs.modello.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Mihai Soanea
 */
public class Cartella implements INodo{
    
    private List<INodo> files = new ArrayList<INodo>();
    private String nome;

    public Cartella(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<INodo> getFiles() {
        return files;
    }
    
    public void addFile(INodo file){
        this.files.add(file);
    }

    public void accept(IVisitor visitor){
        visitor.visitaNodoIntermedio(this);
    }
}
