/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.ricercabrani.modello.chain;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author Mihai Soanea
 */
public class GestoreChainStatica {
    
    Map<Character, IHandlerAbstract> mappaHandler = initMap();
    
    private Map<Character, IHandlerAbstract> initMap(){
        Map<Character, IHandlerAbstract> mappaMoment= new HashMap<Character, IHandlerAbstract>();
        mappaMoment.put('*', new HandlerAsterisco());
        mappaMoment.put('+', new HandlerPiu());
        mappaMoment.put('-', new HandlerMeno());
        mappaMoment.put('<', new HandlerMinore());
        mappaMoment.put('_', new HandlerUnderscore());
        return mappaMoment;
    }
    
    
    public List<IHandlerAbstract> getChainDinamica(String ricerca){
        List<IHandlerAbstract> nuovaChain = new ArrayList<IHandlerAbstract>();
        StringTokenizer st = new StringTokenizer(ricerca, " ");
        while(st.hasMoreTokens()){
            String token = st.nextToken(); 
            //System.out.println(token.charAt(0));
            IHandlerAbstract handler = mappaHandler.get(token.charAt(0));
            handler = handler.createNewInstance();
            handler.setParola(token.substring(1));
            if(!contains(token.substring(1), nuovaChain)){
                nuovaChain.add(handler);
            }
        }
        return nuovaChain;
    }

    private boolean contains(String s, List<IHandlerAbstract> lista){
        for (IHandlerAbstract handler : lista) {
            if(handler.getParola().equals(s)) {
                return true;
            }
        }
        return false;
    }
       
}
