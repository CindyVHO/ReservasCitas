/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tabla que almacena la facultad a la que pertenece un Programa
 * @author Cindy
 */
@Entity
@Table (name = "facultad")
public class Faculty implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_facultad")
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
    @JoinColumn
    private Collection<Program> programas;

    /* Metodo Constructor de la clase*/
    public Faculty() {     }
    
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

    public Collection<Program> getProgramas() {
        return programas;
    }

    public void setProgramas(Collection<Program> programas) {
        this.programas = programas;
    }
    
    /* Metodos Extra*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.personalogic.entities.Facultad[ id=" + id + " ]";
    }
    
}
