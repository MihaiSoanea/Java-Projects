/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello.strategy;

import java.util.List;
import java.util.Collections;

/**
 *
 * @author Mihai Soanea
 */
public class CriterioMAXStrategy implements IStrategy{

    @Override
    public double getAndamentoSintetico(List<Double> valoriAndamenti) {
        double andamentoSinteticoUnico = Collections.max(valoriAndamenti);
        return andamentoSinteticoUnico;
    }
    
}
