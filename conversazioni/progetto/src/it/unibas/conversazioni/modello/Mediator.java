/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.conversazioni.modello;
import it.unibas.conversazioni.modello.command.CreateCommand;
import it.unibas.conversazioni.modello.command.DeleteCommand;
import it.unibas.conversazioni.modello.command.ExitCommand;
import it.unibas.conversazioni.modello.command.GetUsersCommand;
import it.unibas.conversazioni.modello.command.AbstractCommand;
import it.unibas.conversazioni.modello.command.InCommand;
import it.unibas.conversazioni.modello.command.JoinCommand;
import it.unibas.conversazioni.modello.command.LoginCommand;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Mihai Soanea
 */
public class Mediator {

    private Map<String, AbstractCommand> mappaComandi = initMap();

    private Map<String, AbstractCommand> initMap(){
        Map<String, AbstractCommand> momentanea = new HashMap<String, AbstractCommand>();
        momentanea.put("LOGIN", new LoginCommand());
        momentanea.put("CREATE", new CreateCommand());
        momentanea.put("DELETE", new DeleteCommand());
        momentanea.put("GETUSERS", new GetUsersCommand());
        momentanea.put("IN", new InCommand());
        momentanea.put("EXIT", new ExitCommand());
        momentanea.put("JOIN", new JoinCommand());
        return momentanea;
    }
    
    public String eseguiComando(Istruzione i, IRC irc){
        AbstractCommand com = mappaComandi.get(i.getComando());
        if(com == null){
             return "...Comando sconosciuto";
        }
        return com.elabora(i, irc);
    }

    
}
