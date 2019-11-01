package it.unibas.stampante.persistenza;

import it.unibas.stampante.eccezioni.DAOException;
import it.unibas.stampante.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
