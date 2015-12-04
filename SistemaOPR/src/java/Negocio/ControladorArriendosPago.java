/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import webService.WebServiceInstFinanciera;

/**
 *
 * @author Erika
 */
@Stateless
public class ControladorArriendosPago implements ArriendosPagoRemote, ControladorArriendosPagoLocal {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_54443/WebServiceInstFinanciera.asmx.wsdl")
    private WebServiceInstFinanciera service;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    public Integer verificarPago( String numeroCliente,String nombreCliente,String mesExp,String annoExp, String email, String TipoTarjeta, String cantidadDeposito,String periodoRenta, String fechaInicio  ){
    
        // aca debe comunicarse con el -net de la institucion financiera
        Integer rta = 1;
        String s = this.helloWorld();
        if (s.equalsIgnoreCase("funciona")) return rta;
        
         rta = -1;
        
        return rta;
    }

    private String helloWorld() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webService.WebServiceInstFinancieraSoap port = service.getWebServiceInstFinancieraSoap();
        return port.helloWorld();
    }
    
}
