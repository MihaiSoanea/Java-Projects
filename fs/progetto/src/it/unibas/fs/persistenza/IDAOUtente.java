package it.unibas.fs.persistenza;

import it.unibas.fs.eccezioni.DAOException;
import it.unibas.fs.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
