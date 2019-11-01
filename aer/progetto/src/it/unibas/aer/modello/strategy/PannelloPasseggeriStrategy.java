/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.modello.strategy;

import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Volo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mihai Soanea
 */
public class PannelloPasseggeriStrategy implements IStrategy{

    @Override
    public List<Volo> visualizzaPannello(List<Volo> lista) {
        List<Volo> listaValidi = new ArrayList<Volo>();
        for(Volo v : lista){
            if(!v.getState().getDescrizione().equals("Partito")){
                listaValidi.add(v);
            }
        }
        return listaValidi;
    }
    
}
