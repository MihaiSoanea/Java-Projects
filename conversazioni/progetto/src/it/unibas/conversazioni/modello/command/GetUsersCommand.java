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
import it.unibas.conversazioni.modello.chain.VerificaLoginHandler;
import it.unibas.conversazioni.modello.Utente;
import it.unibas.conversazioni.modello.chain.VerificaOwnerHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public class GetUsersCommand extends AbstractCommand{

    @Override
    public List<IHandler> initList() {
        List<IHandler> lista = new ArrayList<IHandler>();
        lista.add(new VerificaCanaleHandler());
        lista.add(new VerificaLoginHandler());
        lista.add(new VerificaOwnerHandler());
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
        Canale c = irc.getMappaCanali().get(i.getNomeCanale());
        return "..." + c.getListaIscritti().toString();
    }

}
