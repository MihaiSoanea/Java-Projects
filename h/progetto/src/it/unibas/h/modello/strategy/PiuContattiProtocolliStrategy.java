/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello.strategy;

import it.unibas.h.modello.Protocollo;
import it.unibas.h.modello.composite.AbstractHost;

/**
 *
 * @author Mihai Soanea
 */
public class PiuContattiProtocolliStrategy implements IStrategy{
    private int numeroContatti;

    public PiuContattiProtocolliStrategy(int numeroContatti) {
        this.numeroContatti = numeroContatti;
    }

    public boolean seleziona(AbstractHost host) {
        int somma = 0;
        for(Protocollo p : host.getListaProtocolli()){
            somma += p.getNumeroContatti();
        }
        return somma > numeroContatti;
    }
    
    
}
