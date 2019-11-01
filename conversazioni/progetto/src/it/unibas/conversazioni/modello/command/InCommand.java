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
import it.unibas.conversazioni.modello.chain.VerificaCanaleHandler;
import it.unibas.conversazioni.modello.chain.VerificaJoinHandler;
import it.unibas.conversazioni.modello.chain.VerificaLoginHandler;
import it.unibas.conversazioni.modello.Utente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public class InCommand extends AbstractCommand{

    @Override
    public List<IHandler> initList() {
        List<IHandler> lista = new ArrayList<IHandler>();
        lista.add(new VerificaLoginHandler());
        lista.add(new VerificaCanaleHandler());
        lista.add(new VerificaJoinHandler());
        return lista;
    }

    @Override
    public String elabora(Istruzione i, IRC irc) {
        String risultato = "";
        for(IHandler iHandler : listaHandler){
            risultato = iHandler.verifica(i, irc);
            if(!risultato.equals("")){
                return risultato.toString();
            }
        }
        String messaggio = i.getMessaggio();
        Canale c = irc.getMappaCanali().get(i.getNomeCanale());
        Utente u = irc.getMappaUtenti().get(i.getUtente());
        c.addMessaggio(messaggio);
        return "(" + u.getNomeUtente()+ ") " + messaggio;
    }

}
