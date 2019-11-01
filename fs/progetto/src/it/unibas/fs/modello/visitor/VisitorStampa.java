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
public class VisitorStampa implements IVisitor{
    
    private int livello = 0;
    private StringBuilder sb = new StringBuilder();

    public void visitaNodoIntermedio(Cartella cartella) {
        for(int i = 0; i < livello; i++){
            sb.append("    ");
        }
        sb.append("Cartella:").append(cartella.getNome()).append("\n");
        livello++;     
        for(INodo f : cartella.getFiles()){
            f.accept(this);
        }
        livello--;
    }

    public void visitaFoglia(AbstractFile file) {
        for(int i = 0; i < livello; i++){
            sb.append("    ");
        }
        livello++;
        sb.append(file.getNome()).append(file.getEstensione()).append("\n");
        livello--;
    }

    public String getSb() {
        return sb.toString();
    }

    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCountSottoCartelle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
