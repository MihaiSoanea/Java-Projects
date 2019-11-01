/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.datamasking.modello;

import it.unibas.datamasking.eccezioni.DAOException;
import it.unibas.datamasking.modello.chain.GestoreChain;
import it.unibas.datamasking.modello.strategy.IStrategy;
import it.unibas.datamasking.modello.strategy.StrategyDynamic;
import it.unibas.datamasking.modello.Verbale;
import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author gianvito
 */
public class TestProva {

    @Test
    public void testMasking() throws DAOException {
        Calendar calendar = new GregorianCalendar(2010,2,3);
        String testo = "Credendo che fosse il 13/01/2017, giorno del suo compleanno, la mattina del 12/01/2017 il signor Monteverde (cod. fisc. GVNMPP98L01G942X) invio una email a pizza.perte@latuapizza.it ordinando ben 50 pizze da far consegnare alla sua casa vacanza di Metaponto, in Via Cagliari 88 e pagando con un bonifico immediato a IT77J5578744203052570125659 (IBAN della Pizzeria). Quando si rese conto che era il 12/01/2017 si affretto a disdire l ordine ma dalla pizzeria gli dissero che le pizze erano gia state consegnate. Ma come? Lui non era ancora arrivato a Metaponto. Chi c'era a Piazzale Cagliari, 88 ?";
        Verbale verbale = new Verbale("PROVA", testo, calendar);
        GestoreChain gestore = new GestoreChain();
        IStrategy strategy = new StrategyDynamic(gestore);
        String testoOscurato = strategy.elabora(verbale);
        System.out.println(verbale.getTesto());
        System.out.println(testoOscurato);
    }
}
