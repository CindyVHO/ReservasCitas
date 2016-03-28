/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.dtos;

import java.util.Date;

/**
 * Tabla que contiene los datos de la persona
 * @author Cindy
 */
public class PersonDTO{

    private Long id;

    private String apellidos;
    private String nombres;
    private DocumentTypeDTO tipoDocumento;
    private String numDocumentoIdentidad;
    private String codigo;
    private Date fechaNacimiento;
    private String correo;
    private String correoAlterno;
    private String telefono;
    private String celular;
    private String extension;
    private CountryDTO pais;
    private String ciudadNacimiento;
    private String direccionResidencia;
    private String rol;
    private boolean activo;
    
    /* Constructor de la clase */
    public PersonDTO() {    }

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

    public DocumentTypeDTO getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(DocumentTypeDTO tipoDocumento) {
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

    public CountryDTO getPais() {
        return pais;
    }

    public void setPais(CountryDTO pais) {
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
