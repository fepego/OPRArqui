/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "VISITAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitas.findAll", query = "SELECT v FROM Visitas v"),
    @NamedQuery(name = "Visitas.findByIdvisitas", query = "SELECT v FROM Visitas v WHERE v.idvisitas = :idvisitas")})
public class Visitas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVISITAS")
    private BigDecimal idvisitas;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Cliente idusuario;
    @JoinColumns({
        @JoinColumn(name = "IDPROPIETARIO", referencedColumnName = "IDPROPIETARIO"),
        @JoinColumn(name = "IDPROPIEDAD_FK", referencedColumnName = "IDPROPIEDAD")})
    @ManyToOne(optional = false)
    private Propiedad propiedad;

    public Visitas() {
    }

    public Visitas(BigDecimal idvisitas) {
        this.idvisitas = idvisitas;
    }

    public BigDecimal getIdvisitas() {
        return idvisitas;
    }

    public void setIdvisitas(BigDecimal idvisitas) {
        this.idvisitas = idvisitas;
    }

    public Cliente getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Cliente idusuario) {
        this.idusuario = idusuario;
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
        hash += (idvisitas != null ? idvisitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitas)) {
            return false;
        }
        Visitas other = (Visitas) object;
        if ((this.idvisitas == null && other.idvisitas != null) || (this.idvisitas != null && !this.idvisitas.equals(other.idvisitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Visitas[ idvisitas=" + idvisitas + " ]";
    }
    
}
