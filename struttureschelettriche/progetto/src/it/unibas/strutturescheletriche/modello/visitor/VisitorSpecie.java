/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello.visitor;

import it.unibas.strutturescheletriche.modello.AbstractOssoComposite;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Mihai Soanea
 */
public class VisitorSpecie implements IVisitor{
    
    List<String> listaOssa = new ArrayList<String>();

    public void visitNodoIntermedio(AbstractOssoComposite ossoIntermedio) {
        listaOssa.add(ossoIntermedio.getNome());
        for(AbstractOssoComposite osso : ossoIntermedio.getListaOssa()){
            osso.accept(this);
        }
        
    }

    public void visitFoglia(AbstractOssoComposite ossoFoglia) {
        listaOssa.add(ossoFoglia.getNome());
    }

    public List<String> getListaOssa() {
        return listaOssa;
    }
    
    
}
