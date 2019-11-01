package it.unibas.scatolificio.persistenza;

import it.unibas.scatolificio.eccezioni.DAOException;
import it.unibas.scatolificio.modello.Utente;

public interface IDAOUtente extends IDAOGenerico<Utente> {
     
    public Utente findByNomeUtente(String nomeUtente) throws DAOException;

    public void save(Utente utente) throws DAOException;

    public void delete(Utente utente) throws DAOException;

}
