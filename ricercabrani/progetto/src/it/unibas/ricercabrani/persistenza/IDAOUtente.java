package it.unibas.ricercabrani.persistenza;

import it.unibas.ricercabrani.eccezioni.DAOException;
import it.unibas.ricercabrani.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
