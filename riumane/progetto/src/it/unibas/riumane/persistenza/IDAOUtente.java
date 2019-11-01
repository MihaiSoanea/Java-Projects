package it.unibas.riumane.persistenza;

import it.unibas.riumane.eccezioni.DAOException;
import it.unibas.riumane.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
