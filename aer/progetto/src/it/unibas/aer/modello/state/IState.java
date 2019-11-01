/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.modello.state;

import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Volo;


/**
 *
 * @author Mihai Soanea
 */
public interface IState {
    public String getDescrizione();
    public void gestisciVolo(Aereoporto a, Volo v);
}
