/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.visitor;

import it.unibas.riumane.modello.composite.AbstractPersona;
import it.unibas.riumane.modello.composite.Manager;
import it.unibas.riumane.modello.composite.NoManager;
import java.util.List;
/**
 *
 * @author Mihai Soanea
 */
public interface IVisitor {
    public void visitNodoIntermedio(Manager manager);
    public void visitFoglia(NoManager nomanager);
    public String getSb();
    public List<AbstractPersona> getListaNoManager();
    public List<RisultatoTopWorst> getRisultato(boolean top, int size);
}
