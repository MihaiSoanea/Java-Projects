/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.riumane.modello.composite;
import it.unibas.riumane.modello.visitor.IVisitor;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Mihai Soanea
 */
public abstract class AbstractPersona {
    private AbstractPersona padre;
    private String nome, cognome, matricola;
    private Calendar dataDiNascita, dataAssunzione;

    public AbstractPersona(String nome, String cognome, String matricola, Calendar dataDiNascita, Calendar dataAssunzione) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.dataDiNascita = dataDiNascita;
        this.dataAssunzione = dataAssunzione;
    }

    public AbstractPersona() {
    }
    
    

    public AbstractPersona getPadre() {
        return padre;
    }

    public void setPadre(AbstractPersona padre) {
        this.padre = padre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public Calendar getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Calendar dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Calendar getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(Calendar dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }
    
    public int getEta(){
        return ((GregorianCalendar.getInstance().get(GregorianCalendar.YEAR)) - (dataDiNascita.get(GregorianCalendar.YEAR)));
    }
    
    public int getAnniServizio(){
        return ((GregorianCalendar.getInstance().get(GregorianCalendar.YEAR)) - (dataAssunzione.get(GregorianCalendar.YEAR)));
    }

    @Override
    public String toString() {
        return "AbstractPersona{" + "nome=" + nome + ", cognome=" + cognome + '}';
    }

    public abstract void accept(IVisitor visitor);
    public abstract double getIndiceProduttivita();
    public abstract double getTassoAssenze();
    
}
