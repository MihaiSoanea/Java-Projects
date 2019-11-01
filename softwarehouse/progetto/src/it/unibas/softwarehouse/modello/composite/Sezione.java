/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.composite;
import it.unibas.softwarehouse.modello.visitor.IVisitor;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
/**
 *
 * @author Mihai Soanea
 */
@Entity
@DiscriminatorValue(value = "sezione")
public class Sezione extends AbstractContenuto{

    private List<AbstractContenuto> listaContenutiSezione = new ArrayList<AbstractContenuto>();

    public Sezione(String nome) {
        super(nome);
    }

    @OneToMany(mappedBy = "sezione", cascade = CascadeType.ALL)
    public List<AbstractContenuto> getListaContenutiSezione() {
        return listaContenutiSezione;
    }
    
    public void addContenutoSezione(AbstractContenuto contenuto){
        this.listaContenutiSezione.add(contenuto);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitNodoIntermedio(this);
    }


    
    
}
