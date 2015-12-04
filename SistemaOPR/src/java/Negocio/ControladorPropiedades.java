/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entities.Propiedad;
import Entities.Visitas;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Erika
 */
@Stateless
public class ControladorPropiedades implements ControladorPropiedadesRemote, ControladorPropiedadesLocal {

    @EJB
    private ControladorRDBMSPropiedadesLocal controladorRDBMSPropiedades;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List <Object[]> vistaPropiedades(String usuario, String contrasena){
    
    List <Object[]> propiedad= new ArrayList<Object[]>();
    propiedad = this.controladorRDBMSPropiedades.viewVistaPropiedades(usuario, contrasena);
    return propiedad;
}

}
