package it.unibas.panini.persistenza.hibernate;

import it.unibas.panini.modello.Panino;
import it.unibas.panini.persistenza.IDAOPanino;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager=true)
@ApplicationScoped
public class DAOPaninoHibernate extends DAOGenericoHibernate<Panino> implements IDAOPanino {
    
    public DAOPaninoHibernate() {
        super(Panino.class);
    }
    

}