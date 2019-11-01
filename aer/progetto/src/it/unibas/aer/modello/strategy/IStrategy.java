/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.aer.modello.strategy;
import it.unibas.aer.modello.Aereoporto;
import it.unibas.aer.modello.Volo;
import java.util.List;
/**
 *
 * @author Mihai Soanea
 */
public interface IStrategy {
    public List<Volo> visualizzaPannello(List<Volo> lista);
}
