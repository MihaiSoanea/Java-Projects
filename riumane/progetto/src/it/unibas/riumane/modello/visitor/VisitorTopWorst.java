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
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Mihai Soanea
 */
public class VisitorTopWorst implements IVisitor {
    
    private IStrategy strategia;
    private List<RisultatoTopWorst> risultato = new ArrayList<RisultatoTopWorst>();

    public VisitorTopWorst(IStrategy strategia) {
        this.strategia = strategia;
    }

    public void visitNodoIntermedio(Manager manager) {
        risultato.add(new RisultatoTopWorst(manager, strategia.seleziona(manager)));
        for(AbstractPersona a : manager.getListaSottoposti()){
            a.accept(this);
        }
    }

    public void visitFoglia(NoManager nomanager) {
        return;
    }

    public String getSb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<AbstractPersona> getListaNoManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<RisultatoTopWorst> getRisultato(boolean top, int size) {
        ordinaLista(top);
        return risultato.subList(0, size);
    }
    
    private void ordinaLista(final boolean top){
        Collections.sort(risultato, new Comparator() {
            public int compare(Object o1, Object o2) {
                double a = ((RisultatoTopWorst)o1).getValore();
                double b = ((RisultatoTopWorst)o2).getValore();
                if(top){
                    if(a>b){
                        return -1;
                    }else if(a<b){
                        return 1;
                    }
                    return 0;
                }else{
                    if(a>b){
                        return 1;
                    }else if(a<b){
                        return -1;
                    }
                    return 0;
                }
            }
        });
    }
}
