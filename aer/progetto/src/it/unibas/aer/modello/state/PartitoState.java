/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.modello.state;

import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Volo;
import java.util.Calendar;

/**
 *
 * @author Mihai Soanea
 */
public class PartitoState implements IState{
    
    private Calendar orario;

    public PartitoState(Calendar orario) {
        this.orario = orario;
    }

    public PartitoState() {
    }

    @Override
    public String getDescrizione() {
        return "Partito";
    }

    @Override
    public void gestisciVolo(Aereoporto a, Volo v) {
        v.setOrarioEffettivo(orario);
    }
    
    
}
