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
import it.unibas.conversazioni.modello.chain.VerificaCanaleEsistenteHandler;
import it.unibas.conversazioni.modello.chain.VerificaLoginHandler;
import it.unibas.conversazioni.modello.Utente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public class CreateCommand extends AbstractCommand{
    
    public String elabora(Istruzione i, IRC irc){
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
        Utente u = irc.getMappaUtenti().get(i.getUtente());
        Canale c = new Canale(u, i.getNomeCanale());
        irc.getMappaCanali().put(i.getNomeCanale(), c);
        u.addCanale(c);
        c.addIscritti(u);
        return "...Canale creato!";
    }

    @Override
    public List<IHandler> initList() {
        List<IHandler> lista = new ArrayList<IHandler>();
        lista.add(new VerificaCanaleEsistenteHandler());
        lista.add(new VerificaLoginHandler());
        return lista;
    }

}
