package it.unibas.strutturescheletriche.persistenza;

import it.unibas.strutturescheletriche.eccezioni.DAOException;
import it.unibas.strutturescheletriche.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
