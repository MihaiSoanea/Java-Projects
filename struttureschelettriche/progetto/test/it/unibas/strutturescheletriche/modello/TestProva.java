/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello;

import it.unibas.strutturescheletriche.modello.strategy.IStrategy;
import it.unibas.strutturescheletriche.modello.strategy.StrategyIndividuo;
import it.unibas.strutturescheletriche.modello.visitor.IVisitor;
import it.unibas.strutturescheletriche.modello.visitor.VisitorIndividuo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;

/**
 *
 * @author gianvito
 */
public class TestProva {

    @Test
    public void hello() {
        OssoIntermedioComposite scapola = new OssoIntermedioComposite("scapola", 0.3, 0.2, 0.3);
        OssoIntermedioComposite omero = new OssoIntermedioComposite("omero", 0.5, 0.7, 0.8);
        scapola.addOssa(omero);
        
        OssoIntermedioComposite radio = new OssoIntermedioComposite("radio", 0.2, 0.3, 0.7);
        OssoIntermedioComposite ulna = new OssoIntermedioComposite("ulna", 0.6, 0.1, 0.7);
        omero.addOssa(radio);
        omero.addOssa(ulna);
        
        OssoIntermedioComposite clavicola = new OssoIntermedioComposite("clavicola", 0.7, 0.4, 0.2);
        OssoIntermedioComposite scapola1 = new OssoIntermedioComposite("scapola", 0.3, 0.2, 0.3);
        clavicola.addOssa(scapola1);
        
        OssoIntermedioComposite omero1 = new OssoIntermedioComposite("omero", 0.5, 0.7, 0.8);
        scapola1.addOssa(omero1);
        
        OssoIntermedioComposite radio1 = new OssoIntermedioComposite("radio", 0.2, 0.3, 0.7);
        OssoIntermedioComposite ulna1 = new OssoIntermedioComposite("ulna", 0.6, 0.1, 0.7);
        omero1.addOssa(radio1);
        omero1.addOssa(ulna1);
        
        VisitorIndividuo visitaIndividuo = new VisitorIndividuo();
        scapola.accept(visitaIndividuo);
        List<AbstractOssoComposite> risultato = visitaIndividuo.getRisultato();
        
        VisitorIndividuo visitaIndividuo2 = new VisitorIndividuo();
        clavicola.accept(visitaIndividuo2);
        clavicola.accept(visitaIndividuo2);
        List<AbstractOssoComposite> risultato2 = visitaIndividuo2.getRisultato();
        
        IStrategy strategy = new StrategyIndividuo();
        String s = ("NON SIMILI A LIVELLO DI INDIVIDUO");
        Assert.assertEquals(s, strategy.confronta(risultato, risultato2));
    }
}
