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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Tabla que contiene los datos extra de un estudiante
 * @author Cindy
 */
@Entity
@Table (name = "estudiante")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_estudiante")
    private Long id;
    
    @Column(name = "avisar_emergencia_apellidos")
    private String avisarEmergenciaApellidos;
    
    @Column(name = "avisar_emergencia_nombres")
    private String avisarEmergenciaNombres;
    
    @Column(name = "banco")
    private String banco;
    
    @Column(name = "cuenta_bancaria")
    private String cuentaBancaria;
    
    @Column(name = "telefono_emergencia")
    private String telefonoEmergencia;
    
    @JoinColumn (name = "id_persona")
    @OneToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private Person persona;
    
    @JoinColumn (name = "id_programa")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private Program programa;
    
    @JoinColumn (name = "id_doble_programa")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private Program doblePrograma;
    
    @JoinColumn (name = "id_nivel_formacion")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private FormationLevel tipoEstudiante;
    
    @Column(name = "activo")
    private Boolean activo;

    /*Constructor de la clase*/
    public Student() { }
    
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

    public Person getPersona() {
        return persona;
    }

    public void setPersona(Person persona) {
        this.persona = persona;
    }

    public Program getPrograma() {
        return programa;
    }

    public void setPrograma(Program programa) {
        this.programa = programa;
    }

    public Program getDoblePrograma() {
        return doblePrograma;
    }

    public void setDoblePrograma(Program doblePrograma) {
        this.doblePrograma = doblePrograma;
    }

    public FormationLevel getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(FormationLevel tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.reservacitaslogic.entities.Student[ id=" + id + " ]";
    }
    
}
