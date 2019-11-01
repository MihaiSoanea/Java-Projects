/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.h.modello.visitor;

import it.unibas.h.modello.Protocollo;
import it.unibas.h.modello.composite.AbstractHost;

/**
 *
 * @author Mihai Soanea
 */
public class VisitorStampa implements IVisitor{

    private StringBuilder sb = new StringBuilder();

    public void visitHost(AbstractHost host) {
        if(host.getListaHost().size() > 0){
            sb.append(host.getNome()).append(" [").append(host.getIndirizzoIP()).append("]").append("\n").append("\t");
        }else{
            sb.append("\t").append("[").append(host.getIndirizzoIP()).append("] ").append(host.getNome());
            if(host.getListaProtocolli().size() > 0){
                sb.append(",");
                for(Protocollo protocollo : host.getListaProtocolli()){
                    sb.append("(").append(protocollo.getNome()).append(") ").append(protocollo.getNumeroContatti()).append("-");
                }
                sb.replace(sb.length()-1, sb.length(), "");
                sb.append("\n");
                sb.append("\t");
            }
        }
        for(AbstractHost h : host.getListaHost()){
            h.accept(this);
        }
    
    }

    public StringBuilder getSb() {
        return sb;
    }
    
}
