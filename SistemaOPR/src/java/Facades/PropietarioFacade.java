/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Propietario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Erika
 */
@Stateless
public class PropietarioFacade extends AbstractFacade<Propietario> implements PropietarioFacadeLocal, Facades.PropietarioFacadeRemote {

    @PersistenceContext(unitName = "SistemaOPRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PropietarioFacade() {
        super(Propietario.class);
    }
    
}
