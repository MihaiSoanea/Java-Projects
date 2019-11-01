package it.unibas.ricercabrani.persistenza.hibernate;

import it.unibas.ricercabrani.modello.Utente;
import it.unibas.ricercabrani.eccezioni.DAOException;
import it.unibas.ricercabrani.modello.Ricerca;
import it.unibas.ricercabrani.persistenza.IDAORicerca;
import it.unibas.ricercabrani.persistenza.IDAOUtente;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.criterion.Restrictions;

@ManagedBean(eager=true)
@ApplicationScoped
public class DAORicercaHibernate extends DAOGenericoHibernate<Ricerca> implements IDAORicerca {
    
    public DAORicercaHibernate() {
        super(Ricerca.class);
    }
   
}