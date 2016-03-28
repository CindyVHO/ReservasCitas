/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.dtos;

import co.edu.uniandes.personalogic.entities.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Tabla que contiene los datos extra de un estudiante
 * @author Cindy
 */
public class StudentDTO {

    private Long id;
    private String avisarEmergenciaApellidos;
    private String avisarEmergenciaNombres;
    private String banco;
    private String cuentaBancaria;
    private String telefonoEmergencia;
    private PersonDTO persona;
    private ProgramDTO programa;
    private ProgramDTO doblePrograma;
    private FormationLevelDTO tipoEstudiante;
    private Boolean activo;

    /*Constructor de la clase*/
    public StudentDTO() { }
    
    /** Metodos Get y Set de los atributos de la clase */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvisarEmergenciaApellidos() {
        return avisarEmergenciaApellidos;
    }

    public void setAvisarEmergenciaApellidos(String avisarEmergenciaApellidos) {
        this.avisarEmergenciaApellidos = avisarEmergenciaApellidos;
    }

    public String getAvisarEmergenciaNombres() {
        return avisarEmergenciaNombres;
    }

    public void setAvisarEmergenciaNombres(String avisarEmergenciaNombres) {
        this.avisarEmergenciaNombres = avisarEmergenciaNombres;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public PersonDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonDTO persona) {
        this.persona = persona;
    }

    public ProgramDTO getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramDTO programa) {
        this.programa = programa;
    }

    public ProgramDTO getDoblePrograma() {
        return doblePrograma;
    }

    public void setDoblePrograma(ProgramDTO doblePrograma) {
        this.doblePrograma = doblePrograma;
    }

    public FormationLevelDTO getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(FormationLevelDTO tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
