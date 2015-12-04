/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Propiedad;
import Entities.Visitas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityResult;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.SqlResultSetMapping;

/**
 *
 * @author Erika
 */


@Stateless
public class VisitasFacade extends AbstractFacade<Visitas> implements VisitasFacadeLocal, Facades.VisitasFacadeRemote {

    @PersistenceContext(unitName = "SistemaOPRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VisitasFacade() {
        super(Visitas.class);
    }
    

    
    
    
}
