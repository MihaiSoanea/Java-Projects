/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello.visitor;

import it.unibas.strutturescheletriche.modello.AbstractOssoComposite;
import it.unibas.strutturescheletriche.modello.OssoFogliaComposite;
import it.unibas.strutturescheletriche.modello.OssoIntermedioComposite;

/**
 *
 * @author Mihai Soanea
 */
public interface IVisitor {
    public void visitNodoIntermedio(AbstractOssoComposite ossoIntermedio);
    public void visitFoglia(AbstractOssoComposite ossoFoglia);
}
