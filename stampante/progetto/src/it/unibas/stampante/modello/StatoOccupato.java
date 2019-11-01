/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.stampante.modello;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mihai Soanea
 */
public class StatoOccupato implements IState{

    public void impostaFile(File file, Stampante stampante) {
        stampante.getListaInAttesa().add(file);
        file.setMessaggio("In coda");
    }

    public void esegui(Stampante stampante) {
        if(stampante.getListaInAttesa().size() == 0){
            IState stato = new StatoInFunzione();
            stampante.setStato(stato);
            return;
        }
        File f = stampante.getListaInAttesa().get(0);
        f.setDataEsecuzione(new GregorianCalendar());
        f.setMessaggio("In stampa");
        try {
            stampante.stampa(f);
        } catch (InterruptedException ex) {
            Logger.getLogger(StatoOccupato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
}
