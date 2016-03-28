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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Cindy
 */
@Entity
@Table(name = "reason_schedule")
public class ReasonSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /*Columna que hace referencia al motivo al cual se le especifica el horario*/
    @ManyToOne
    private Reason reason;
    
    /*Columna que hace referencia a la fecha y hora de inicio de atencion del motivo*/
    @Column (name = "fecha_inicio")
    private Timestamp fechaInicio;
    
    /*Columna que hace referencia a la fecha y hora de inicio de atencion del motivo*/
    @Column (name = "fecha_fin")
    private Timestamp fechaFin;
    
    /*Columna que hace referencia a la fecha y hora final de atencion del motivo*/
    @Column (name = "hora_inicio")
    private String horaInicio;
    
    /*Columna que hace referencia a la fecha y hora final de atencion del motivo*/
    @Column (name = "hora_fin")
    private String horaFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
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
        if (!(object instanceof ReasonSchedule)) {
            return false;
        }
        ReasonSchedule other = (ReasonSchedule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.reservacitaslogic.entities.ReasonSchedule[ id=" + id + " ]";
    }
    
}
