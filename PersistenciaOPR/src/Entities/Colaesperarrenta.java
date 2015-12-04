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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erika
 */
@Entity
@Table(name = "COLAESPERARRENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colaesperarrenta.findAll", query = "SELECT c FROM Colaesperarrenta c"),
    @NamedQuery(name = "Colaesperarrenta.findByIdpropietario", query = "SELECT c FROM Colaesperarrenta c WHERE c.colaesperarrentaPK.idpropietario = :idpropietario"),
    @NamedQuery(name = "Colaesperarrenta.findByIdUsuario", query = "SELECT c FROM Colaesperarrenta c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "Colaesperarrenta.findByPropiedadIdPropiedad", query = "SELECT c FROM Colaesperarrenta c WHERE c.colaesperarrentaPK.propiedadIdPropiedad = :propiedadIdPropiedad"),
    @NamedQuery(name = "Colaesperarrenta.findByNumprioridad", query = "SELECT c FROM Colaesperarrenta c WHERE c.numprioridad = :numprioridad")})
public class Colaesperarrenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ColaesperarrentaPK colaesperarrentaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private BigInteger idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMPRIORIDAD")
    private BigInteger numprioridad;
    @JoinColumns({
        @JoinColumn(name = "IDPROPIETARIO", referencedColumnName = "IDPROPIETARIO", insertable = false, updatable = false),
        @JoinColumn(name = "PROPIEDAD_ID_PROPIEDAD", referencedColumnName = "IDPROPIEDAD", insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private Propiedad propiedad;

    public Colaesperarrenta() {
    }

    public Colaesperarrenta(ColaesperarrentaPK colaesperarrentaPK) {
        this.colaesperarrentaPK = colaesperarrentaPK;
    }

    public Colaesperarrenta(ColaesperarrentaPK colaesperarrentaPK, BigInteger idUsuario, BigInteger numprioridad) {
        this.colaesperarrentaPK = colaesperarrentaPK;
        this.idUsuario = idUsuario;
        this.numprioridad = numprioridad;
    }

    public Colaesperarrenta(BigInteger idpropietario, BigInteger propiedadIdPropiedad) {
        this.colaesperarrentaPK = new ColaesperarrentaPK(idpropietario, propiedadIdPropiedad);
    }

    public ColaesperarrentaPK getColaesperarrentaPK() {
        return colaesperarrentaPK;
    }

    public void setColaesperarrentaPK(ColaesperarrentaPK colaesperarrentaPK) {
        this.colaesperarrentaPK = colaesperarrentaPK;
    }

    public BigInteger getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigInteger idUsuario) {
        this.idUsuario = idUsuario;
    }

    public BigInteger getNumprioridad() {
        return numprioridad;
    }

    public void setNumprioridad(BigInteger numprioridad) {
        this.numprioridad = numprioridad;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (colaesperarrentaPK != null ? colaesperarrentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colaesperarrenta)) {
            return false;
        }
        Colaesperarrenta other = (Colaesperarrenta) object;
        if ((this.colaesperarrentaPK == null && other.colaesperarrentaPK != null) || (this.colaesperarrentaPK != null && !this.colaesperarrentaPK.equals(other.colaesperarrentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Colaesperarrenta[ colaesperarrentaPK=" + colaesperarrentaPK + " ]";
    }
    
}
