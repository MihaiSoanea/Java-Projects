/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.visitor;

import it.unibas.riumane.modello.composite.AbstractPersona;
import it.unibas.riumane.modello.composite.Manager;
import it.unibas.riumane.modello.composite.NoManager;
import it.unibas.riumane.modello.strategy.IStrategy;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */
public class VisitorPremi implements IVisitor{
    
    private IStrategy strategia;
    private List<AbstractPersona> lista = new ArrayList<AbstractPersona>();

    public VisitorPremi(IStrategy strategia) {
        this.strategia = strategia;
    }

    public void visitNodoIntermedio(Manager manager) {
        for(AbstractPersona a : manager.getListaSottoposti()){
            a.accept(this);
        }
    }

    public void visitFoglia(NoManager nomanager) {
        if(strategia.verifica(nomanager)){
            this.lista.add(nomanager);
        }
    }

    public String getSb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<AbstractPersona> getListaNoManager() {
        return lista;
    }

    public List<RisultatoTopWorst> getRisultato(boolean top, int size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
