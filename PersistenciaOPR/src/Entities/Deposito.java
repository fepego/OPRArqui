/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "DEPOSITO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deposito.findAll", query = "SELECT d FROM Deposito d"),
    @NamedQuery(name = "Deposito.findByIddeposito", query = "SELECT d FROM Deposito d WHERE d.iddeposito = :iddeposito"),
    @NamedQuery(name = "Deposito.findByTipoDeTarjeta", query = "SELECT d FROM Deposito d WHERE d.tipoDeTarjeta = :tipoDeTarjeta"),
    @NamedQuery(name = "Deposito.findByNumerotarjeta", query = "SELECT d FROM Deposito d WHERE d.numerotarjeta = :numerotarjeta"),
    @NamedQuery(name = "Deposito.findByNombredue\u00f1o", query = "SELECT d FROM Deposito d WHERE d.nombredue\u00f1o = :nombredue\u00f1o"),
    @NamedQuery(name = "Deposito.findByMesexpiraci\u00f3n", query = "SELECT d FROM Deposito d WHERE d.mesexpiraci\u00f3n = :mesexpiraci\u00f3n"),
    @NamedQuery(name = "Deposito.findByMontodeposito", query = "SELECT d FROM Deposito d WHERE d.montodeposito = :montodeposito"),
    @NamedQuery(name = "Deposito.findByAnoexpiracion", query = "SELECT d FROM Deposito d WHERE d.anoexpiracion = :anoexpiracion")})
public class Deposito implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEPOSITO")
    private BigDecimal iddeposito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPO_DE_TARJETA")
    private String tipoDeTarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROTARJETA")
    private BigInteger numerotarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBREDUE\u00d1O")
    private String nombredueño;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MESEXPIRACI\u00d3N")
    private BigInteger mesexpiración;
    @Column(name = "MONTODEPOSITO")
    private BigInteger montodeposito;
    @Column(name = "ANOEXPIRACION")
    private BigInteger anoexpiracion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddeposito")
    private List<Arriendo> arriendoList;

    public Deposito() {
    }

    public Deposito(BigDecimal iddeposito) {
        this.iddeposito = iddeposito;
    }

    public Deposito(BigDecimal iddeposito, String tipoDeTarjeta, BigInteger numerotarjeta, String nombredueño, BigInteger mesexpiración) {
        this.iddeposito = iddeposito;
        this.tipoDeTarjeta = tipoDeTarjeta;
        this.numerotarjeta = numerotarjeta;
        this.nombredueño = nombredueño;
        this.mesexpiración = mesexpiración;
    }

    public BigDecimal getIddeposito() {
        return iddeposito;
    }

    public void setIddeposito(BigDecimal iddeposito) {
        this.iddeposito = iddeposito;
    }

    public String getTipoDeTarjeta() {
        return tipoDeTarjeta;
    }

    public void setTipoDeTarjeta(String tipoDeTarjeta) {
        this.tipoDeTarjeta = tipoDeTarjeta;
    }

    public BigInteger getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(BigInteger numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public String getNombredueño() {
        return nombredueño;
    }

    public void setNombredueño(String nombredueño) {
        this.nombredueño = nombredueño;
    }

    public BigInteger getMesexpiración() {
        return mesexpiración;
    }

    public void setMesexpiración(BigInteger mesexpiración) {
        this.mesexpiración = mesexpiración;
    }

    public BigInteger getMontodeposito() {
        return montodeposito;
    }

    public void setMontodeposito(BigInteger montodeposito) {
        this.montodeposito = montodeposito;
    }

    public BigInteger getAnoexpiracion() {
        return anoexpiracion;
    }

    public void setAnoexpiracion(BigInteger anoexpiracion) {
        this.anoexpiracion = anoexpiracion;
    }

    @XmlTransient
    public List<Arriendo> getArriendoList() {
        return arriendoList;
    }

    public void setArriendoList(List<Arriendo> arriendoList) {
        this.arriendoList = arriendoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddeposito != null ? iddeposito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deposito)) {
            return false;
        }
        Deposito other = (Deposito) object;
        if ((this.iddeposito == null && other.iddeposito != null) || (this.iddeposito != null && !this.iddeposito.equals(other.iddeposito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Deposito[ iddeposito=" + iddeposito + " ]";
    }
    
}
