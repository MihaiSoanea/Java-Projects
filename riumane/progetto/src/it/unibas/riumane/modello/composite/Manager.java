/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.composite;

import it.unibas.riumane.modello.strategy.AssenzeManager;
import it.unibas.riumane.modello.strategy.ProduttivitaManager;
import it.unibas.riumane.modello.visitor.IVisitor;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Mihai Soanea
 */
public class Manager extends AbstractPersona{
    private String tipo = "manager";
    private String funzione;
    private List<AbstractPersona> listaSottoposti = new ArrayList<AbstractPersona>();

    public Manager(String nome, String cognome, String matricola, Calendar dataDiNascita, Calendar dataAssunzione, String funzione) {
        super(nome, cognome, matricola, dataDiNascita, dataAssunzione);
        this.funzione = funzione;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFunzione() {
        return funzione;
    }

    public void setFunzione(String funzione) {
        this.funzione = funzione;
    }

    public List<AbstractPersona> getListaSottoposti() {
        return listaSottoposti;
    }

    public void addSottoposti(AbstractPersona sottoposti) {
        this.listaSottoposti.add(sottoposti);
        sottoposti.setPadre(this);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitNodoIntermedio(this);
    }

    @Override
    public double getIndiceProduttivita() {
        return new ProduttivitaManager().seleziona(this);
    }

    @Override
    public double getTassoAssenze() {
        return new AssenzeManager().seleziona(this);
    }

    @Override
    public String toString() {
        return "Manager{" + "tipo=" + tipo + ", funzione=" + funzione + ", listaSottoposti=" + listaSottoposti + '}';
    }


    
   
}
