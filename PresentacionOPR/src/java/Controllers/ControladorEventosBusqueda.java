/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

/**
 *
 * @author Erika
 */
@Named(value = "controladorEventosBusqueda")
@RequestScoped
public class ControladorEventosBusqueda implements Serializable {

    /**
     * Creates a new instance of ControladorEventosBusqueda
     */
    public ControladorEventosBusqueda() {
    }
    
}
