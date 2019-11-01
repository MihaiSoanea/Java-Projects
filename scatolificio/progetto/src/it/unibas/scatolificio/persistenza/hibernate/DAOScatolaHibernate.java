package it.unibas.scatolificio.persistenza.hibernate;

import it.unibas.scatolificio.modello.Scatola;
import it.unibas.scatolificio.persistenza.IDAOScatola;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager=true)
@ApplicationScoped
public class DAOScatolaHibernate extends DAOGenericoHibernate<Scatola> implements IDAOScatola {
    
    public DAOScatolaHibernate() {
        super(Scatola.class);
    }
    
    
}