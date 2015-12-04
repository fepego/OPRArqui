/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Negocio.ArriendosPagoRemote;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Erika
 */
@Named(value = "controladorEventosArriendos")
@SessionScoped
public class ControladorEventosArriendos implements Serializable {

    @EJB
    private ArriendosPagoRemote arriendosPago;


    /**
     * Creates a new instance of ControladorEventosArriendos
     */
    private String numeroTarjeta;
    private String nombreCliente;
    private String mesExp;
    private String annoExp;
    private String email;
    private String TipoTarjeta;
    private String cantidadDeposito ; 
    private String periodoRenta ;
    private String fechaInicio ;
    private String idDeposito;
    public String getIdDeposito() {
        return idDeposito;
    } 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoTarjeta() {
        return TipoTarjeta;
    }

    public void setTipoTarjeta(String TipoTarjeta) {
        this.TipoTarjeta = TipoTarjeta;
    }

    public ArriendosPagoRemote getArriendosPago() {
        return arriendosPago;
    }

    public void setArriendosPago(ArriendosPagoRemote arriendosPago) {
        this.arriendosPago = arriendosPago;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCantidadDeposito() {
        return cantidadDeposito;
    }

    public void setCantidadDeposito(String cantidadDeposito) {
        this.cantidadDeposito = cantidadDeposito;
    }

    public String getPeriodoRenta() {
        return periodoRenta;
    }

    public void setPeriodoRenta(String periodoRenta) {
        this.periodoRenta = periodoRenta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

   

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getMesExp() {
        return mesExp;
    }

    public void setMesExp(String mesExp) {
        this.mesExp = mesExp;
    }

    public String getAnnoExp() {
        return annoExp;
    }

    public void setAnnoExp(String annoExp) {
        this.annoExp = annoExp;
    }
 
    public ControladorEventosArriendos() {
    }
    public String vistaArriendos(){
        return "FormularioArriendo.xhtml";
    }
    public String regresar(){
        return"index.xhtml";
    }
   //agregar el campo de las tres variables sin asignar 
    public String verificarPago(){
    cantidadDeposito = "" ; 
    periodoRenta = "";
     fechaInicio = "";
    Integer idDeposito1 = this.arriendosPago.verificarPago(numeroTarjeta,nombreCliente,mesExp, annoExp, email,TipoTarjeta, cantidadDeposito,periodoRenta,fechaInicio  );
    idDeposito = Integer.toString(idDeposito1) ;
     
    return "VerificarPago.xhtml";}
    
 public String idDeposit(){

return idDeposito;
}



}

