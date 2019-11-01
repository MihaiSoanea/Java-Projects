/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.datamasking.modello.chain;

/**
 *
 * @author Mihai Soanea
 */
public class HandlerCF implements IGestore{

    public HandlerCF() {
    }

    public String elabora(String stringaDaAnalizzare) {
        if(stringaDaAnalizzare.matches("^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]")){
                return "****************";
        }else if(stringaDaAnalizzare.matches("^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z][.,)]")){
            return "****************" + stringaDaAnalizzare.substring(stringaDaAnalizzare.length()-1, stringaDaAnalizzare.length());
        }
        return stringaDaAnalizzare;
    }


}
