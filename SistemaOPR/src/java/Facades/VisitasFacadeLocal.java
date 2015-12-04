/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Propiedad;
import Entities.Visitas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Erika
 */
@Local
public interface VisitasFacadeLocal {

    void create(Visitas visitas);

    void edit(Visitas visitas);

    void remove(Visitas visitas);

    Visitas find(Object id);

    List<Visitas> findAll();

    List<Visitas> findRange(int[] range);

    int count();

   
}
