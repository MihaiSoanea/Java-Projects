/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello.strategy;
import java.util.List;
/**
 *
 * @author Mihai Soanea
 */
public interface IStrategy {
    public double getAndamentoSintetico(List<Double> valoriAndamenti);
}
