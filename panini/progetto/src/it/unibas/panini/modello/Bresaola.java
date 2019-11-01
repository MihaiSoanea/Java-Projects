/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.panini.modello;

import it.unibas.panini.modello.sigla.ISigla;
import java.util.HashSet;

/**
 *
 * @author Mihai Soanea
 */
public class Bresaola extends AbstractIngredientiDecorator{
    
    private ISigla tipologia;
    private String provenienza;
    private String nome;
    private int stagionatura;

//    public Bresaola(ISigla tipologia, String provenienza, String nome, int stagionatura, IingredienteDecorator ingrediente) {
//        this.tipologia = tipologia;
//        this.provenienza = provenienza;
//        this.nome = nome;
//        this.stagionatura = stagionatura;
//        this.ingrediente = ingrediente;
//    }

    public Bresaola(ISigla tipologia, String provenienza, String nome, int stagionatura, IingredienteDecorator ingrediente) {
        super(ingrediente);
        this.tipologia = tipologia;
        this.provenienza = provenienza;
        this.nome = nome;
        this.stagionatura = stagionatura;
        
        prezzo = tipologia.getPrezzo();
        titolo = "Bresaola " + tipologia.getTitolo();
        insiemeIngredienti = initSet();
    }

   


    private HashSet<String> initSet() {
        HashSet<String> momentaneo = new HashSet<String>();
        momentaneo.add("Bresaola");
        return momentaneo;
    }

    
    
}
