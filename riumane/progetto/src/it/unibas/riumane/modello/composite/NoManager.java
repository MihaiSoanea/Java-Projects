/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.composite;

import it.unibas.riumane.modello.visitor.IVisitor;
import java.util.Calendar;

/**
 *
 * @author Mihai Soanea
 */
public class NoManager extends AbstractPersona{
    
    private double indiceProduttivita;
    private double  tassoAssenze;
    private boolean isOperaio;

    public NoManager(String nome, String cognome, String matricola, Calendar dataDiNascita, Calendar dataAssunzione, boolean isOperaio, int indiceProduttivita, int tassoAssenze) {
        super(nome, cognome, matricola, dataDiNascita, dataAssunzione);
        this.indiceProduttivita = indiceProduttivita;
        this.tassoAssenze = tassoAssenze;
        this.isOperaio = isOperaio;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visitFoglia(this);
    }

 

    public boolean isIsOperaio() {
        return isOperaio;
    }

    @Override
    public String toString() {
        return "NoManager{" + "indiceProduttivita=" + indiceProduttivita + ", tassoAssenze=" + tassoAssenze + ", isOperaio=" + isOperaio + '}';
    }

    @Override
    public double getIndiceProduttivita() {
        return indiceProduttivita;
    }

    @Override
    public double getTassoAssenze() {
        return tassoAssenze;
    }

 
    
    
}
