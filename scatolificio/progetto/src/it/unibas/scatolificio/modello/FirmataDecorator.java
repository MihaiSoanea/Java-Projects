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
public class FirmataDecorator extends AbstractScatolificioDecorator{
    
    public FirmataDecorator(IscatolificioDecorator oggettoPrecedente) {
        super(oggettoPrecedente);
        prezzo = 0.3; //+ colore.prezzoColore();
        nome = "e firmata a mano "; // + colore.nomeColore();
        codice = "@"; // + colore.codiceColore();
    }
 
}
