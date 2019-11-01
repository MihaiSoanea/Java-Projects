/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.strategy;

import it.unibas.softwarehouse.modello.composite.Pagina;

/**
 *
 * @author Mihai Soanea
 */
public interface IStrategy {
    public boolean seleziona(Pagina pagina);
}
