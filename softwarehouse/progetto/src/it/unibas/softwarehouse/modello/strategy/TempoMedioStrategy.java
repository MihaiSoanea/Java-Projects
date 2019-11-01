/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.strategy;

import it.unibas.softwarehouse.modello.composite.Pagina;
import it.unibas.softwarehouse.modello.View;

import java.util.HashSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Mihai Soanea
 */
public class TempoMedioStrategy implements IStrategy{
        
    private static Log logger = LogFactory.getLog(TempoMedioStrategy.class);
    private int tempoMedio;

    public TempoMedioStrategy(int tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public boolean seleziona(Pagina pagina) {
        int somma = 0;
        for(View view : pagina.getListaViews()){
            somma += view.getTempoSecondi();
        }
        logger.debug(somma/pagina.getListaViews().size());
        return(somma/pagina.getListaViews().size() > tempoMedio);
        
    }
    
  
}
