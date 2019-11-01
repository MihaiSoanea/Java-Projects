/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.fs.modello;

import it.unibas.fs.modello.composite.Cartella;
import it.unibas.fs.modello.composite.FileAltro;
import it.unibas.fs.modello.composite.FileHTML;
import it.unibas.fs.modello.composite.FileJPG;
import it.unibas.fs.modello.visitor.IVisitor;
import it.unibas.fs.modello.visitor.VisitorCalcola;
import it.unibas.fs.modello.visitor.VisitorStampa;
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
    public void hello() {
        Cartella cartella = new Cartella("tmp");
        Cartella cartella2 = new Cartella("icons");
        Cartella cartella3 = new Cartella("varie");
        FileHTML html1 = new FileHTML("prova", ".html");
        FileAltro altro1 = new FileAltro("dati", ".txt");
        FileJPG jpg1 = new FileJPG("bottone", ".jpg");
        FileJPG jpg2 = new FileJPG("prova", ".jpg");
        
        cartella.addFile(html1);
        cartella.addFile(altro1);
        cartella.addFile(cartella2);
        cartella2.addFile(jpg1);
        cartella2.addFile(cartella3);
        cartella3.addFile(jpg2);
        
        IVisitor visitoStampa = new VisitorStampa();
        cartella.accept(visitoStampa);
        String s = visitoStampa.getSb();
        System.out.println(s);
        

        IVisitor visitoCalcola = new VisitorCalcola(".jpg");
        cartella.accept(visitoCalcola);
        int i = visitoCalcola.getCount();
        int k = visitoCalcola.getCountSottoCartelle();
        System.out.println("SottoCartelle: " +k);
        System.out.println("File corrispondenti: " +i);
    }
}
