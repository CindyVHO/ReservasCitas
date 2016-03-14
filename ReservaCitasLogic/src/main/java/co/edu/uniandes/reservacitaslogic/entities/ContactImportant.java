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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Se har� uso de esta tabla para almacenar contactos que van a citas con coordinacion
 * y son importantes para la universidad.
 * @author Cindy
 */
@Entity
@Table (name = "datos_contacto_importante")
public class ContactImportant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*Contacto al cual se le quiere almacenar su datos*/
    @OneToOne
    @Column (name = "contacto")
    private Contact contacto;
    
    /*Columna que almacena el nombre de la empresa*/
    @Column (name = "empresa_contacto")
    private String empresa;
    
    /*Columna que almacena el cargo de la persona*/
    @Column (name = "cargo_contacto")
    private String cargo;
    
    /*Columna que almacena el telefono de celular de la persona*/
    @Column (name = "celular")
    private String celular;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contact getContacto() {
        return contacto;
    }

    public void setContacto(Contact contacto) {
        this.contacto = contacto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactImportant)) {
            return false;
        }
        ContactImportant other = (ContactImportant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.reservacitaslogic.entities.ContactImportant[ id=" + id + " ]";
    }
    
}
