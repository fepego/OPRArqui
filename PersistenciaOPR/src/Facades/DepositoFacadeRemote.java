/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Deposito;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Erika
 */
@Remote
public interface DepositoFacadeRemote {

    void create(Deposito deposito);

    void edit(Deposito deposito);

    void remove(Deposito deposito);

    Deposito find(Object id);

    List<Deposito> findAll();

    List<Deposito> findRange(int[] range);

    int count();
    
}
