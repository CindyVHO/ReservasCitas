/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Tabla que contiene las Citas con Coordinacion
 * @author Cindy
 */
@Entity
@Table(name = "cita_coordinacion")
public class CoordinationDate implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /** Columna que hace referencia al estado en el cual se encuentra la cita Pendiente/Cumplida/No Cumplida */
    @Column(name = "estado")
    private String estado;
    
    /** Columna que hace referencia la fecha de la cita */
    @Column(name = "fecha_cita")
    private Timestamp fecha;
    
    /** Columna que hace referencia a la hora de inicio de la cita */
    @Column(name = "hora_inicio")
    private Timestamp horaInicio;
    
    /** Columna que hace referencia a la hora fin de la cita */
    @Column(name = "hora_fin")
    private Timestamp horaFin;
    
    /** Columna que hace referencia al motivo de la cita */
    @OneToOne
    @Column(name = "motivo")
    private Reason motivo;
    
    /** Columna que hace referencia al programa al que pertenece el estudiante */
    @Column(name = "programa")
    private String programa;
    
    /** Columna que hace referencia a comentarios que se puedan presentar en el momento de reserva de la cita */
    @Column(name = "comentarios")
    private String comentarios;

    /** Constructor de la clase */
    public CoordinationDate() {
    }
        
    /** Metodos Get y Set de los atributos de la clase */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
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
        if (!(object instanceof CoordinationDate)) {
            return false;
        }
        CoordinationDate other = (CoordinationDate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.reservacitaslogic.entities.CoordinationDate[ id=" + id + " ]";
    }    
}