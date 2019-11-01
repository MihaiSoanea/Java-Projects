package it.unibas.aer.persistenza.hibernate;

import it.unibas.aer.modello.Volo;
import it.unibas.aer.persistenza.IDAOVolo;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager=true)
@ApplicationScoped
public class DAOVoloHibernate extends DAOGenericoHibernate<Volo> implements IDAOVolo {
    
    public DAOVoloHibernate() {
        super(Volo.class);
    }
    

}