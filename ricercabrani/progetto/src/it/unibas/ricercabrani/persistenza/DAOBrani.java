/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.persistenza;

import it.unibas.ricercabrani.modello.Brano;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Mihai Soanea
 */
public class DAOBrani {
    
    Brano b1 = new Brano("La mia storia", "Quel giorno di Giugno, era un mercoledì, inizia la mia storia, immerso in mille pensieri all’improvviso mi accorsi che lei era proprio lì, davanti a me, con un torta di mele e noci dall’aspetto invitante. Mi sentivo già a casa .", new GregorianCalendar(2013,12,12,2,0));
    Brano b2 = new Brano("Vacanza in puglia", "A dire il vero cercavo una casa per le vacanze che avesse un albero secolare, enorme, sotto cui sostare nei caldi pomeriggi d’estate ascoltando il frinire ritmico delle cicale ed immaginando la mia vecchia casa vacanze .", new GregorianCalendar(2017,12,12,2,0));
    Brano b3 = new Brano("AlberoBello", "Ed è così che finii ad Alberobello, immerso tra i pittoreschi trulli che delineano il costone ovest del paesaggio pugliese, dove trovi un solo albergo , bianco anch esso, anch esso un trullo, ma accogliente come casa .", new GregorianCalendar(2018,12,12,2,0));
    
    public List<Brano> getListaBrani(){
        List<Brano> tuttiBrani = new ArrayList<Brano>();
        tuttiBrani.add(b1);
        tuttiBrani.add(b2);
        tuttiBrani.add(b3);
        return tuttiBrani;
    }
}
