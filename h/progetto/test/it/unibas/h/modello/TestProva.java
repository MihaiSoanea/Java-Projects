/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello;

import it.unibas.h.modello.composite.AbstractHost;
import it.unibas.h.modello.composite.Host;
import it.unibas.h.modello.visitor.IVisitor;
import it.unibas.h.modello.visitor.VisitorStampa;
import org.junit.Test;

/**
 *
 * @author gianvito
 */
public class TestProva {
    private AbstractHost it, unibas, www, studenti, mx, amazon, governo, exchange, ospedalesancarlo;
    private Protocollo HTTP, FTP, SMTP, POP;
    private IVisitor visitor;
    
    @Test
    public void hello() {
        it = new Host("it","13.16.25.1");
            unibas = new Host("unibas", "7.36.25.9");
            it.addHost(unibas);
            www = new Host("www", "173.165.6.109");
                HTTP = new Protocollo("HTTP", 3136);
                FTP = new Protocollo ("FTP", 396);
                www.addProtocolli(HTTP);
                www.addProtocolli(FTP); 
            studenti = new Host("studenti", "173.165.6.29");
                HTTP = new Protocollo("HTTP", 1236);
                studenti.addProtocolli(HTTP);
            mx = new Host("mx", "173.165.6.77");
                SMTP = new Protocollo("SMTP", 365);
                POP = new Protocollo ("POP", 930);
                mx.addProtocolli(SMTP);
                mx.addProtocolli(POP);
            unibas.addHost(www);
            unibas.addHost(studenti);
            unibas.addHost(mx);
            amazon = new Host("amazon", "129.159.230.7");
                www = new Host("www", "13.15.6.89");
                    HTTP = new Protocollo("HTTP", 31325);
                    www.addProtocolli(HTTP);
                exchange = new Host("exchange", "13.15.6.99");
                    FTP = new Protocollo ("FTP", 236);
                    exchange.addProtocolli(FTP);
            amazon.addHost(www);
            amazon.addHost(exchange);
            it.addHost(amazon);
            governo = new Host("governo", "19.59.23.177");
                www = new Host("www", "130.105.60.89");
                    HTTP = new Protocollo("HTTP", 13025);
                    www.addProtocolli(HTTP);
                    governo.addHost(www);
            it.addHost(governo);
            ospedalesancarlo = new Host("ospedalesancarlo", "219.159.223.17");
                www = new Host("www", "180.95.67.8");
                     HTTP = new Protocollo("HTTP", 1005);
                     www.addProtocolli(HTTP);
                     ospedalesancarlo.addHost(www);
                     it.addHost(ospedalesancarlo);
        
        visitor = new VisitorStampa();
        it.accept(visitor);
        System.out.println(visitor.getSb());
        
    }
}
