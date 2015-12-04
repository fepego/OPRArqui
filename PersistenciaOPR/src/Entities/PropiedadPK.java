/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Erika
 */
@Embeddable
public class PropiedadPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPIETARIO")
    private BigInteger idpropietario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPIEDAD")
    private BigInteger idpropiedad;

    public PropiedadPK() {
    }

    public PropiedadPK(BigInteger idpropietario, BigInteger idpropiedad) {
        this.idpropietario = idpropietario;
        this.idpropiedad = idpropiedad;
    }

    public BigInteger getIdpropietario() {
        return idpropietario;
    }

    public void setIdpropietario(BigInteger idpropietario) {
        this.idpropietario = idpropietario;
    }

    public BigInteger getIdpropiedad() {
        return idpropiedad;
    }

    public void setIdpropiedad(BigInteger idpropiedad) {
        this.idpropiedad = idpropiedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropietario != null ? idpropietario.hashCode() : 0);
        hash += (idpropiedad != null ? idpropiedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropiedadPK)) {
            return false;
        }
        PropiedadPK other = (PropiedadPK) object;
        if ((this.idpropietario == null && other.idpropietario != null) || (this.idpropietario != null && !this.idpropietario.equals(other.idpropietario))) {
            return false;
        }
        if ((this.idpropiedad == null && other.idpropiedad != null) || (this.idpropiedad != null && !this.idpropiedad.equals(other.idpropiedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PropiedadPK[ idpropietario=" + idpropietario + ", idpropiedad=" + idpropiedad + " ]";
    }
    
}
