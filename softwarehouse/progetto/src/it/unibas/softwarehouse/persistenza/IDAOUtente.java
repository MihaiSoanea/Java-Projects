package it.unibas.softwarehouse.persistenza;

import it.unibas.softwarehouse.eccezioni.DAOException;
import it.unibas.softwarehouse.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
