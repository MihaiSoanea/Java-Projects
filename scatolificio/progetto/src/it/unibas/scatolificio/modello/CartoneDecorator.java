/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.scatolificio.modello;

import it.unibas.scatolificio.modello.colore.IColore;
import it.unibas.scatolificio.modello.finiture.Ifiniture;

/**
 *
 * @author Mihai Soanea
 */
public class CartoneDecorator extends AbstractScatolificioDecorator{
    
    private Ifiniture finituraFiloScatola;
    private IColore coloreFiniture;

    public CartoneDecorator(Ifiniture finituraFiloScatola, IColore coloreFiniture, IscatolificioDecorator oggettoPrecedente) {
        super(oggettoPrecedente);
        this.finituraFiloScatola = finituraFiloScatola;
        this.coloreFiniture = coloreFiniture;

        prezzo = 0.1 + finituraFiloScatola.getPrezzo() + coloreFiniture.getPrezzo();
        codice = "C" + finituraFiloScatola.getCodice()+ coloreFiniture.getCodice();
        nome = "Scatola di cartone " + finituraFiloScatola.getNome() + coloreFiniture.getNome();
    }

}
