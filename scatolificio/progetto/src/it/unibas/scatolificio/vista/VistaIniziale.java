package it.unibas.scatolificio.vista;

import it.unibas.scatolificio.modello.Scatola;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class VistaIniziale implements Serializable {
    
    private List<Scatola> listaScatole;

    public List<Scatola> getListaScatole() {
        return listaScatole;
    }

    public void setListaScatole(List<Scatola> listaScatole) {
        this.listaScatole = listaScatole;
    }

}

