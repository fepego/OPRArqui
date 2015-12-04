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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erika
 */
@Entity
@Table(name = "ARRIENDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arriendo.findAll", query = "SELECT a FROM Arriendo a"),
    @NamedQuery(name = "Arriendo.findByIdUsuario", query = "SELECT a FROM Arriendo a WHERE a.idUsuario = :idUsuario"),
    @NamedQuery(name = "Arriendo.findByIdpropietario", query = "SELECT a FROM Arriendo a WHERE a.arriendoPK.idpropietario = :idpropietario"),
    @NamedQuery(name = "Arriendo.findByPropiedadIdPropiedad", query = "SELECT a FROM Arriendo a WHERE a.arriendoPK.propiedadIdPropiedad = :propiedadIdPropiedad"),
    @NamedQuery(name = "Arriendo.findByIdarriendo", query = "SELECT a FROM Arriendo a WHERE a.arriendoPK.idarriendo = :idarriendo"),
    @NamedQuery(name = "Arriendo.findByEmail", query = "SELECT a FROM Arriendo a WHERE a.email = :email"),
    @NamedQuery(name = "Arriendo.findByFechainicio", query = "SELECT a FROM Arriendo a WHERE a.fechainicio = :fechainicio"),
    @NamedQuery(name = "Arriendo.findByPeriodorenta", query = "SELECT a FROM Arriendo a WHERE a.periodorenta = :periodorenta"),
    @NamedQuery(name = "Arriendo.findByCosto", query = "SELECT a FROM Arriendo a WHERE a.costo = :costo"),
    @NamedQuery(name = "Arriendo.findByLink1", query = "SELECT a FROM Arriendo a WHERE a.link1 = :link1"),
    @NamedQuery(name = "Arriendo.findByLeaseaceptado", query = "SELECT a FROM Arriendo a WHERE a.leaseaceptado = :leaseaceptado")})
public class Arriendo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArriendoPK arriendoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private BigInteger idUsuario;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FECHAINICIO")
    private String fechainicio;
    @Column(name = "PERIODORENTA")
    private BigInteger periodorenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COSTO")
    private BigInteger costo;
    @Size(max = 300)
    @Column(name = "LINK1")
    private String link1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LEASEACEPTADO")
    private Character leaseaceptado;
    @JoinColumn(name = "IDDEPOSITO", referencedColumnName = "IDDEPOSITO")
    @ManyToOne(optional = false)
    private Deposito iddeposito;
    @JoinColumns({
        @JoinColumn(name = "IDPROPIETARIO", referencedColumnName = "IDPROPIETARIO", insertable = false, updatable = false),
        @JoinColumn(name = "PROPIEDAD_ID_PROPIEDAD", referencedColumnName = "IDPROPIEDAD", insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private Propiedad propiedad;

    public Arriendo() {
    }

    public Arriendo(ArriendoPK arriendoPK) {
        this.arriendoPK = arriendoPK;
    }

    public Arriendo(ArriendoPK arriendoPK, BigInteger idUsuario, String email, String fechainicio, BigInteger costo, Character leaseaceptado) {
        this.arriendoPK = arriendoPK;
        this.idUsuario = idUsuario;
        this.email = email;
        this.fechainicio = fechainicio;
        this.costo = costo;
        this.leaseaceptado = leaseaceptado;
    }

    public Arriendo(BigInteger idpropietario, BigInteger propiedadIdPropiedad, BigInteger idarriendo) {
        this.arriendoPK = new ArriendoPK(idpropietario, propiedadIdPropiedad, idarriendo);
    }

    public ArriendoPK getArriendoPK() {
        return arriendoPK;
    }

    public void setArriendoPK(ArriendoPK arriendoPK) {
        this.arriendoPK = arriendoPK;
    }

    public BigInteger getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigInteger idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public BigInteger getPeriodorenta() {
        return periodorenta;
    }

    public void setPeriodorenta(BigInteger periodorenta) {
        this.periodorenta = periodorenta;
    }

    public BigInteger getCosto() {
        return costo;
    }

    public void setCosto(BigInteger costo) {
        this.costo = costo;
    }

    public String getLink1() {
        return link1;
    }

    public void setLink1(String link1) {
        this.link1 = link1;
    }

    public Character getLeaseaceptado() {
        return leaseaceptado;
    }

    public void setLeaseaceptado(Character leaseaceptado) {
        this.leaseaceptado = leaseaceptado;
    }

    public Deposito getIddeposito() {
        return iddeposito;
    }

    public void setIddeposito(Deposito iddeposito) {
        this.iddeposito = iddeposito;
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
        hash += (arriendoPK != null ? arriendoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arriendo)) {
            return false;
        }
        Arriendo other = (Arriendo) object;
        if ((this.arriendoPK == null && other.arriendoPK != null) || (this.arriendoPK != null && !this.arriendoPK.equals(other.arriendoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Arriendo[ arriendoPK=" + arriendoPK + " ]";
    }
    
}
