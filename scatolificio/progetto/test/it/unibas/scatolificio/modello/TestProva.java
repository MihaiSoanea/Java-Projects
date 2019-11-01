/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.scatolificio.modello;

import it.unibas.scatolificio.modello.colore.Dorato;
import it.unibas.scatolificio.modello.colore.IColore;
import it.unibas.scatolificio.modello.finiture.Foratura;
import it.unibas.scatolificio.modello.finiture.Ifiniture;
import it.unibas.scatolificio.modello.finiture.Martellatura;
import it.unibas.scatolificio.modello.finiture.Quadrettatura;

import org.junit.Assert;

import org.junit.Test;

/**
 *
 * @author gianvito
 */
public class TestProva {
    
    @Test
    public void testScatolificio() {
        Ifiniture foratura = new Foratura();
        IColore dorato = new Dorato();
        
        NullObjectDecorator nullObject = new NullObjectDecorator();
        CartoneDecorator cartone = new CartoneDecorator(foratura, dorato, nullObject);
        PunteggiatturaDecorator punteggiatura = new PunteggiatturaDecorator(cartone);
        StriaturaDecorator striatura = new StriaturaDecorator(punteggiatura);
        FirmataDecorator firmata = new FirmataDecorator(striatura);
        String codice = firmata.getCodice();
        System.out.println(codice);
        double prezzo = firmata.getPrezzo();
        System.out.println(prezzo);
        String nome = firmata.getNome();
        System.out.println(nome);
    }
}
