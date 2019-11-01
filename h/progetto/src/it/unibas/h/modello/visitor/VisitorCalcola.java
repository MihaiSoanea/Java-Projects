/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello.visitor;

import it.unibas.h.modello.composite.AbstractHost;
import it.unibas.h.modello.strategy.IStrategy;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Mihai Soanea
 */
public class VisitorCalcola implements IVisitor{
    
    private IStrategy strategy;
    private List<AbstractHost> risultato = new ArrayList<AbstractHost>();

    public VisitorCalcola(IStrategy strategy) {
        this.strategy = strategy;
    }

    public List<AbstractHost> getRisultato() {
        return risultato;
    }
    
    public void visitHost(AbstractHost host) {
        if(strategy.seleziona(host)){
            this.risultato.add(host);
        }
        for(AbstractHost h : host.getListaHost()){
            h.accept(this);
        }
    }

    public StringBuilder getSb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
