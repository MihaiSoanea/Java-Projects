package it.unibas.ricercabrani.vista;

import it.unibas.ricercabrani.modello.Brano;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class VistaRicerca implements Serializable {

    private String ricercaInserita, stringaVerifica;
    private List<Brano> listaBrani;

    public List<Brano> getListaBrani() {
        return listaBrani;
    }

    public void setListaBrani(List<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }


    public String getRicercaInserita() {
        return ricercaInserita;
    }

    public void setRicercaInserita(String ricercaInserita) {
        this.ricercaInserita = ricercaInserita;
    }

    public String getStringaVerifica() {
        return stringaVerifica;
    }

    public void setStringaVerifica(String stringaVerifica) {
        this.stringaVerifica = stringaVerifica;
    }
    
    

}

