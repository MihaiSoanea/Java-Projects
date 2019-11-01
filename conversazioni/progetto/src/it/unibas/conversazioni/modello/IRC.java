/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.modello;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Mihai Soanea
 */
public class IRC {
    
    private Mediator mediator = new Mediator();
    private Map<String, Canale> mappaCanali = new HashMap<String, Canale>();
    private Map<String, Utente> mappaUtenti = new HashMap<String, Utente>();

    public Map<String, Canale> getMappaCanali() {
        return mappaCanali;
    }

    public Map<String, Utente> getMappaUtenti() {
        return mappaUtenti;
    }

    public String sottoscriviOperazione(Istruzione i, IRC irc){ 
        return mediator.eseguiComando(i, this);
    }

    public void setMappaCanali(Map<String, Canale> mappaCanali) {
        this.mappaCanali = mappaCanali;
    }

    public void setMappaUtenti(Map<String, Utente> mappaUtenti) {
        this.mappaUtenti = mappaUtenti;
    }
    
    
    
}
