/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.modello.state;

import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Volo;

/**
 *
 * @author Mihai Soanea
 */
public class InOrarioState implements IState{

    @Override
    public String getDescrizione() {
        return "In orario";
    }

    @Override
    public void gestisciVolo(Aereoporto a, Volo v) {
        if(v.getOrarioPrevisto().before(a.getOrarioDiBase())){
            IState s = new InRitardoState();
            v.setState(s);
            s.gestisciVolo(a, v);
        } 
    }
    
}
