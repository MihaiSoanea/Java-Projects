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
public interface INodo {
    public void accept(IVisitor visitor);
}
