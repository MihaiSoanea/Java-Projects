package it.unibas.dist.persistenza;

import it.unibas.dist.eccezioni.DAOException;
import it.unibas.dist.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
