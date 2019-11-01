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
import it.unibas.softwarehouse.modello.strategy.IStrategy;
import it.unibas.softwarehouse.modello.strategy.TempoMedioStrategy;
import it.unibas.softwarehouse.modello.strategy.URLPagineStrategy;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Mihai Soanea
 */
public class VisitorStrategia implements IVisitor{
    
    private IStrategy strategia; 
    private IStrategy strategia2 = new URLPagineStrategy(51); 
    private IStrategy strategia3 = new TempoMedioStrategy(5); 

    private List<Pagina> listaPagineTrovate = new ArrayList<Pagina>();

    public VisitorStrategia(IStrategy strategia) {
        this.strategia = strategia;
    }

    public void visitRadice(Portale portale) {
        for(AbstractContenuto contenuto : portale.getListaContenuti()){
            contenuto.accept(this);
        }
    }

    public void visitNodoIntermedio(Sezione sezione) {
        for(AbstractContenuto contenuto : sezione.getListaContenutiSezione()){
            contenuto.accept(this);
        }
    }

    public void visitFoglia(Pagina pagina) {
        if(strategia.seleziona(pagina) && strategia2.seleziona(pagina) && strategia3.seleziona(pagina)){
            listaPagineTrovate.add(pagina);
        }
        
    }

    public List<Pagina> getListaPagineTrovate() {
        return listaPagineTrovate;
    }

    public StringBuilder getSb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
