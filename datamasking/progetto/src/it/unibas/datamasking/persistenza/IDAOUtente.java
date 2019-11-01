package it.unibas.datamasking.persistenza;

import it.unibas.datamasking.eccezioni.DAOException;
import it.unibas.datamasking.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
