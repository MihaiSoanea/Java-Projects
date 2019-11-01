/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello.visitor;

import it.unibas.h.modello.composite.AbstractHost;

/**
 *
 * @author Mihai Soanea
 */
public interface IVisitor {
    public void visitHost(AbstractHost host);
    public StringBuilder getSb();
}
