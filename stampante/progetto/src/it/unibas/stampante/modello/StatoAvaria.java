/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.stampante.modello;

/**
 *
 * @author Mihai Soanea
 */
public class StatoAvaria implements IState{

    public void impostaFile(File file, Stampante stampante) {
        stampante.getListaInAttesa().add(file);
    }

    public void esegui(Stampante stampante) {
        for(File f : stampante.getListaInAttesa()){
            f.setMessaggio("ERRORE STAMPANTE");
        }
    }

   
    
}
