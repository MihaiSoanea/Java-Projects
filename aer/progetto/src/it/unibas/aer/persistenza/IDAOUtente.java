package it.unibas.aer.persistenza;

import it.unibas.aer.eccezioni.DAOException;
import it.unibas.aer.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
