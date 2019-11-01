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
public class ProtocolloXStrategy implements IStrategy{
    
    private String protocolloX;

    public ProtocolloXStrategy(String protocolloX) {
        this.protocolloX = protocolloX;
    }
    

    public boolean seleziona(AbstractHost host) {
        for(Protocollo protocollo : host.getListaProtocolli()){
            if(protocollo.getNome().equals(protocolloX)){
                return true;
            }
        }
        return false;
    }
    
}
