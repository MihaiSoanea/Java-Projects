/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.controllo;

import it.unibas.titoliazionari.modello.Configurazione;
import it.unibas.titoliazionari.modello.Titolo;
import it.unibas.titoliazionari.modello.chain.GestoreChain;
import it.unibas.titoliazionari.modello.strategy.CriterioMEDIAStrategy;
import it.unibas.titoliazionari.modello.strategy.IStrategy;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public class ControlloFiltraggio {
    
    public double filtra(Configurazione c){
        GestoreChain gestore = new GestoreChain(c);
        HashSet<Titolo> insieme = gestore.getTitoliValidi();
        System.out.println(insieme.toString());
        List<Double> valori = gestore.getAndamentiTitoliValidi();
        IStrategy nuovaStrategia = new CriterioMEDIAStrategy();
        double valoreUnico = nuovaStrategia.getAndamentoSintetico(valori);
        return valoreUnico;
    }    
}
