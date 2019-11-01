package it.unibas.conversazioni;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Utilita {

    private static Log logger = LogFactory.getLog(Utilita.class);

    public static void setFlashProperty(String nome, Object valore) {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put(nome, valore);
        flash.setKeepMessages(true);
    }

    public static Object getFlashProperty(String nome) {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        return flash.get(nome);
    }
}
