/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello.strategy;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public class CriterioMEDIAStrategy implements IStrategy{

    @Override
    public double getAndamentoSintetico(List<Double> valoriAndamenti) {
        double andamentoSinteticoUnico = 0.0;
        for(double d : valoriAndamenti){
            andamentoSinteticoUnico += d;
        }
        return andamentoSinteticoUnico/valoriAndamenti.size();
    }
    
}
