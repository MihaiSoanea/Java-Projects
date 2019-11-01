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
public class SocietaHandler implements IHandler{
        
    private static Log logger = LogFactory.getLog(SocietaHandler.class);
    

        @Override
    public HashSet<Titolo> getTitoliTrovati(List<Titolo> listaTitoli, Configurazione c) {
        HashSet<Titolo> titoliTrovati = new HashSet<Titolo>();
        if(c.getSocieta()!= null){
            for(Titolo titolo : listaTitoli){
                if(titolo.getSocieta().equals(c.getSocieta())){
                    titoliTrovati.add(titolo);
                }
            }
        }
        //logger.info("SOCIETA"+ titoliTrovati.toString());
        return titoliTrovati;
    }

    @Override
    public String toString() {
        return "SocietaHandler{" + '}';
    }
    
    
    
}
