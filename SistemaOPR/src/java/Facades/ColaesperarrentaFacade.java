/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Colaesperarrenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Erika
 */
@Stateless
public class ColaesperarrentaFacade extends AbstractFacade<Colaesperarrenta> implements ColaesperarrentaFacadeLocal, Facades.ColaesperarrentaFacadeRemote {

    @PersistenceContext(unitName = "SistemaOPRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ColaesperarrentaFacade() {
        super(Colaesperarrenta.class);
    }
    
}
