package it.unibas.datamasking.persistenza.hibernate;

import it.unibas.datamasking.modello.Utente;
import it.unibas.datamasking.eccezioni.DAOException;
import it.unibas.datamasking.modello.Verbale;
import it.unibas.datamasking.persistenza.IDAOUtente;
import it.unibas.datamasking.persistenza.IDAOVerbale;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.criterion.Restrictions;

@ManagedBean(eager=true)
@ApplicationScoped
public class DAOVerbaleHibernate extends DAOGenericoHibernate<Verbale> implements IDAOVerbale {
    
    public DAOVerbaleHibernate() {
        super(Verbale.class);
    }
   
}