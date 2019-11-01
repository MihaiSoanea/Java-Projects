/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.modello.chain;

import it.unibas.ricercabrani.modello.Brano;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public abstract class IHandlerAbstract {
    
    protected String parola;

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    
    public abstract String toString();
 
    public abstract IHandlerAbstract createNewInstance();
    public abstract boolean isHandler(String parola);
    public abstract HashSet<Brano> filtra(List<Brano> tuttiBrani);
}
