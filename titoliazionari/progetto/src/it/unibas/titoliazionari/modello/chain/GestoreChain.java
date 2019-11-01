/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.titoliazionari.modello.chain;

import it.unibas.titoliazionari.modello.Configurazione;
import it.unibas.titoliazionari.modello.Titolo;
import it.unibas.titoliazionari.persistenza.DAOTitoli;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *
 * @author Mihai Soanea
 */
public class GestoreChain {
    
    private static Log logger = LogFactory.getLog(GestoreChain.class);
    private DAOTitoli dao = new DAOTitoli();
    //private String costante;
    private Configurazione c;
    private List<Titolo> listaTuttiTitoli = dao.tuttiTitoli();
    private List<IHandler> listaHandler = initList();
    private HashSet<Titolo> titoliValidi = new HashSet<Titolo>(listaTuttiTitoli);

    public GestoreChain(Configurazione c) {
        this.c = c;
    }

    private List<IHandler> initList(){
        List<IHandler> momentanea = new ArrayList<IHandler>();
        //if(c.getAreaGeografica() != null){
            momentanea.add(new AreaGeoHandler());
        //}
        //if(c.getSocieta()!= null){
            momentanea.add(new SocietaHandler());
        //}
        //if(c.getTipologia()!= null){
            momentanea.add(new TipologiaHandler());
        //}
        //if(c.getSettore()!= null){
            momentanea.add(new SettoreHandler());
        //}
        //if(c.getData1() != null && c.getData2() != null){
            momentanea.add(new DataHandler());
        //}
        return momentanea;
    }
    
    public HashSet<Titolo> getTitoliValidi(){
        for(IHandler h : listaHandler){
            HashSet<Titolo> risultato = h.getTitoliTrovati(listaTuttiTitoli, c);
            if(!risultato.isEmpty()){
            //logger.info("RISULTATO HANDLER "+ risultato.toString()); 
                titoliValidi.retainAll(risultato);
            }
        }
        //logger.info(" FINALE: " +titoliValidi.toString());
        return titoliValidi;
    }
    
    public List<Double> getAndamentiTitoliValidi(){
        List<Double> listaAndamenti = new ArrayList<Double>();
            for(Titolo titolo : titoliValidi){
                listaAndamenti.add(titolo.getAndamentoTitolo());
            }
        //logger.info(listaAndamenti.toString());
        return listaAndamenti;
    }
    
}
