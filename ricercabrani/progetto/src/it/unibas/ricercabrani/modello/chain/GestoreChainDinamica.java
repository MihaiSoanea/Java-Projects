/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.modello.chain;
import it.unibas.ricercabrani.Utilita;
import it.unibas.ricercabrani.modello.Brano;
import it.unibas.ricercabrani.persistenza.DAOBrani;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList; 
import java.util.HashSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Mihai Soanea
 */
public class GestoreChainDinamica {
    
    private static Log logger = LogFactory.getLog(GestoreChainDinamica.class);
    
    DAOBrani listaBrani = new DAOBrani();
    List<IHandlerAbstract> listaHandlerRicerca = new ArrayList<IHandlerAbstract>();
    
    public HashSet<Brano> ricerca(){
        HashSet<Brano> risultato = new HashSet<Brano>(listaBrani.getListaBrani());
        for(IHandlerAbstract handler : listaHandlerRicerca){ 
            HashSet<Brano> insiemeFiltrato = handler.filtra(listaBrani.getListaBrani());
            risultato.retainAll(insiemeFiltrato);
        }
        return risultato;
    }

    public void setListaHandlerRicerca(List<IHandlerAbstract> listaHandlerRicerca) {
        this.listaHandlerRicerca = listaHandlerRicerca;
    }


}
