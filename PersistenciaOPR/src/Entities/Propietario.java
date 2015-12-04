/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Erika
 */
@Entity
@Table(name = "PROPIETARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propietario.findAll", query = "SELECT p FROM Propietario p"),
    @NamedQuery(name = "Propietario.findByIdpropietario", query = "SELECT p FROM Propietario p WHERE p.idpropietario = :idpropietario"),
    @NamedQuery(name = "Propietario.findByNombreUsuario", query = "SELECT p FROM Propietario p WHERE p.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Propietario.findByContrase\u00f1a", query = "SELECT p FROM Propietario p WHERE p.contrase\u00f1a = :contrase\u00f1a")})
public class Propietario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROPIETARIO")
    private BigDecimal idpropietario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CONTRASE\u00d1A")
    private String contraseña;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propietario")
    private List<Propiedad> propiedadList;

    public Propietario() {
    }

    public Propietario(BigDecimal idpropietario) {
        this.idpropietario = idpropietario;
    }

    public Propietario(BigDecimal idpropietario, String nombreUsuario, String contraseña) {
        this.idpropietario = idpropietario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public BigDecimal getIdpropietario() {
        return idpropietario;
    }

    public void setIdpropietario(BigDecimal idpropietario) {
        this.idpropietario = idpropietario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @XmlTransient
    public List<Propiedad> getPropiedadList() {
        return propiedadList;
    }

    public void setPropiedadList(List<Propiedad> propiedadList) {
        this.propiedadList = propiedadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpropietario != null ? idpropietario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietario)) {
            return false;
        }
        Propietario other = (Propietario) object;
        if ((this.idpropietario == null && other.idpropietario != null) || (this.idpropietario != null && !this.idpropietario.equals(other.idpropietario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Propietario[ idpropietario=" + idpropietario + " ]";
    }
    
}
