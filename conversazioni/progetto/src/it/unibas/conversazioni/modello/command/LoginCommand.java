/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.modello.command;

import it.unibas.conversazioni.modello.Canale;
import it.unibas.conversazioni.modello.IRC;
import it.unibas.conversazioni.modello.Istruzione;
import it.unibas.conversazioni.modello.chain.IHandler;
import it.unibas.conversazioni.modello.chain.VerificaAutenticatoHandler;
import it.unibas.conversazioni.modello.Utente;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */
public class LoginCommand extends AbstractCommand{

    @Override
    public List<IHandler> initList() {
        List<IHandler> lista = new ArrayList<IHandler>();
        lista.add(new VerificaAutenticatoHandler());
        return lista;
    }

    @Override
    public String elabora(Istruzione i, IRC irc) {
        String risultato = "";
        StringBuilder errori = new StringBuilder();
        for(IHandler iHandler : listaHandler){
            risultato = iHandler.verifica(i, irc);
            if(!risultato.equals("")){
                errori.append(risultato).append(" ");
            }
        }
        if(errori.length() > 0){
            return errori.toString();
        }
        Utente u = new Utente(i.getUtente());
        u.setAutenticato(true);
        irc.getMappaUtenti().put(i.getUtente(), u);
        return "...Ciao " + u.getNomeUtente() + "!";
    }

}
