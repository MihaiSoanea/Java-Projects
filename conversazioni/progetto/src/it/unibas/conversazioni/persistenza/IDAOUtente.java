package it.unibas.conversazioni.persistenza;

import it.unibas.conversazioni.eccezioni.DAOException;
import it.unibas.conversazioni.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
