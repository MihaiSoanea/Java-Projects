package it.unibas.datamasking.controllo;

import java.util.Iterator;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.component.UIData;
import javax.faces.component.UIForm;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class PhaseListener implements javax.faces.event.PhaseListener {
    
    private Log logger = LogFactory.getLog(this.getClass());
    
    public PhaseId getPhaseId() {
        return javax.faces.event.PhaseId.ANY_PHASE;
    }
    
    public void beforePhase(PhaseEvent phaseEvent) {
        if (phaseEvent.getPhaseId().equals(PhaseId.RESTORE_VIEW)) {
            logger.debug("\n");
        }
        logger.debug("Inizio Fase: " + phaseEvent.getPhaseId());
        ispeziona(phaseEvent);
    }
    
    public void afterPhase(PhaseEvent phaseEvent) {
        logger.debug("Fine fase: " + phaseEvent.getPhaseId());
        ispeziona(phaseEvent);
    }
    
    private void ispeziona(PhaseEvent phaseEvent) {
        if (phaseEvent.getPhaseId().equals(PhaseId.RESTORE_VIEW) ||
                phaseEvent.getPhaseId().equals(PhaseId.RENDER_RESPONSE)) {
            FacesContext facesContext = phaseEvent.getFacesContext();
            UIViewRoot root = facesContext.getViewRoot();
            if (root == null) {
                logger.debug("-- UIViewRoot nullo");
            } else {
                logger.debug("-- UIViewRoot: " + root.getViewId());
                //stampaFigli(root);
                UIForm form = (UIForm)trovaFiglio(root, "form");
                if (form != null) {
                }
            }
        }
    }
    
    private UIComponent trovaFiglio(UIComponent componente, String id) {
        List listaFigli = componente.getChildren();
        for (Iterator it = listaFigli.iterator(); it.hasNext(); ) {
            UIComponent figlio = (UIComponent)it.next();
            if (figlio.getId().equals(id)) {
                return figlio;
            }
        }
        return null;
    }
    
    private void stampaFigli(UIComponent componente) {
        List listaFigli = componente.getChildren();
        for (Iterator it = listaFigli.iterator(); it.hasNext(); ) {
            UIComponent figlio = (UIComponent)it.next();
            logger.debug("Componente figlio di viewRoot: " + figlio);
        }
    }
    
}
