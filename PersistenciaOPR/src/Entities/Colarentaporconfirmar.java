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
@Table(name = "COLARENTAPORCONFIRMAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colarentaporconfirmar.findAll", query = "SELECT c FROM Colarentaporconfirmar c"),
    @NamedQuery(name = "Colarentaporconfirmar.findByIdpropietario", query = "SELECT c FROM Colarentaporconfirmar c WHERE c.colarentaporconfirmarPK.idpropietario = :idpropietario"),
    @NamedQuery(name = "Colarentaporconfirmar.findByIdUsuario", query = "SELECT c FROM Colarentaporconfirmar c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "Colarentaporconfirmar.findByPropiedadIdPropiedad", query = "SELECT c FROM Colarentaporconfirmar c WHERE c.colarentaporconfirmarPK.propiedadIdPropiedad = :propiedadIdPropiedad")})
public class Colarentaporconfirmar implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ColarentaporconfirmarPK colarentaporconfirmarPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private BigInteger idUsuario;
    @JoinColumns({
        @JoinColumn(name = "IDPROPIETARIO", referencedColumnName = "IDPROPIETARIO", insertable = false, updatable = false),
        @JoinColumn(name = "PROPIEDAD_ID_PROPIEDAD", referencedColumnName = "IDPROPIEDAD", insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private Propiedad propiedad;

    public Colarentaporconfirmar() {
    }

    public Colarentaporconfirmar(ColarentaporconfirmarPK colarentaporconfirmarPK) {
        this.colarentaporconfirmarPK = colarentaporconfirmarPK;
    }

    public Colarentaporconfirmar(ColarentaporconfirmarPK colarentaporconfirmarPK, BigInteger idUsuario) {
        this.colarentaporconfirmarPK = colarentaporconfirmarPK;
        this.idUsuario = idUsuario;
    }

    public Colarentaporconfirmar(BigInteger idpropietario, BigInteger propiedadIdPropiedad) {
        this.colarentaporconfirmarPK = new ColarentaporconfirmarPK(idpropietario, propiedadIdPropiedad);
    }

    public ColarentaporconfirmarPK getColarentaporconfirmarPK() {
        return colarentaporconfirmarPK;
    }

    public void setColarentaporconfirmarPK(ColarentaporconfirmarPK colarentaporconfirmarPK) {
        this.colarentaporconfirmarPK = colarentaporconfirmarPK;
    }

    public BigInteger getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigInteger idUsuario) {
        this.idUsuario = idUsuario;
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
        hash += (colarentaporconfirmarPK != null ? colarentaporconfirmarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colarentaporconfirmar)) {
            return false;
        }
        Colarentaporconfirmar other = (Colarentaporconfirmar) object;
        if ((this.colarentaporconfirmarPK == null && other.colarentaporconfirmarPK != null) || (this.colarentaporconfirmarPK != null && !this.colarentaporconfirmarPK.equals(other.colarentaporconfirmarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Colarentaporconfirmar[ colarentaporconfirmarPK=" + colarentaporconfirmarPK + " ]";
    }
    
}
