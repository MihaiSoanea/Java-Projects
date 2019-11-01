/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.panini.modello;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author gianvito
 */
public class TestProva {
    
   @Test
    public void testPrezzo() {
        ISigla DOP = new DOP();
 
        NullObject nullObject = new NullObject();
        Focaccia focaccia = new Focaccia(nullObject);
        Caldo caldo = new Caldo(focaccia);
        Bresaola bresaola = new Bresaola(DOP, "nome", "parma", 3, caldo);
        Asiago asiago = new Asiago(bresaola);
        Maionese maionese = new Maionese(asiago);
        Worcester worcester = new Worcester(maionese);
        double prezzoPanino = worcester.getPrezzo();
        
        System.out.println(prezzoPanino);
        Assert.assertEquals(5.5, prezzoPanino);
        
        
        String titoloPanino = worcester.getTitolo();
        System.out.println(titoloPanino);
        Assert.assertEquals("HOT Bresaola DOP Asiago +*", titoloPanino);
        
        HashSet<String> ingredientiPanino =  worcester.getIngredienti();
        System.out.println(ingredientiPanino);
        
    }
}
