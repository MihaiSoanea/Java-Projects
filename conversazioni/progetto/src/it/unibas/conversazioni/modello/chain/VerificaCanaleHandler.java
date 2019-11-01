/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.modello.chain;

import it.unibas.conversazioni.modello.Canale;
import it.unibas.conversazioni.modello.IRC;
import it.unibas.conversazioni.modello.Istruzione;
import it.unibas.conversazioni.modello.Utente;

/**
 *
 * @author Mihai Soanea
 */
public class VerificaCanaleHandler implements IHandler{

    public String verifica(Istruzione i, IRC irc) {
        Canale c = irc.getMappaCanali().get(i.getNomeCanale());
        if(c == null){
            return "...Canale non trovato";
        }
        return "";
    }
    
}
