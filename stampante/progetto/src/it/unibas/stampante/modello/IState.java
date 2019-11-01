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
public interface IState {
    public void impostaFile(File file, Stampante stampante);
    public void esegui(Stampante stampante);
}
