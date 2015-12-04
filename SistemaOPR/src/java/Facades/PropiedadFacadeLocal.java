/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Propiedad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Erika
 */
@Local
public interface PropiedadFacadeLocal {

    void create(Propiedad propiedad);

    void edit(Propiedad propiedad);

    void remove(Propiedad propiedad);

    Propiedad find(Object id);

    List<Propiedad> findAll();

    List<Propiedad> findRange(int[] range);

    int count();

   public List <Object[]> findProperties(String usuario, String contraseña);
    
    
}
