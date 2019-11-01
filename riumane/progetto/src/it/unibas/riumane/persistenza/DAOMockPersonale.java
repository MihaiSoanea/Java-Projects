/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.persistenza;

import it.unibas.riumane.modello.composite.AbstractPersona;
import it.unibas.riumane.modello.composite.Manager;
import it.unibas.riumane.modello.composite.NoManager;
import java.util.GregorianCalendar;

/**
 *
 * @author Mihai Soanea
 */
public class DAOMockPersonale {
      
    public static AbstractPersona carica(){
        Manager manager1 = new Manager("Fabio", "Rossi", "ajaaaj", new GregorianCalendar(1945, 3,4), new GregorianCalendar(1965, 2,6), "Amministratore Delegato");
        Manager manager2 = new Manager("Mario", "Neri", "ajaaaj", new GregorianCalendar(1950,2,3), new GregorianCalendar(1970,4,5), "Direttore Marketing");
        Manager manager3 = new Manager("Maria", "Sfaticata", "ahahaj", new GregorianCalendar(1955,2,3), new GregorianCalendar(1975,4,5), "Direttore Produzione");
        NoManager nomanager1 = new NoManager("Luca", "Verdi", "aksjka", new GregorianCalendar(1963, 2, 23), new GregorianCalendar(1985,12, 20), false, 15, 20);
        NoManager nomanager2 = new NoManager("Lucia", "Gravida", "adhjdha", new GregorianCalendar(1940, 2, 23), new GregorianCalendar(1995,12, 20), false,24,70);
        NoManager nomanager3 = new NoManager("Filippo", "Bianchi", "ajhua", new GregorianCalendar(1995, 2, 23), new GregorianCalendar(1958,12, 20),false,29,25);
        NoManager nomanager4 = new NoManager("Antonio", "Bari", "ajhdhfj", new GregorianCalendar(1947, 2, 23), new GregorianCalendar(1968,12, 20),true,60,89);
        NoManager nomanager5 = new NoManager("Michele", "Taranto", "aididjaj", new GregorianCalendar(1990, 2, 23), new GregorianCalendar(1955,12, 20),true,39, 69);
        NoManager nomanager6 = new NoManager("Luca", "Brindisi", "ifjaif", new GregorianCalendar(1980, 2, 23), new GregorianCalendar(2010,12, 20),true,70,40);
        manager1.addSottoposti(manager2);
        manager2.addSottoposti(nomanager1);
        manager2.addSottoposti(nomanager2);
        manager1.addSottoposti(nomanager3);
        manager1.addSottoposti(manager3);
        manager3.addSottoposti(nomanager4);
        manager3.addSottoposti(nomanager5);
        manager3.addSottoposti(nomanager6);
        return manager1;
    }
}
