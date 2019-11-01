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
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Column;

/**
 *
 * @author Mihai Soanea
 */
@Entity
@DiscriminatorValue(value = "portale")
public class Portale extends AbstractNodo{
    
    private String nomeDominio, indirizzoIP;
    private List<AbstractContenuto> listaContenuti = new ArrayList<AbstractContenuto>();

    public Portale(String nomeDominio, String indirizzoIP) {
        this.nomeDominio = nomeDominio;
        this.indirizzoIP = indirizzoIP;
    }

    @Column(unique=true)
    public String getNomeDominio() {
        return nomeDominio;
    }

    public String getIndirizzoIP() {
        return indirizzoIP;
    }

    @OneToMany(mappedBy = "portale", cascade = CascadeType.ALL)
    public List<AbstractContenuto> getListaContenuti() {
        return listaContenuti;
    }

    public void addContenuti(AbstractContenuto contenuto) {
        this.listaContenuti.add(contenuto);
    }
    
    public void accept(IVisitor visitor) {
        visitor.visitRadice(this);
    }
    
}
