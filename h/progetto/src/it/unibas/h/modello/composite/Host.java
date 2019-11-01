/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello.composite;

import it.unibas.h.modello.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */
public class Host extends AbstractHost{

    private AbstractHost padre;
    private List<AbstractHost> listaHost = new ArrayList<AbstractHost>();

    public Host(String nome, String indirizzoIP) {
        super(nome, indirizzoIP);
    }

    public Host() {
    }

    @Override
    public void setPadre(AbstractHost padre) {
        this.padre = padre;
    }

    @Override
    public AbstractHost getPadre() {
        return padre;
    }

    @Override
    public List<AbstractHost> getListaHost() {
        return listaHost;
    }

    @Override
    public void addHost(AbstractHost host) {
        this.listaHost.add(host);
        host.setPadre(this);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitHost(this);
    }
    
}
