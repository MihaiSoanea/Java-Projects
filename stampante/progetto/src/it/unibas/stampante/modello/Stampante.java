/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unibas.stampante.modello;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;


/**
 *
 * @author Mihai Soanea
 */
public class Stampante {
    private String marca, modello;
    private IState stato = new StatoInFunzione();
    private List<File> listaInAttesa = new ArrayList<File>();
    private List<File> listaStampate = new ArrayList<File>();

    public Stampante() {
    }

    public Stampante(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public List<File> getListaInAttesa() {
        return listaInAttesa;
    }

    public List<File> getListaStampate() {
        return listaStampate;
    }

    public IState getStato() {
        return stato;
    }

    public void setStato(IState stato) {
        this.stato = stato;
    }
    
    public void impostaAvaria(){
        IState stato = new StatoAvaria();
        this.setStato(stato);
        stato.esegui(this);
    }
    
    public void stampa(File file) throws InterruptedException{
//        long milliOrario = file.getDataEsecuzione().getTimeInMillis();
          long milliDimensione = (long) file.getDimensione();
//        if(milliOrario + milliDimensione < new GregorianCalendar().getTimeInMillis()){
//            file.setMessaggio("Stampato");
//            listaInAttesa.remove(file);
//            listaStampate.add(file);
//            this.stato.esegui(this);
//            
            Thread.sleep(milliDimensione);
            file.setMessaggio("Stampato");
            listaInAttesa.remove(file);
            listaStampate.add(file);
            this.stato.esegui(this);
//        }
    }
}
