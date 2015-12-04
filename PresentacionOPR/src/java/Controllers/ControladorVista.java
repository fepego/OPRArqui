/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Propiedad;
import Entities.Visitas;
import Negocio.ControladorPropiedadesRemote;
import javax.inject.Named;
import javax.enterprise.context.*;//se cambio
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Erika
 */
@Named(value = "controladorVista")
@SessionScoped
public class ControladorVista implements Serializable {

    @EJB
    private ControladorPropiedadesRemote controladorPropiedades;

    /**
     * Creates a new instance of ControladorVista
     */
    private String usuario="", contrasena="";
    public ControladorVista() {
        
    }
    
    public String viewVisitingList(){
    List <Object[]> empty = controladorPropiedades.vistaPropiedades(this.usuario,this.contrasena);
    if (empty.isEmpty()) 
        return "VistaPropiedadVacia";
    
      return "VistaPropiedad.xhtml";
    } 
    
   
    public String regresarIndex(){
        return "index.xhtml";
    }
    
    public String formularioArriendoir(){
        return "FormularioArriendo.xhtml";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public List <Object[]> returnVisitingList(){
        
      return this.controladorPropiedades.vistaPropiedades(this.usuario,this.contrasena); 
    }
}
