/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Propiedad;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Erika
 */
@Remote
public interface PropiedadFacadeRemote {

    void create(Propiedad propiedad);

    void edit(Propiedad propiedad);

    void remove(Propiedad propiedad);

    Propiedad find(Object id);

    List<Propiedad> findAll();

    List<Propiedad> findRange(int[] range);

    int count();
    
}
