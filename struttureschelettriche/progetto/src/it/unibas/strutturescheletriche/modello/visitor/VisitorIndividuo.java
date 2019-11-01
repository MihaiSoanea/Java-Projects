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
public class VisitorIndividuo implements IVisitor{
    
    List<AbstractOssoComposite> listaOssa = new ArrayList<AbstractOssoComposite>();

    public void visitNodoIntermedio(AbstractOssoComposite ossoIntermedio) {
        listaOssa.add(ossoIntermedio);
        for(AbstractOssoComposite osso : ossoIntermedio.getListaOssa()){
            osso.accept(this);
        }
    }

    public void visitFoglia(AbstractOssoComposite ossoFoglia) {
        listaOssa.add(ossoFoglia);
    }

    public List<AbstractOssoComposite> getRisultato() {
        return listaOssa;
    }
    
}
