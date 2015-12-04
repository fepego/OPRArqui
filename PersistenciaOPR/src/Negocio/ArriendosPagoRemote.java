/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import javax.ejb.Remote;

/**
 *
 * @author Erika
 */
@Remote
public interface ArriendosPagoRemote {
    
    
    public Integer verificarPago( String numeroCliente,String nombreCliente,String mesExp,String annoExp, String email, String TipoTarjeta, String cantidadDeposito,String periodoRenta, String fechaInicio  );
}
