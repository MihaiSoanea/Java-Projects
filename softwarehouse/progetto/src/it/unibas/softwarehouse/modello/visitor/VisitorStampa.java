/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.visitor;

import it.unibas.softwarehouse.modello.composite.AbstractContenuto;
import it.unibas.softwarehouse.modello.composite.Pagina;
import it.unibas.softwarehouse.modello.composite.Portale;
import it.unibas.softwarehouse.modello.composite.Sezione;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public class VisitorStampa implements IVisitor{
    private int livello = 0;
    private StringBuilder sb = new StringBuilder();

    public void visitRadice(Portale portale) {
        sb.append(portale.getNomeDominio()).append("\n").append(portale.getIndirizzoIP()).append("\n").append("  ");
        for(AbstractContenuto contenuto : portale.getListaContenuti()){
            contenuto.accept(this);
        }
    }

    public void visitNodoIntermedio(Sezione sezione) {
        sb.append(sezione.getNome()).append("\n");
        for(AbstractContenuto contenuto : sezione.getListaContenutiSezione()){
            livello++;
            for(int i = 0; i < livello; i++){
                sb.append("     ");
            }
            contenuto.accept(this);
            livello--;
        }
    }

    public void visitFoglia(Pagina pagina) {
        sb.append(pagina.getNome()).append("\n");
    }

    public List<Pagina> getListaPagineTrovate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public StringBuilder getSb() {
        return sb;
    }
    
    
}
