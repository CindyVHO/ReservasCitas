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

/**
 *
 * @author Cindy
 */
@Entity
public class ReasonSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "id_motivo")
    private Reason reason;
    
    /*Columna que hace referencia a la fecha y hora de inicio de atencion del motivo*/
    @Column (name = "fecha_hora_inicio")
    private Timestamp fechaHoraInicio;
    
    /*Columna que hace referencia a la fecha y hora final de atencion del motivo*/
    @Column (name = "fecha_hora_fin")
    private Timestamp fechaHoraFin;

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

    public Timestamp getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Timestamp fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Timestamp getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Timestamp fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
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
