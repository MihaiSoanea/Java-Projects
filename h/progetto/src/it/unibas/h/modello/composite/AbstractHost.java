/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello.composite;

import it.unibas.h.modello.Protocollo;
import it.unibas.h.modello.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */
public abstract class AbstractHost {
    
    private String indirizzoIP;
    private String nome;
    private List<Protocollo> listaProtocolli = new ArrayList<Protocollo>();

    public AbstractHost(String nome, String indirizzoIP) {
        this.nome = nome;
        this.indirizzoIP = indirizzoIP;
    }

    public AbstractHost() {
    }

    public String getIndirizzoIP() {
        return indirizzoIP;
    }

    public void setIndirizzoIP(String indirizzoIP) {
        this.indirizzoIP = indirizzoIP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Protocollo> getListaProtocolli() {
        return listaProtocolli;
    }

    public void addProtocolli(Protocollo protocollo) {
        this.listaProtocolli.add(protocollo);
    }
    
    public abstract void setPadre(AbstractHost padre);
    public abstract AbstractHost getPadre();
    public abstract List<AbstractHost> getListaHost();
    public abstract void addHost(AbstractHost host);
    public abstract void accept(IVisitor visitor);
    
}
