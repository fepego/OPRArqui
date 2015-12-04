/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entities.Propiedad;
import Entities.Visitas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Erika
 */
@Remote
public interface ControladorPropiedadesRemote {
    
    public List <Object[]> vistaPropiedades(String usuario, String contrasena);
    
}
