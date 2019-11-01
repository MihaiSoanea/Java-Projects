/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.datamasking.modello.chain;
import java.util.StringTokenizer;

/**
 *
 * @author Mihai Soanea
 */
public class HandlerData implements IGestore{
     
    public HandlerData() {
    }

    public String elabora(String stringaDaAnalizzare) {
        if(stringaDaAnalizzare.matches("^\\d{2}/\\d{2}/\\d{4}[.,)]")){
            String anno = stringaDaAnalizzare.substring(stringaDaAnalizzare.length()-5, stringaDaAnalizzare.length()-1);
            return "XX/XX/"+anno + stringaDaAnalizzare.substring(stringaDaAnalizzare.length()-1, stringaDaAnalizzare.length());
        }else if(stringaDaAnalizzare.matches("^\\d{2}/\\d{2}/\\d{4}")){
            String anno = stringaDaAnalizzare.substring(stringaDaAnalizzare.length()-4, stringaDaAnalizzare.length());
            return "XX/XX/"+anno;
        }
        return stringaDaAnalizzare;
    }

}
