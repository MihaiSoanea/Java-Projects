package it.unibas.panini.vista;

import it.unibas.panini.modello.Credenziali;
import it.unibas.panini.modello.Panino;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class VistaCreazione implements Serializable {

    private int pane = 1, salume = 1;
    private boolean ketchup, mayo, winchester;
    private String nome, ingredienti;
    private double prezzo;

    public int getPane() {
        return pane;
    }

    public void setPane(int pane) {
        this.pane = pane;
    }

    public int getSalume() {
        return salume;
    }

    public void setSalume(int salume) {
        this.salume = salume;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public boolean isMayo() {
        return mayo;
    }

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }

    public boolean isWinchester() {
        return winchester;
    }

    public void setWinchester(boolean winchester) {
        this.winchester = winchester;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    
    
    
}

