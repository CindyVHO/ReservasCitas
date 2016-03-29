/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que contiene los programas
 * @author Cindy
 */
@Entity
@Table (name = "programa")
public class Program implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_programa")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /*Columna que contiene el nombre del programa*/
    @Column(name = "nombre_programa")
    private String nombrePrograma;

    /*Columna que almacena la facultad a la que pertenece el programa*/
    @JoinColumn (name = "id_facultad")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private Faculty facultad;

    /*Columna que almacena el codigo del programa*/
    @Column(name = "codigo")
    private String codigo;

    /* Constructor de la clase */
    public Program() {     }

    /** Metodos Get y Set de los atributos de la clase */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public Faculty getFacultad() {
        return facultad;
    }

    public void setFacultad(Faculty facultad) {
        this.facultad = facultad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        if (!(object instanceof Program)) {
            return false;
        }
        Program other = (Program) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.reservacitaslogic.entities.Programa[ id=" + id + " ]";
    }
}
