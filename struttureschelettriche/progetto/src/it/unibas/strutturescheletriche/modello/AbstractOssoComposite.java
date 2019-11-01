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
public abstract class AbstractOssoComposite {
    private String nome;
    private double lunghezza, peso, spessore;

    public AbstractOssoComposite(String nome, double lunghezza, double peso, double spessore) {
        this.nome = nome;
        this.lunghezza = lunghezza;
        this.peso = peso;
        this.spessore = spessore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSpessore() {
        return spessore;
    }

    public void setSpessore(double spessore) {
        this.spessore = spessore;
    }

    public boolean isEquals(AbstractOssoComposite osso) {
       return (nome.equals(osso.getNome()) && peso == osso.getPeso() && lunghezza == osso.getLunghezza() && spessore == osso.getSpessore());
    }
    
    public abstract void addOssa(AbstractOssoComposite osso);
    public abstract List<AbstractOssoComposite> getListaOssa();
    public abstract void accept(IVisitor visitor);
    public abstract List<String> getNomeOssa();
    
}
