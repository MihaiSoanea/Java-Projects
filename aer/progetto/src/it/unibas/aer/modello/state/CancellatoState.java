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
public class CancellatoState implements IState{
    
    private String motivazione;

    public CancellatoState(String motivazione) {
        this.motivazione = motivazione;
    }

    @Override
    public String getDescrizione() {
        return "Cancellato" + motivazione;
    }

    @Override
    public void gestisciVolo(Aereoporto a, Volo v) {
    }
    
}
