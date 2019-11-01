package it.unibas.softwarehouse.vista;

import it.unibas.softwarehouse.modello.Credenziali;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VistaLogin implements Serializable {

    private Credenziali credenziali = new Credenziali();
    
    public Credenziali getCredenziali() {
        return credenziali;
    }

    public void setCredenziali(Credenziali credenziali) {          
        this.credenziali = credenziali;
    }

}

