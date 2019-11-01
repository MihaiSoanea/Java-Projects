/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.composite;
import it.unibas.softwarehouse.modello.View;
import it.unibas.softwarehouse.modello.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
/**
 *
 * @author Mihai Soanea
 */
@Entity
@DiscriminatorValue(value = "pagina")
public class Pagina extends AbstractContenuto{
    
    private List<View> listaViews = new ArrayList<View>();

    public Pagina(String nome) {
        super(nome);
    }

    @OneToMany(mappedBy="pagina", cascade=CascadeType.ALL)
    public List<View> getListaViews() {
        return listaViews;
    }
    
    public void addViews(View view){
        this.listaViews.add(view);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitFoglia(this);
    }
    
}
