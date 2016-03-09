/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que contiene el tipo de cuenta de un estudiante
 * @author Cindy
 */
@Entity
@Table (name = "tipo_cuenta")
public class TipoCuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_tipo_cuenta")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /* Columna que hace referencia al nombre del tipo de cuenta*/
    @Column(name = "nombre_tipo_cuenta")
    private String nombre;

    /*Constructor de la clase*/
    public TipoCuenta() { }

    /** Metodos Get y Set de los atributos de la clase */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*Metodos Extra*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCuenta)) {
            return false;
        }
        TipoCuenta other = (TipoCuenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.personalogic.entities.TipoCuenta[ id=" + id + " ]";
    }
    
}
