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
public class URLPagineStrategy implements IStrategy{
    
    private int valoreBrowser;
    private static Log logger = LogFactory.getLog(URLPagineStrategy.class);

    public URLPagineStrategy(int valoreBrowser) {
        this.valoreBrowser = valoreBrowser;
    }

    public boolean seleziona(Pagina pagina) {
        int conta = 0;
        for(View view : pagina.getListaViews()){
            if(view.getUrlArrivo() != null){
                if(view.getUrlArrivo().contains("bing") || view.getUrlArrivo().contains("yahoo") || view.getUrlArrivo().contains("google")){
                    conta++;
                }
            }
        }
        logger.debug(conta*100/pagina.getListaViews().size());
        return (conta*100/pagina.getListaViews().size() > valoreBrowser);
    }

}
