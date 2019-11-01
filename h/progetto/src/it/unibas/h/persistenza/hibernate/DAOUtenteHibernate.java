package it.unibas.h.persistenza.hibernate;

import it.unibas.h.modello.Utente;
import it.unibas.h.eccezioni.DAOException;
import it.unibas.h.persistenza.IDAOUtente;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.criterion.Restrictions;

@ManagedBean(eager=true)
@ApplicationScoped
public class DAOUtenteHibernate extends DAOGenericoHibernate<Utente> implements IDAOUtente {
    
    public DAOUtenteHibernate() {
        super(Utente.class);
    }
    
    public Utente findByNomeUtente(String nomeUtente) throws DAOException {
        List<Utente> lista = super.findByCriteria(Restrictions.eq("nomeUtente", nomeUtente));
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }

    public void save(Utente utente) throws DAOException {
        super.makePersistent(utente);
    }

    public void delete(Utente utente) throws DAOException {
        super.makeTransient(utente);
    }
}