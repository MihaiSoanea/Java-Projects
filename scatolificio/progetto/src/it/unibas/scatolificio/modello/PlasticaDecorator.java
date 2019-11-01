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
public class PlasticaDecorator extends AbstractScatolificioDecorator{
    
    private Ifiniture finituraFiloScatola;
    private IColore coloreFiniture;

    public PlasticaDecorator(IscatolificioDecorator oggettoPrecedente, IColore coloreFiniture, Ifiniture finituraFiloScatola) {
        super(oggettoPrecedente);
        this.finituraFiloScatola = finituraFiloScatola;
        this.coloreFiniture = coloreFiniture;
        prezzo = 0.5 + finituraFiloScatola.getPrezzo() + coloreFiniture.getPrezzo();
        codice = "P" + finituraFiloScatola.getCodice() + coloreFiniture.getCodice();
        nome = "Scatola di plastica " + finituraFiloScatola.getNome() + coloreFiniture.getNome();
    }

}
