/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Karina MartinezV
 */
@Entity
@Table(name = "DETALLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalle.findAll", query = "SELECT d FROM Detalle d"),
    @NamedQuery(name = "Detalle.findByDetalleId", query = "SELECT d FROM Detalle d WHERE d.detalleId = :detalleId"),
    @NamedQuery(name = "Detalle.findByCantidad", query = "SELECT d FROM Detalle d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detalle.findByDescripcion", query = "SELECT d FROM Detalle d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "Detalle.findByPrecio", query = "SELECT d FROM Detalle d WHERE d.precio = :precio")})
public class Detalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DETALLE_ID")
    private Integer detalleId;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PRECIO")
    private Integer precio;

    public Detalle() {
    }

    public Detalle(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public Integer getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Integer detalleId) {
        this.detalleId = detalleId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleId != null ? detalleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalle)) {
            return false;
        }
        Detalle other = (Detalle) object;
        if ((this.detalleId == null && other.detalleId != null) || (this.detalleId != null && !this.detalleId.equals(other.detalleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demo.Detalle[ detalleId=" + detalleId + " ]";
    }
    
}
