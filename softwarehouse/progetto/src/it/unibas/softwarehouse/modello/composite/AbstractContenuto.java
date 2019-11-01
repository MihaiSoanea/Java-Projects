/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.composite;

import it.unibas.softwarehouse.modello.visitor.IVisitor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ManyToOne;


/**
 *
 * @author Mihai Soanea
 */
@Entity
@DiscriminatorValue(value = "contenuto")
public abstract class AbstractContenuto extends AbstractNodo{

    private String nome;
    private Portale portale;
    private Sezione sezione;

    @ManyToOne
    public Sezione getSezione() {
        return sezione;
    }

    public void setSezione(Sezione sezione) {
        this.sezione = sezione;
    } 
    
    @ManyToOne
    public Portale getPortale() {
        return portale;
    }

    public void setPortale(Portale portale) {
        this.portale = portale;
    }
    
    

    public AbstractContenuto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    
    
    
}
