/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.persistenza;

import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Volo;
import it.unibas.aer.modello.state.InOrarioState;
import java.util.GregorianCalendar;

/**
 *
 * @author Mihai Soanea
 */
public class DAOMockAereoporto {
    
    public static Aereoporto carica(){
        Aereoporto a = new Aereoporto("Aereoporto di Napoli");
        a.setOrarioDiBase(new GregorianCalendar(2019, 1, 3, 11, 00) );
        Volo v1 = new Volo("codice", "Amsterdam", false, true, new GregorianCalendar(2019, 1, 3, 10, 10) , new InOrarioState());
        Volo v2 = new Volo("codice", "Barcellona", false, true, new GregorianCalendar(2019, 1, 3, 11, 00), new InOrarioState());
        Volo v3 = new Volo("codice", "Londra", false, true,new GregorianCalendar(2019, 1, 3, 11, 20), new InOrarioState());
        Volo v4 = new Volo("codice", "Berlino", false, true, new GregorianCalendar(2019, 1, 3, 10, 05), new InOrarioState());
        v1.getState().gestisciVolo(a, v1);
        v2.getState().gestisciVolo(a, v2);
        v3.getState().gestisciVolo(a, v3);
        v4.getState().gestisciVolo(a, v4);
        v2.impostaCancellato("per avaria");
        v2.getState().gestisciVolo(a, v2);
        v3.impostaPartito(new GregorianCalendar(2019, 1, 3, 10, 55));
        v3.getState().gestisciVolo(a, v3);
        a.addVolo(v1);
        a.addVolo(v2);
        a.addVolo(v3);
        a.addVolo(v4);
        return a;
    }
}
