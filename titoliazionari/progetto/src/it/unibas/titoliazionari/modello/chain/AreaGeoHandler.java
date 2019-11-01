/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello.chain;


import it.unibas.titoliazionari.modello.Configurazione;
import it.unibas.titoliazionari.modello.Titolo;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Mihai Soanea
 */
public class AreaGeoHandler implements IHandler{
    
    private static Log logger = LogFactory.getLog(AreaGeoHandler.class);
    
    @Override
    public HashSet<Titolo> getTitoliTrovati(List<Titolo> listaTitoli, Configurazione c) {
        HashSet<Titolo> titoliTrovati = new HashSet<Titolo>();
        if (c.getAreaGeografica() != null) {
            for (Titolo titolo : listaTitoli) {
                if (titolo.getArea().equals(c.getAreaGeografica())) {
                    titoliTrovati.add(titolo);
                }
            }
        }
        //logger.info("AREA" + titoliTrovati.toString());
        return titoliTrovati;
    }

    @Override
    public String toString() {
        return "AreaGeoHandler{" + '}';
    }
    
    
    
}
