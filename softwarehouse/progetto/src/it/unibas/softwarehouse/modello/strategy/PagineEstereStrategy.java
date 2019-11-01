/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.softwarehouse.modello.strategy;

import it.unibas.softwarehouse.modello.View;
import it.unibas.softwarehouse.modello.composite.Pagina;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 *
 * @author Mihai Soanea
 */
public class PagineEstereStrategy implements IStrategy{
    
    private static Log logger = LogFactory.getLog(PagineEstereStrategy.class);
    
    int valorePercentualeEstere;

    public PagineEstereStrategy(int valorePercentualeEstere) {
        this.valorePercentualeEstere = valorePercentualeEstere;
    }

    public boolean seleziona(Pagina pagina) {
        int conta = 0;
        for(View view : pagina.getListaViews()){
            if(!view.getPaese().equals("Italia")){
                conta++;  
            }
        }
        float percentuale = conta*100/pagina.getListaViews().size(); 
        logger.debug(percentuale);
        return (percentuale > valorePercentualeEstere);   
    }

    
}
