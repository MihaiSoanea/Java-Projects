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
public class InRitardoState implements IState{
    

    @Override
    public String getDescrizione() {
        return "In ritardo";
    }

    @Override
    public void gestisciVolo(Aereoporto a, Volo v) {
        long milli1 = a.getOrarioDiBase().getTimeInMillis();
        long milli2 = v.getOrarioPrevisto().getTimeInMillis();
        int ritardo = (int)(milli1-milli2)/1000/60;
        v.setRitardo(ritardo);
    }
    
}
