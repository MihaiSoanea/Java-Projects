/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.persistenza;
import it.unibas.titoliazionari.Costanti;
import it.unibas.titoliazionari.modello.Quotazione;
import it.unibas.titoliazionari.modello.Titolo;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
/**
 *
 * @author Mihai Soanea
 */
public class DAOTitoli {
    
    public List<Titolo> tuttiTitoli(){
        List<Titolo> tuttiTitoli = new ArrayList<Titolo>();
    //Titolo t1 = new Titolo("FCA Bond+", "FCA S.p.A.", Costanti.TIPOLOGIA_OBBLIGAZIONALE, Costanti.SETTORE_INDUSTRIA, Costanti.AREAGEOGRAFICA_EUROPA, new GregorianCalendar(2013,7,18));
    //Titolo t2 = new Titolo("FCA Super", "FCA S.p.A.", Costanti.TIPOLOGIA_AZIONARIO, Costanti.SETTORE_SERVIZI, Costanti.AREAGEOGRAFICA_EUROPA, new GregorianCalendar(2013, 1,18));
    //Titolo t3 = new Titolo("Comm30", "At&T Corp", Costanti.TIPOLOGIA_AZIONARIO, Costanti.SETTORE_TECNOLOGIA, Costanti.AREAGEOGRAFICA_AMERICA, new GregorianCalendar(1982, 7,1));
        
        Titolo t1 = new Titolo("FCA Bond+", "FCA S.p.A.", "Obbligazionale", "Industria", "Europa", new GregorianCalendar(2013,7,18));
        Titolo t2 = new Titolo("FCA Super", "FCA S.p.A.", "Azionario", "Servizi", "Europa", new GregorianCalendar(2013, 1,18));
        Titolo t3 = new Titolo("Comm30", "At&T Corp", "Azionario", "Tecnologia", "America", new GregorianCalendar(1982, 7,1));
        Quotazione q1 = new Quotazione(19.78, new GregorianCalendar(2016, 6, 10));
        Quotazione q2 = new Quotazione(19.77, new GregorianCalendar(2016, 6, 12));
        Quotazione q3 = new Quotazione(19.75, new GregorianCalendar(2016, 6, 12));
        Quotazione q4 = new Quotazione(19.79, new GregorianCalendar(2016, 6, 13));
        Quotazione q5 = new Quotazione(19.85, new GregorianCalendar(2016, 6, 24));
        Quotazione q6 = new Quotazione(139.99, new GregorianCalendar(2016, 6, 22));
        Quotazione q7 = new Quotazione(139.94, new GregorianCalendar(2016, 6, 21));
        Quotazione q8 = new Quotazione(138.94, new GregorianCalendar(2016, 6, 22));
        Quotazione q9 = new Quotazione(137.64, new GregorianCalendar(2016, 6, 23));
        Quotazione q10 = new Quotazione(29.79, new GregorianCalendar(2016, 6, 20));
        Quotazione q11 = new Quotazione(30.01, new GregorianCalendar(2016, 6, 21));
        Quotazione q12 = new Quotazione(36.06, new GregorianCalendar(2016, 6, 22));
        t1.addQuotazioni(q1);
        t1.addQuotazioni(q2);
        t1.addQuotazioni(q3);
        t1.addQuotazioni(q4);
        t1.addQuotazioni(q5);
        t2.addQuotazioni(q6);
        t2.addQuotazioni(q7);
        t2.addQuotazioni(q8);
        t2.addQuotazioni(q9);
        t3.addQuotazioni(q10);
        t3.addQuotazioni(q11);
        t3.addQuotazioni(q12);
        tuttiTitoli.add(t1);
        tuttiTitoli.add(t2);
        tuttiTitoli.add(t3);
        return tuttiTitoli;
    }
}
