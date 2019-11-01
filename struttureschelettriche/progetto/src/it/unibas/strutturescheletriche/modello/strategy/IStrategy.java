/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.strutturescheletriche.modello.strategy;

/**
 *
 * @author Mihai Soanea
 */
public interface IStrategy<T> {
    public String confronta(T struttura1, T struttura2);
}
