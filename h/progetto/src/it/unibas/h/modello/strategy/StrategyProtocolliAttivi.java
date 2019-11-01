/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello.strategy;

import it.unibas.h.modello.composite.AbstractHost;

/**
 *
 * @author Mihai Soanea
 */
public class StrategyProtocolliAttivi implements IStrategy{

    public boolean seleziona(AbstractHost host) {
        return host.getListaProtocolli().size() > 0;
    }
    
}
