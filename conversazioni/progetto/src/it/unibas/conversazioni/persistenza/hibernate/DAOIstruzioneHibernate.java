package it.unibas.conversazioni.persistenza.hibernate;

import it.unibas.conversazioni.modello.Istruzione;
import it.unibas.conversazioni.persistenza.IDAOIstruzione;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager=true)
@ApplicationScoped
public class DAOIstruzioneHibernate extends DAOGenericoHibernate<Istruzione> implements IDAOIstruzione {

    public DAOIstruzioneHibernate() {
        super(Istruzione.class);
    }

}