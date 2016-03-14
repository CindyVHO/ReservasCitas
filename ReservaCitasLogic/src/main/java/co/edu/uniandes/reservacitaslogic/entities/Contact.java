/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tabla encargada de almacenar los datos de contacto para realizar la cita, 
 * se hara uso principalmente cuando se realiza atencion a padres
 * @author Cindy
 */
@Entity
@Table (name = "contacto")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /* Columna que hace referencia al nombre de la persona que va a tener la cita en caso de que no exista en la BD */
    @Column (name = "nombre_contacto")
    private String nombreContacto;
    
    /* Columna que hace referencia al numero de contacto de la persona que va a tener la cita en caso de que no exista en la BD */
    @Column (name = "numero_contacto")
    private String numeroContacto;
    
    /* Constructor de la clase*/
    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    
    /* Metodos Extra */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.reservacitaslogic.entities.Contact[ id=" + id + " ]";
    }
    
}
