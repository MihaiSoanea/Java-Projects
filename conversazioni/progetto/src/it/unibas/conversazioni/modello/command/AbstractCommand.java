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
import it.unibas.conversazioni.modello.Utente;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public abstract class AbstractCommand {

    public List<IHandler> listaHandler = initList();

    public abstract List<IHandler> initList();
    public abstract String elabora(Istruzione i, IRC irc);

}
