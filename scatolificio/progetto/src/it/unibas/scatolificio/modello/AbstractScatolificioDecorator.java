/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.scatolificio.modello;

import it.unibas.scatolificio.modello.colore.IColore;

/**
 *
 * @author Mihai Soanea
 */
public abstract class AbstractScatolificioDecorator implements IscatolificioDecorator{
   
    protected String nome;
    protected String codice;
    protected double prezzo;
    protected double altezza, lunghezza, profondita;
    private IscatolificioDecorator oggettoPrecedente;

    
    public AbstractScatolificioDecorator(IscatolificioDecorator oggettoPrecedente) {
        this.oggettoPrecedente = oggettoPrecedente;
    }

    public AbstractScatolificioDecorator() {
    }

    public double getPrezzo() {
        return oggettoPrecedente.getPrezzo() + this.prezzo;
    }

    public String getCodice() {
        return oggettoPrecedente.getCodice() + this.codice;
    }

    public String getNome() {
        return oggettoPrecedente.getNome() + this.nome;
    }
 
}
