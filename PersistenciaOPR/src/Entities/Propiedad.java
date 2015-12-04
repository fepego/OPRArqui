/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "PROPIEDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propiedad.findAll", query = "SELECT p FROM Propiedad p"),
    @NamedQuery(name = "Propiedad.findByIdpropietario", query = "SELECT p FROM Propiedad p WHERE p.propiedadPK.idpropietario = :idpropietario"),
    @NamedQuery(name = "Propiedad.findByIdpropiedad", query = "SELECT p FROM Propiedad p WHERE p.propiedadPK.idpropiedad = :idpropiedad"),
    @NamedQuery(name = "Propiedad.findByDireccion", query = "SELECT p FROM Propiedad p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Propiedad.findByLocalidad", query = "SELECT p FROM Propiedad p WHERE p.localidad = :localidad"),
    @NamedQuery(name = "Propiedad.findByTipopropiedad", query = "SELECT p FROM Propiedad p WHERE p.tipopropiedad = :tipopropiedad"),
    @NamedQuery(name = "Propiedad.findByNumerocuartos", query = "SELECT p FROM Propiedad p WHERE p.numerocuartos = :numerocuartos"),
    @NamedQuery(name = "Propiedad.findByCosto", query = "SELECT p FROM Propiedad p WHERE p.costo = :costo")})
public class Propiedad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropiedadPK propiedadPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TIPOPROPIEDAD")
    private String tipopropiedad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROCUARTOS")
    private BigInteger numerocuartos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COSTO")
    private BigInteger costo;
    @JoinColumn(name = "IDPROPIETARIO", referencedColumnName = "IDPROPIETARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Propietario propietario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propiedad")
    private List<Visitas> visitasList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "propiedad")
    private Arriendo arriendo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propiedad")
    private List<Foto> fotoList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "propiedad")
    private Colaesperarrenta colaesperarrenta;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "propiedad")
    private Colarentaporconfirmar colarentaporconfirmar;

    public Propiedad() {
    }

    public Propiedad(PropiedadPK propiedadPK) {
        this.propiedadPK = propiedadPK;
    }

    public Propiedad(PropiedadPK propiedadPK, String direccion, String localidad, String tipopropiedad, BigInteger numerocuartos, BigInteger costo) {
        this.propiedadPK = propiedadPK;
        this.direccion = direccion;
        this.localidad = localidad;
        this.tipopropiedad = tipopropiedad;
        this.numerocuartos = numerocuartos;
        this.costo = costo;
    }

    public Propiedad(BigInteger idpropietario, BigInteger idpropiedad) {
        this.propiedadPK = new PropiedadPK(idpropietario, idpropiedad);
    }

    public PropiedadPK getPropiedadPK() {
        return propiedadPK;
    }

    public void setPropiedadPK(PropiedadPK propiedadPK) {
        this.propiedadPK = propiedadPK;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTipopropiedad() {
        return tipopropiedad;
    }

    public void setTipopropiedad(String tipopropiedad) {
        this.tipopropiedad = tipopropiedad;
    }

    public BigInteger getNumerocuartos() {
        return numerocuartos;
    }

    public void setNumerocuartos(BigInteger numerocuartos) {
        this.numerocuartos = numerocuartos;
    }

    public BigInteger getCosto() {
        return costo;
    }

    public void setCosto(BigInteger costo) {
        this.costo = costo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @XmlTransient
    public List<Visitas> getVisitasList() {
        return visitasList;
    }

    public void setVisitasList(List<Visitas> visitasList) {
        this.visitasList = visitasList;
    }

    public Arriendo getArriendo() {
        return arriendo;
    }

    public void setArriendo(Arriendo arriendo) {
        this.arriendo = arriendo;
    }

    @XmlTransient
    public List<Foto> getFotoList() {
        return fotoList;
    }

    public void setFotoList(List<Foto> fotoList) {
        this.fotoList = fotoList;
    }

    public Colaesperarrenta getColaesperarrenta() {
        return colaesperarrenta;
    }

    public void setColaesperarrenta(Colaesperarrenta colaesperarrenta) {
        this.colaesperarrenta = colaesperarrenta;
    }

    public Colarentaporconfirmar getColarentaporconfirmar() {
        return colarentaporconfirmar;
    }

    public void setColarentaporconfirmar(Colarentaporconfirmar colarentaporconfirmar) {
        this.colarentaporconfirmar = colarentaporconfirmar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propiedadPK != null ? propiedadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propiedad)) {
            return false;
        }
        Propiedad other = (Propiedad) object;
        if ((this.propiedadPK == null && other.propiedadPK != null) || (this.propiedadPK != null && !this.propiedadPK.equals(other.propiedadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Propiedad[ propiedadPK=" + propiedadPK + " ]";
    }
    
}
