/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tabla que contiene los datos de la persona
 * @author Cindy
 */
@Entity
@Table(name = "persona")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_persona")
    private Long id;

    /*Columna que almacena los apellidos de la persona*/
    @Column(name = "apellidos")
    private String apellidos;

    /*Columna que almacena los nombres de la persona*/
    @Column(name = "nombres")
    private String nombres;
    
    /*Columna que almacena el tipo de documento de la persona*/
    @Column(name = "id_tipo_documento")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private DocumentType tipoDocumento;
    
    /*Columna que almacena el numero de documento de la persona*/
    @Column(name = "numero_documento")
    private String numDocumentoIdentidad;
    
    /*Columna que almacena el codigo de la persona*/
    @Column(name = "codigo")
    private String codigo;
    
    /*Columna que almacena la fecha de nacimiento de la persona*/
    @Column(name = "fecha_nacimiento")
    private Timestamp fechaNacimiento;

    /*Columna que almacena el correo de la persona*/
    @Column(name = "correo", unique = true)
    private String correo;

    /*Columna que almacena el correo alterno de la persona*/
    @Column(name = "correo_alterno")
    private String correoAlterno;
    
    /*Columna que almacena el telefono de la persona en caso de que tenga*/
    @Column(name = "telefono")
    private String telefono;
    
    /*Columna que almacena el celular de la persona*/
    @Column(name = "celular")
    private String celular;
    
    /*Columna que almacena la extension de la persona en caso de que sea empleado de la Universidad*/
    @Column(name = "extension")
    private String extension;
    
    /*Columna que almacena el pais de la persona*/
    @Column(name = "id_pais")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private Country pais;

    /*Columna que almacena la ciudad de nacimiento de la persona*/
    @Column(name = "ciudad_nacimiento")
    private String ciudadNacimiento;

    /*Columna que almacena la direccion de residencia de la persona*/
    @Column(name = "direccion_residencia")
    private String direccionResidencia;
    
    /*Columna que almacena si la persona se encuentra activa o no*/
    @Column(name = "activo")
    private boolean activo;
    
    /* Constructor de la clase */
    public Person() {    }

    /**
     * Metodos Get y Set de los atributos de la clase
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public DocumentType getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(DocumentType tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumentoIdentidad() {
        return numDocumentoIdentidad;
    }

    public void setNumDocumentoIdentidad(String numDocumentoIdentidad) {
        this.numDocumentoIdentidad = numDocumentoIdentidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Timestamp getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Timestamp fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreoAlterno() {
        return correoAlterno;
    }

    public void setCorreoAlterno(String correoAlterno) {
        this.correoAlterno = correoAlterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Country getPais() {
        return pais;
    }

    public void setPais(Country pais) {
        this.pais = pais;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.reservacitaslogic.entities.Person[ id=" + id + " ]";
    }

}
