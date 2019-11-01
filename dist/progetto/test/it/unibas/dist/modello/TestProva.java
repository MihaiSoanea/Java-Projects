/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.dist.modello;

import it.unibas.dist.modello.decorator.FreddoDecorator;
import it.unibas.dist.modello.decorator.PannaDecorator;
import it.unibas.dist.modello.decorator.VetroDecorator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author gianvito
 */
public class TestProva {
    
 
    @Test
    public void hello() {
        CaffeEspresso caffe = new CaffeEspresso();
        PannaDecorator panna  = new PannaDecorator(caffe);
        FreddoDecorator freddo = new FreddoDecorator(panna);
        Distributore d = new Distributore();
        d.setBevanda(freddo);
        //System.out.println(d.scontrino().toString());
        String s = "Espressino freddo\nCosto: 0.7 €\n" + DateFormat.getDateInstance().format(new Date());
        //System.out.println(s);
        Assert.assertEquals(s, d.scontrino());
    }
}
