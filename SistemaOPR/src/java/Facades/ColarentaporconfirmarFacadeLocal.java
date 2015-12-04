/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Colarentaporconfirmar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Erika
 */
@Local
public interface ColarentaporconfirmarFacadeLocal {

    void create(Colarentaporconfirmar colarentaporconfirmar);

    void edit(Colarentaporconfirmar colarentaporconfirmar);

    void remove(Colarentaporconfirmar colarentaporconfirmar);

    Colarentaporconfirmar find(Object id);

    List<Colarentaporconfirmar> findAll();

    List<Colarentaporconfirmar> findRange(int[] range);

    int count();
    
}
