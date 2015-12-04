/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Deposito;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Erika
 */
@Stateless
public class DepositoFacade extends AbstractFacade<Deposito> implements DepositoFacadeLocal, Facades.DepositoFacadeRemote {

    @PersistenceContext(unitName = "SistemaOPRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepositoFacade() {
        super(Deposito.class);
    }
    
}
