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
public class HandlerEMail implements IGestore{
    
    public HandlerEMail() {
    }

    public String elabora(String stringaDaAnalizzare){
        if (stringaDaAnalizzare.contains("@")) {
            String dominio = stringaDaAnalizzare.substring(stringaDaAnalizzare.indexOf("@"));
            if (dominio.contains(".")) {
                return "xxxxx.xxxxx@" + dominio;
            }
        }
        return stringaDaAnalizzare;
    }

}
