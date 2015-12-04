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
public class ArriendoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPIETARIO")
    private BigInteger idpropietario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROPIEDAD_ID_PROPIEDAD")
    private BigInteger propiedadIdPropiedad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDARRIENDO")
    private BigInteger idarriendo;

    public ArriendoPK() {
    }

    public ArriendoPK(BigInteger idpropietario, BigInteger propiedadIdPropiedad, BigInteger idarriendo) {
        this.idpropietario = idpropietario;
        this.propiedadIdPropiedad = propiedadIdPropiedad;
        this.idarriendo = idarriendo;
    }

    public BigInteger getIdpropietario() {
        return idpropietario;
    }

    public void setIdpropietario(BigInteger idpropietario) {
        this.idpropietario = idpropietario;
    }

    public BigInteger getPropiedadIdPropiedad() {
        return propiedadIdPropiedad;
    }

    public void setPropiedadIdPropiedad(BigInteger propiedadIdPropiedad) {
        this.propiedadIdPropiedad = propiedadIdPropiedad;
    }

    public BigInteger getIdarriendo() {
        return idarriendo;
    }

    public void setIdarriendo(BigInteger idarriendo) {
        this.idarriendo = idarriendo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropietario != null ? idpropietario.hashCode() : 0);
        hash += (propiedadIdPropiedad != null ? propiedadIdPropiedad.hashCode() : 0);
        hash += (idarriendo != null ? idarriendo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArriendoPK)) {
            return false;
        }
        ArriendoPK other = (ArriendoPK) object;
        if ((this.idpropietario == null && other.idpropietario != null) || (this.idpropietario != null && !this.idpropietario.equals(other.idpropietario))) {
            return false;
        }
        if ((this.propiedadIdPropiedad == null && other.propiedadIdPropiedad != null) || (this.propiedadIdPropiedad != null && !this.propiedadIdPropiedad.equals(other.propiedadIdPropiedad))) {
            return false;
        }
        if ((this.idarriendo == null && other.idarriendo != null) || (this.idarriendo != null && !this.idarriendo.equals(other.idarriendo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ArriendoPK[ idpropietario=" + idpropietario + ", propiedadIdPropiedad=" + propiedadIdPropiedad + ", idarriendo=" + idarriendo + " ]";
    }
    
}
