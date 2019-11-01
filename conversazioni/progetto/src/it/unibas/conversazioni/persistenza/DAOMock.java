/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.persistenza;

import it.unibas.conversazioni.modello.Canale;
import it.unibas.conversazioni.modello.Utente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mihai Soanea
 */
public class DAOMock {
    
    private Utente u1 = new Utente("Pietro");
    private Utente u2 = new Utente("Luca");
    private Utente u3 = new Utente("Alberto");
    private Canale c1 = new Canale(u1, "Telegram");
    private Canale c2 = new Canale(u1, "Apple");
    private Canale c3 = new Canale(u2, "Windows");
    
    public Map<String,Canale> getMappaCanaliMock(){
        Map<String, Canale> mappa = new HashMap<String, Canale>();
        mappa.put("Apple", c2);
        mappa.put("Windows", c3);
        mappa.put("Telegram", c1);
        return mappa;
    }
    
    public Map<String,Utente> getMappaUtentiMock(){
        Map<String, Utente> mappa = new HashMap<String, Utente>();
        mappa.put("Pietro", u1);
        mappa.put("Luca", u2);
        mappa.put("Alberto", u3);
        return mappa;
    }
}
