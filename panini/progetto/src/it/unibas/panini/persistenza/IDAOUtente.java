package it.unibas.panini.persistenza;

import it.unibas.panini.eccezioni.DAOException;
import it.unibas.panini.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
