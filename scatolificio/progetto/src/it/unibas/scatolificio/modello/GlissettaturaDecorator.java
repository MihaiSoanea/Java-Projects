/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.scatolificio.modello;

/**
 *
 * @author Mihai Soanea
 */
public class GlissettaturaDecorator extends AbstractScatolificioDecorator{
    
    public GlissettaturaDecorator(IscatolificioDecorator oggettoPrecedente) {
        super(oggettoPrecedente);
        prezzo = 0.5; // + colore.prezzoColore();
        codice = "#"; // + colore.codiceColore();
        nome = "glissettatura "; // + colore.nomeColore();
    }

}
