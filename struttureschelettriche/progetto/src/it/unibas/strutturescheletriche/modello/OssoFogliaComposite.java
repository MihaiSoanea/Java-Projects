/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello;

import it.unibas.strutturescheletriche.modello.visitor.IVisitor;
import java.util.List;

/**
 *
 * @author Mihai Soanea
 */
public class OssoFogliaComposite extends AbstractOssoComposite{
    
    
    public OssoFogliaComposite(String nome, double lunghezza, double peso, double spessore) {
        super(nome, lunghezza, peso, spessore);
    }

    @Override
    public void addOssa(AbstractOssoComposite osso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AbstractOssoComposite> getListaOssa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitFoglia(this);
    }

    @Override
    public List<String> getNomeOssa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
