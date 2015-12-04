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
public class ColarentaporconfirmarPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPIETARIO")
    private BigInteger idpropietario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROPIEDAD_ID_PROPIEDAD")
    private BigInteger propiedadIdPropiedad;

    public ColarentaporconfirmarPK() {
    }

    public ColarentaporconfirmarPK(BigInteger idpropietario, BigInteger propiedadIdPropiedad) {
        this.idpropietario = idpropietario;
        this.propiedadIdPropiedad = propiedadIdPropiedad;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropietario != null ? idpropietario.hashCode() : 0);
        hash += (propiedadIdPropiedad != null ? propiedadIdPropiedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColarentaporconfirmarPK)) {
            return false;
        }
        ColarentaporconfirmarPK other = (ColarentaporconfirmarPK) object;
        if ((this.idpropietario == null && other.idpropietario != null) || (this.idpropietario != null && !this.idpropietario.equals(other.idpropietario))) {
            return false;
        }
        if ((this.propiedadIdPropiedad == null && other.propiedadIdPropiedad != null) || (this.propiedadIdPropiedad != null && !this.propiedadIdPropiedad.equals(other.propiedadIdPropiedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ColarentaporconfirmarPK[ idpropietario=" + idpropietario + ", propiedadIdPropiedad=" + propiedadIdPropiedad + " ]";
    }
    
}
