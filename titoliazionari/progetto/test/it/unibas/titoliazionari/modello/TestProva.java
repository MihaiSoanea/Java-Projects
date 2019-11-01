/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello;

import it.unibas.titoliazionari.controllo.ControlloFiltraggio;
import org.junit.Assert;
import org.junit.Test;
import java.util.GregorianCalendar;
/**
 *
 * @author gianvito
 */
public class TestProva {
    
    ControlloFiltraggio controllo = new ControlloFiltraggio();
    
    @Test
    public void hello() {
        Configurazione c = new Configurazione(null,null, null, "Europa", new GregorianCalendar(2016, 6, 10), new GregorianCalendar(2016, 6, 23));
        double valoreUnico = controllo.filtra(c);
        System.out.println(valoreUnico);
        //Assert.assertTrue(valoreUnico == 9.684319992069637);
    }
}
