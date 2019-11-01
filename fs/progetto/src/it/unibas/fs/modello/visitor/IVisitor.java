/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.fs.modello.visitor;

import it.unibas.fs.modello.composite.AbstractFile;
import it.unibas.fs.modello.composite.Cartella;

/**
 *
 * @author Mihai Soanea
 */
public interface IVisitor {
    public void visitaNodoIntermedio(Cartella cartella);
    public void visitaFoglia(AbstractFile file);
    public String getSb();
    public int getCount();
    public int getCountSottoCartelle();
}
