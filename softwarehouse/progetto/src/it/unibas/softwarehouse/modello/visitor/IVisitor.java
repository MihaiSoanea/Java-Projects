/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.visitor;

import it.unibas.softwarehouse.modello.composite.Pagina;
import it.unibas.softwarehouse.modello.composite.Portale;
import it.unibas.softwarehouse.modello.composite.Sezione;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 *
 */
public interface IVisitor {
    public void visitRadice(Portale portale);
    public void visitNodoIntermedio(Sezione sezione);
    public void visitFoglia(Pagina pagina);
    public List<Pagina> getListaPagineTrovate();
    public StringBuilder getSb();
}
