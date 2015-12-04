/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import Entities.Foto;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Erika
 */
@Remote
public interface FotoFacadeRemote {

    void create(Foto foto);

    void edit(Foto foto);

    void remove(Foto foto);

    Foto find(Object id);

    List<Foto> findAll();

    List<Foto> findRange(int[] range);

    int count();
    
}
