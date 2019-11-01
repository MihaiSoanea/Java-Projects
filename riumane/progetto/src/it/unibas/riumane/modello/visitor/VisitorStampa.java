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
public class VisitorStampa implements IVisitor{
    
    private int livello = 0;
    private StringBuilder sb = new StringBuilder();

    public void visitNodoIntermedio(Manager manager) {
        sb.append(manager.getNome()).append(" ").append(manager.getCognome()).append(" ").append(manager.getFunzione()).append(" (").append(manager.getTipo()).append(")\n");
        for(AbstractPersona p : manager.getListaSottoposti()){
            livello++;
            for(int i = 0; i < livello; i++){
                sb.append("   ");
            }
            p.accept(this);
            livello--;
        }
        
    }

    public void visitFoglia(NoManager nomanager) {
        sb.append(nomanager.getNome()).append(" ").append(nomanager.getCognome());
        if(nomanager.isIsOperaio()){
            sb.append(", Operaio\n");
        }else{
            sb.append(", Impiegato\n");
        }
    }

    public String getSb() {
        return sb.toString();
    }

    public List<AbstractPersona> getListaNoManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<RisultatoTopWorst> getRisultato(boolean top, int size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
