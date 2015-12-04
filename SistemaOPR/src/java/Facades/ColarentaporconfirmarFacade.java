/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Colarentaporconfirmar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Erika
 */
@Stateless
public class ColarentaporconfirmarFacade extends AbstractFacade<Colarentaporconfirmar> implements ColarentaporconfirmarFacadeLocal, Facades.ColarentaporconfirmarFacadeRemote {

    @PersistenceContext(unitName = "SistemaOPRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ColarentaporconfirmarFacade() {
        super(Colarentaporconfirmar.class);
    }
    
}
