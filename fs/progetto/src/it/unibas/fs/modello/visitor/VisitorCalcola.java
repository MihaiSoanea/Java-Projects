/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.fs.modello.visitor;

import it.unibas.fs.modello.composite.AbstractFile;
import it.unibas.fs.modello.composite.Cartella;
import it.unibas.fs.modello.composite.INodo;

/**
 *
 * @author Mihai Soanea
 */
public class VisitorCalcola implements IVisitor{
    private int conta = 0;
    private int contaSottocartelle = 0;
    private String ext;

    public VisitorCalcola(String ext) {
        this.ext = ext;
    }

    public void visitaNodoIntermedio(Cartella cartella) {
        contaSottocartelle++;
        for(INodo f : cartella.getFiles()){
            f.accept(this);
        }
    }

    public void visitaFoglia(AbstractFile file) {
        if(file.getEstensione().equals(ext)){
            conta++;
        }
    }

    public String getSb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCount() {
        return conta;
    }

    public int getCountSottoCartelle() {
        return contaSottocartelle-1;
    }
    
}
