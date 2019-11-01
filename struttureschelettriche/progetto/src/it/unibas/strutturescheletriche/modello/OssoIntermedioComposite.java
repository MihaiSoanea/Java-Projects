/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello;

import it.unibas.strutturescheletriche.modello.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */
public class OssoIntermedioComposite extends AbstractOssoComposite{

    private List<AbstractOssoComposite> listaOssa = new ArrayList<AbstractOssoComposite>();

    public OssoIntermedioComposite(String nome, double lunghezza, double peso, double spessore) {
        super(nome, lunghezza, peso, spessore);
    }

    @Override
    public void addOssa(AbstractOssoComposite osso) {
        listaOssa.add(osso);
        //osso.setPadre(this);
    }

    @Override
    public List<AbstractOssoComposite> getListaOssa() {
        return this.listaOssa;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visitNodoIntermedio(this);
    }

    @Override
    public List<String> getNomeOssa() {
        List<String> listaNomiOssa = new ArrayList<String>();
        for(AbstractOssoComposite osso : listaOssa){
            listaNomiOssa.add(osso.getNome());
        }
        return listaNomiOssa;
    }
 
}
