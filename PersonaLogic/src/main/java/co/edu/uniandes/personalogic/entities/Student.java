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
    
    @Column (name = "tipo_cuenta")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private TipoCuenta tipoCuenta;
    
    @Column (name = "id_persona")
    @OneToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private Person persona;
    
    @Column (name = "id_info_academica")
    @OneToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL)
    private InformacionAcademica informacion_Academica;
    
    @Column (name = "id_programa")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private Programa programa;
    
    @Column (name = "id_doble_programa")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private Programa doblePrograma;
    
    @Column (name = "id_nivel_formacion")
    @ManyToOne(fetch = javax.persistence.FetchType.LAZY, cascade = javax.persistence.CascadeType.MERGE)
    private NivelFormacion tipoEstudiante;
    
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
