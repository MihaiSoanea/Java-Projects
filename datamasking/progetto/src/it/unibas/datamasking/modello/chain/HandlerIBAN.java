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
public class HandlerIBAN implements IGestore{

    public HandlerIBAN() {
    }

    public String elabora(String stringaDaAnalizzare) {
        if(stringaDaAnalizzare.matches("^[A-Z]{2}\\d{2}[A-Z]\\d{22}")){
            return "IBAN-IBAN-IBAN-IBAN-IBAN";
        }
        return stringaDaAnalizzare;
    }
}
