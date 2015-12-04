/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entities.Propiedad;
import Entities.Visitas;
import Facades.PropiedadFacadeLocal;
import Facades.VisitasFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Erika
 */
@Stateless
public class ControladorRDBMSPropiedades implements ControladorRDBMSPropiedadesLocal {

    @EJB
    private PropiedadFacadeLocal propiedadFacade;

  

  
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public List <Object[]> viewVistaPropiedades(String usuario, String contraseña){
    
    //List<Propiedad> propiedad= this.propiedadFacade.findAll();
   List <Object[]> propiedad= this.propiedadFacade.findProperties(usuario, contraseña);
    
    
    return propiedad;
}
}
