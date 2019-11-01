package it.unibas.titoliazionari.persistenza;

import it.unibas.titoliazionari.eccezioni.DAOException;
import it.unibas.titoliazionari.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
