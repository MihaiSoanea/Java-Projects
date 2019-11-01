/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.modello;

import it.unibas.conversazioni.modello.IRC;
import it.unibas.conversazioni.modello.Istruzione;
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
    public void testIRC1(){
        Istruzione i1 = new Istruzione("Pietro", "LOGIN", null, null);
        Istruzione i2 = new Istruzione("Pietro", "CREATE", "Apple", null);
        Istruzione i3 = new Istruzione("Luca", "LOGIN", null, null);
        Istruzione i4 = new Istruzione("Luca", "LOGIN", null, null);
        Istruzione i5 = new Istruzione("Luca", "CREATE", "Apple", null);
        Istruzione i6 = new Istruzione("Luca", "DELETE", "Apple", null);
        Istruzione i7 = new Istruzione("Pietro", "IN", "Apple", "Ciao ragazzi!");
        Istruzione i8 = new Istruzione("Luca", "JOIN", "Apple", null);
        Istruzione i9 = new Istruzione("Pietro", "GETUSERS", "Apple", null);
        Istruzione i10 = new Istruzione("Luca", "IN", "Apple", "Bello questo canale!");
        Istruzione i11 = new Istruzione("Luca", "EXIT", "Apple", null);
        Istruzione i12 = new Istruzione("Pietro", "GETUSERS", "Apple", null);
        IRC irc1 = new IRC();
        String risultato1 = irc1.sottoscriviOperazione(i1, irc1);
        String risultato2 = irc1.sottoscriviOperazione(i2, irc1);
        String risultato3 = irc1.sottoscriviOperazione(i3, irc1);
        String risultato4 = irc1.sottoscriviOperazione(i4, irc1);
        String risultato5 = irc1.sottoscriviOperazione(i5, irc1);
        String risultato6 = irc1.sottoscriviOperazione(i6, irc1);
        String risultato7 = irc1.sottoscriviOperazione(i7, irc1);
        String risultato8 = irc1.sottoscriviOperazione(i8, irc1);
        String risultato9 = irc1.sottoscriviOperazione(i9, irc1);
        String risultato10 = irc1.sottoscriviOperazione(i10, irc1);
        String risultato11 = irc1.sottoscriviOperazione(i11, irc1);
        String risultato12 = irc1.sottoscriviOperazione(i12, irc1);
        
        System.out.println(risultato1.toString());
        System.out.println(risultato2.toString());
        System.out.println(risultato3.toString());
        System.out.println(risultato4.toString());
        System.out.println(risultato5.toString());
        System.out.println(risultato6.toString());
        System.out.println(risultato7.toString());
        System.out.println(risultato8.toString());
        System.out.println(risultato9.toString());
        System.out.println(risultato10.toString());
        System.out.println(risultato11.toString());
        System.out.println(risultato12.toString());
    }
    
    @Test
    public void testIRC2(){
        Istruzione i1 = new Istruzione("Pietro", "LOGIN", null, null);
        Istruzione i2 = new Istruzione("Pietro", "CREATE", "Apple", null);
        Istruzione i3 = new Istruzione("Pietro", "CREATE", "Apple", null);
        Istruzione i4 = new Istruzione("Luca", "LOGIN", null, null);
        Istruzione i5 = new Istruzione("Luca", "SENDTK", "Apple", null);
        Istruzione i6 = new Istruzione("Luca", "JOIN", "Windows", null);
        Istruzione i7 = new Istruzione("Luca", "JOIN", "Apple", null);
        Istruzione i8 = new Istruzione("Luca", "JOIN", "Apple", null);
        Istruzione i9 = new Istruzione("Pietro", "IN", "Windows", "Ciao ragazzi!");
        Istruzione i16 = new Istruzione("Alberto", "IN", "Apple", "Ehi!");
        Istruzione i10 = new Istruzione("Alberto", "LOGIN", null, null);
        Istruzione i11 = new Istruzione("Alberto", "IN", "Apple", "Ehi!");
        Istruzione i12 = new Istruzione("Alberto", "JOIN", "Apple", null);
        Istruzione i13 = new Istruzione("Alberto", "IN", "Apple", "Ehi! Ma quanti siamo oggi?");
        Istruzione i14 = new Istruzione("Alberto", "GETUSERS", "Apple", null);
        Istruzione i15 = new Istruzione("Pietro", "GETUSERS", "Apple", null);
        IRC irc2 = new IRC();
        String risultato1 = irc2.sottoscriviOperazione(i1, irc2);
        String risultato2 = irc2.sottoscriviOperazione(i2, irc2);
        String risultato3 = irc2.sottoscriviOperazione(i3, irc2);
        String risultato4 = irc2.sottoscriviOperazione(i4, irc2);
        String risultato5 = irc2.sottoscriviOperazione(i5, irc2);
        String risultato6 = irc2.sottoscriviOperazione(i6, irc2);
        String risultato7 = irc2.sottoscriviOperazione(i7, irc2);
        String risultato8 = irc2.sottoscriviOperazione(i8, irc2);
        String risultato9 = irc2.sottoscriviOperazione(i9, irc2);
        String risultato16 = irc2.sottoscriviOperazione(i16, irc2);
        String risultato10 = irc2.sottoscriviOperazione(i10, irc2);
        String risultato11 = irc2.sottoscriviOperazione(i11, irc2);
        String risultato12 = irc2.sottoscriviOperazione(i12, irc2);
        String risultato13 = irc2.sottoscriviOperazione(i13, irc2);
        String risultato14 = irc2.sottoscriviOperazione(i14, irc2);
        String risultato15 = irc2.sottoscriviOperazione(i15, irc2);

        System.out.println(risultato1.toString());
        System.out.println(risultato2.toString());
        System.out.println(risultato3.toString());
        System.out.println(risultato4.toString());
        System.out.println(risultato5.toString());
        System.out.println(risultato6.toString());
        System.out.println(risultato7.toString());
        System.out.println(risultato8.toString());
        System.out.println(risultato9.toString());
        System.out.println(risultato16.toString());
        System.out.println(risultato10.toString());
        System.out.println(risultato11.toString());
        System.out.println(risultato12.toString());
        System.out.println(risultato13.toString());
        System.out.println(risultato14.toString());
        System.out.println(risultato15.toString());
    }
}
