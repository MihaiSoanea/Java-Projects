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
public class PagineItaliaStrategy implements IStrategy{
        
    private static Log logger = LogFactory.getLog(PagineItaliaStrategy.class);
    
    int valorePercentualeItalia;

    public PagineItaliaStrategy(int valorePercentualeItalia) {
        this.valorePercentualeItalia = valorePercentualeItalia;
    }
    

    public boolean seleziona(Pagina pagina) {
        int conta = 0;
        for(View view : pagina.getListaViews()){
            if(view.getPaese().equals("Italia")){
                conta++;
            }
        }
        int percentuale = conta*100/pagina.getListaViews().size();
        logger.debug(percentuale);
        if(percentuale > valorePercentualeItalia){
            return true;
        }
        return false;
    }
    
}
