/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erika
 */
@Entity
@Table(name = "FOTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foto.findAll", query = "SELECT f FROM Foto f"),
    @NamedQuery(name = "Foto.findByIdFoto", query = "SELECT f FROM Foto f WHERE f.idFoto = :idFoto"),
    @NamedQuery(name = "Foto.findByIdFoto1", query = "SELECT f FROM Foto f WHERE f.idFoto1 = :idFoto1")})
public class Foto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FOTO")
    private BigDecimal idFoto;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "FOTOGRAFIA")
    private Serializable fotografia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FOTO1")
    private BigInteger idFoto1;
    @JoinColumns({
        @JoinColumn(name = "IDPROPIETARIO", referencedColumnName = "IDPROPIETARIO"),
        @JoinColumn(name = "PROPIEDAD_ID_PROPIEDAD", referencedColumnName = "IDPROPIEDAD")})
    @ManyToOne(optional = false)
    private Propiedad propiedad;

    public Foto() {
    }

    public Foto(BigDecimal idFoto) {
        this.idFoto = idFoto;
    }

    public Foto(BigDecimal idFoto, Serializable fotografia, BigInteger idFoto1) {
        this.idFoto = idFoto;
        this.fotografia = fotografia;
        this.idFoto1 = idFoto1;
    }

    public BigDecimal getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(BigDecimal idFoto) {
        this.idFoto = idFoto;
    }

    public Serializable getFotografia() {
        return fotografia;
    }

    public void setFotografia(Serializable fotografia) {
        this.fotografia = fotografia;
    }

    public BigInteger getIdFoto1() {
        return idFoto1;
    }

    public void setIdFoto1(BigInteger idFoto1) {
        this.idFoto1 = idFoto1;
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
        hash += (idFoto != null ? idFoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foto)) {
            return false;
        }
        Foto other = (Foto) object;
        if ((this.idFoto == null && other.idFoto != null) || (this.idFoto != null && !this.idFoto.equals(other.idFoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Foto[ idFoto=" + idFoto + " ]";
    }
    
}
