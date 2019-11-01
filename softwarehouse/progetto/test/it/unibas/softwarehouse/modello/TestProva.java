/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello;

import it.unibas.softwarehouse.modello.composite.Pagina;
import it.unibas.softwarehouse.modello.composite.Portale;
import it.unibas.softwarehouse.modello.composite.Sezione;
import it.unibas.softwarehouse.modello.strategy.IStrategy;
import it.unibas.softwarehouse.modello.strategy.PagineEstereStrategy;
import it.unibas.softwarehouse.modello.strategy.PagineItaliaStrategy;
import it.unibas.softwarehouse.modello.strategy.TempoMedioStrategy;
import it.unibas.softwarehouse.modello.strategy.URLPagineStrategy;
import it.unibas.softwarehouse.modello.visitor.IVisitor;
import it.unibas.softwarehouse.modello.visitor.VisitorStampa;
import it.unibas.softwarehouse.modello.visitor.VisitorStrategia;
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
        Portale portale = new Portale("www.unibas.it", "IP: 10.123.123.3");
        Sezione sezione1 = new Sezione("/ateneo");
        Pagina pagina1 = new Pagina("/index.html");
        View view9 = new View("Spagna", "www.google.it", "www.unibas.it", "Opera", 20);
        pagina1.addViews(view9);
        Pagina pagina2 = new Pagina("/contatti.html");
        View view11 = new View("Spagna", "www.google.it", "www.unibas.it", "Opera", 20);
        pagina2.addViews(view11);
        Sezione sezione2 = new Sezione("/strutture");
        Pagina pagina4 = new Pagina("/scuola_ing.html");
        View view1 = new View("Italia", "www.google.it", "www.unibas.it", "Chrome", 20);
        View view2 = new View("Italia", "www.yahoo.it", "www.unibas.it", "Chrome", 120);
        View view3 = new View("Italia", "www.bing.it", "www.unibas.it", "Firefox", 160);
        View view4 = new View("USA", null, "www.unibas.it", "Safari", 160);
        pagina4.addViews(view1);
        pagina4.addViews(view2);
        pagina4.addViews(view3);
        pagina4.addViews(view4);
        Pagina pagina5 = new Pagina("/dimie.html");
        View view14 = new View("Spagna", "www.yahoo.it", "www.unibas.it", "Safari", 220);
        View view10 = new View("Spagna", "www.bing.it", "www.unibas.it", "Safari", 220);
        pagina5.addViews(view14);
        pagina5.addViews(view10);
        Pagina pagina6 = new Pagina("/disu.html");
        View view5 = new View("Spagna", "www.google.it", "www.unibas.it", "Opera", 20);
        View view6 = new View("Spagna", "www.go.it", "www.unibas.it", "Safari", 220);
        View view7 = new View("Francia", "www.ahha.it", "www.google.it", "Firefox", 190);
        View view8 = new View("UK", null, "www.unibas.it", "Safari", 160);
        pagina6.addViews(view5);
        pagina6.addViews(view6);
        pagina6.addViews(view7);
        pagina6.addViews(view8);
        Pagina pagina7 = new Pagina("/scuola_arg.html");
        View view13 = new View("Italia", "www.it", "www.unibas.it", "Safari", 220);
        pagina7.addViews(view13);
        sezione2.addContenutoSezione(pagina4);
        sezione2.addContenutoSezione(pagina5);
        sezione2.addContenutoSezione(pagina6);
        sezione2.addContenutoSezione(pagina7);
        Sezione sezione3 = new Sezione("/studenti");
        Pagina pagina3 = new Pagina("/login.html");
        View view12 = new View("Italia", "www.google.it", "www.unibas.it", "Safari", 220);
        pagina3.addViews(view12);
        portale.addContenuti(sezione1);
        sezione1.addContenutoSezione(pagina1);
        sezione1.addContenutoSezione(pagina2);
        sezione1.addContenutoSezione(sezione2);
        sezione1.addContenutoSezione(sezione3);
        sezione1.addContenutoSezione(pagina3);
        IStrategy strategia1 = new PagineEstereStrategy(51);
        IStrategy strategia2 = new PagineItaliaStrategy(51);

        IVisitor visitor = new VisitorStrategia(strategia2);
        portale.accept(visitor);
        List<Pagina> listaTrovate = visitor.getListaPagineTrovate();
        System.out.println(listaTrovate.size());
        Assert.assertTrue(listaTrovate.size() == 2);
        
        IVisitor visitor2 = new VisitorStrategia(strategia1);
        portale.accept(visitor2);
        List<Pagina> listaTrovate2 = visitor2.getListaPagineTrovate();
        System.out.println(listaTrovate2.size());
        Assert.assertTrue(listaTrovate2.size() == 3);
    
        IVisitor visitorstampa = new VisitorStampa();
        portale.accept(visitorstampa);
        StringBuilder s = visitorstampa.getSb();
        System.out.println(s);
    
    }
}
