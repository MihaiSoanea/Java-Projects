package it.unibas.scatolificio.vista;

import it.unibas.scatolificio.modello.Scatola;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class VistaNuova implements Serializable {
    
    private int criterioMateriale = 1;
    private int criterioColore = 1;
    private int criterioFiniture = 1;
    private boolean punteggiatura;
    private boolean striatura;
    private boolean glisettatura;
    private boolean firmata;

    public int getCriterioMateriale() {
        return criterioMateriale;
    }

    public void setCriterioMateriale(int criterioMateriale) {
        this.criterioMateriale = criterioMateriale;
    }

    public int getCriterioColore() {
        return criterioColore;
    }

    public void setCriterioColore(int criterioColore) {
        this.criterioColore = criterioColore;
    }

    public int getCriterioFiniture() {
        return criterioFiniture;
    }

    public void setCriterioFiniture(int criterioFiniture) {
        this.criterioFiniture = criterioFiniture;
    }

    public boolean isPunteggiatura() {
        return punteggiatura;
    }

    public void setPunteggiatura(boolean punteggiatura) {
        this.punteggiatura = punteggiatura;
    }

    public boolean isStriatura() {
        return striatura;
    }

    public void setStriatura(boolean striatura) {
        this.striatura = striatura;
    }

    public boolean isGlisettatura() {
        return glisettatura;
    }

    public void setGlisettatura(boolean glisettatura) {
        this.glisettatura = glisettatura;
    }

    public boolean isFirmata() {
        return firmata;
    }

    public void setFirmata(boolean firmata) {
        this.firmata = firmata;
    }

    
    
}

