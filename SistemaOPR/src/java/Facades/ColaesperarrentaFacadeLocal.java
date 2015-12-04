/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Colaesperarrenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Erika
 */
@Local
public interface ColaesperarrentaFacadeLocal {

    void create(Colaesperarrenta colaesperarrenta);

    void edit(Colaesperarrenta colaesperarrenta);

    void remove(Colaesperarrenta colaesperarrenta);

    Colaesperarrenta find(Object id);

    List<Colaesperarrenta> findAll();

    List<Colaesperarrenta> findRange(int[] range);

    int count();
    
}
