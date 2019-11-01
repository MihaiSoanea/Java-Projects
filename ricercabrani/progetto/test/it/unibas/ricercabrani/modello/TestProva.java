/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.modello;


import it.unibas.ricercabrani.modello.chain.GestoreChainDinamica;
import it.unibas.ricercabrani.modello.chain.GestoreChainStatica;
import it.unibas.ricercabrani.modello.chain.IHandlerAbstract;
import it.unibas.ricercabrani.persistenza.DAOBrani;
import org.junit.Test;
import java.util.List;
import java.util.HashSet;
import org.junit.Assert;
import org.junit.Before;

/**
 *
 * @author gianvito
 */
public class TestProva {
    
    private String r1 = "+casa -scuola"; //OK
    private String r2 = "*casa -scuola"; //OK
    private String r3 = "+casa -scuola +albergo";
    private String r4 = "_cas _alber -albergo"; //CASO PARTICOLARE OK
    private String r5 = "<pomeriggio *casa"; //OK
    private String r6 = "<pomeriggio +casa"; //OK
    
    private DAOBrani daObrani;
    private GestoreChainStatica gestore1;
    private GestoreChainDinamica gestore2 ;
    
    @Before
    public void setUpTest(){
         daObrani = new DAOBrani();
         gestore1 = new GestoreChainStatica();
         gestore2 = new GestoreChainDinamica();
    }
   
    @Test
    public void hello() {
        List<IHandlerAbstract> listHandlerTrovati = gestore1.getChainDinamica(r1);
        System.out.println(listHandlerTrovati.toString());
        gestore2.setListaHandlerRicerca(listHandlerTrovati);
        HashSet<Brano> braniTrovati = gestore2.ricerca();
        Assert.assertTrue(braniTrovati.size() == 2);
        System.out.println(braniTrovati);
        System.out.println(braniTrovati.size());
        List<Brano> brani = daObrani.getListaBrani();

        //Assert.assertTrue(braniTrovati.contains(brani.get(0)));
        //Assert.assertTrue(braniTrovati.contains(brani.get(2)));
    }
    
    @Test
    public void hello2() {
        List<IHandlerAbstract> listHandlerTrovati = gestore1.getChainDinamica(r2);
        System.out.println(listHandlerTrovati.toString());
        gestore2.setListaHandlerRicerca(listHandlerTrovati);
        HashSet<Brano> braniTrovati = gestore2.ricerca();
        System.out.println(braniTrovati);
        System.out.println(braniTrovati.size());
        Assert.assertTrue(braniTrovati.size() == 1);
        
        List<Brano> brani = daObrani.getListaBrani();
        //Assert.assertTrue(braniTrovati.contains(brani.get(1)));
        //Assert.assertTrue(braniTrovati.contains(brani.get(2)));
    }
    
    @Test
    public void hello3() {
        List<IHandlerAbstract> listHandlerTrovati = gestore1.getChainDinamica(r4);
        System.out.println(listHandlerTrovati.toString());
        gestore2.setListaHandlerRicerca(listHandlerTrovati);
        HashSet<Brano> braniTrovati = gestore2.ricerca();
        System.out.println(braniTrovati);
        System.out.println(braniTrovati.size());
        Assert.assertTrue(braniTrovati.size() == 1);
        
        List<Brano> brani = daObrani.getListaBrani();
        //Assert.assertTrue(braniTrovati.contains(brani.get(1)));
        //Assert.assertTrue(braniTrovati.contains(brani.get(2)));
    }
    
    @Test
    public void hello4() {
        List<IHandlerAbstract> listHandlerTrovati = gestore1.getChainDinamica(r6);
        System.out.println(listHandlerTrovati.toString());
        gestore2.setListaHandlerRicerca(listHandlerTrovati);
        HashSet<Brano> braniTrovati = gestore2.ricerca();
        System.out.println(braniTrovati);
        System.out.println(braniTrovati.size());
        Assert.assertTrue(braniTrovati.size() == 0);
        List<Brano> brani = daObrani.getListaBrani();
        //Assert.assertTrue(braniTrovati.contains(brani.get(1)));
        //Assert.assertTrue(braniTrovati.contains(brani.get(2)));
    }
    
    @Test
    public void hello5() {
        List<IHandlerAbstract> listHandlerTrovati = gestore1.getChainDinamica(r3);
        System.out.println(listHandlerTrovati.toString());
        gestore2.setListaHandlerRicerca(listHandlerTrovati);
        HashSet<Brano> braniTrovati = gestore2.ricerca();
        System.out.println(braniTrovati);
        System.out.println(braniTrovati.size());
        Assert.assertTrue(braniTrovati.size() == 1);
        List<Brano> brani = daObrani.getListaBrani();
        //Assert.assertTrue(braniTrovati.contains(brani.get(1)));
        //Assert.assertTrue(braniTrovati.contains(brani.get(2)));
    }
    
    @Test
    public void hello6() {
        List<IHandlerAbstract> listHandlerTrovati = gestore1.getChainDinamica(r5);
        System.out.println(listHandlerTrovati.toString());
        gestore2.setListaHandlerRicerca(listHandlerTrovati);
        HashSet<Brano> braniTrovati = gestore2.ricerca();
        System.out.println(braniTrovati);
        System.out.println(braniTrovati.size());
        Assert.assertTrue(braniTrovati.size() == 1);
        List<Brano> brani = daObrani.getListaBrani();
        //Assert.assertTrue(braniTrovati.contains(brani.get(1)));
        //Assert.assertTrue(braniTrovati.contains(brani.get(2)));
    }
}
