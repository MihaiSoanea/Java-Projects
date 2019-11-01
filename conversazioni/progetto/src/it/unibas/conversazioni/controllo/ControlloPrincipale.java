package it.unibas.conversazioni.controllo;

import it.unibas.conversazioni.Costanti;
import it.unibas.conversazioni.modello.Canale;
import it.unibas.conversazioni.modello.IRC;
import it.unibas.conversazioni.modello.Modello;
import it.unibas.conversazioni.persistenza.DAOMock;
import it.unibas.conversazioni.persistenza.IDAOIstruzione;
import it.unibas.conversazioni.vista.VistaPrincipale;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@ManagedBean
@ViewScoped
public class ControlloPrincipale implements Serializable {

    private static transient Log logger = LogFactory.getLog(ControlloPrincipale.class);

    @ManagedProperty(value = "#{modello}")
    private Modello modello;
    @ManagedProperty(value = "#{vistaPrincipale}")
    private VistaPrincipale vista;
    @ManagedProperty(value = "#{dAOIstruzioneHibernate}")
    private IDAOIstruzione daoIstruzione;
    private DAOMock dao = new DAOMock();

    public void initBeans() {
        IRC irc = new IRC();
        Map<String, Canale> mappa = dao.getMappaCanaliMock();
        irc.setMappaCanali(mappa);
        modello.setMappaCanali(mappa);
        List<Canale> lista = new ArrayList<Canale>(mappa.values());
        vista.setCanali(lista);
    }
    
    public String mostra(){
        Canale c = vista.getCanale();
        modello.setCanale(c);
        System.out.println("\n \nCANALE -->" + c.toString());
        //return "/schermoInteragisci" + Costanti.REDIRECT;
        return null;
    }

    public Modello getModello() {
        return modello;
    }

    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public VistaPrincipale getVista() {
        return vista;
    }

    public void setVista(VistaPrincipale vista) {
        this.vista = vista;
    }

    public IDAOIstruzione getDaoIstruzione() {
        return daoIstruzione;
    }

    public void setDaoIstruzione(IDAOIstruzione daoIstruzione) {
        this.daoIstruzione = daoIstruzione;
    }

    

}
