/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.dtos;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO de la entidad Horario de los Motivos
 * @author Cindy
 */
@XmlRootElement
public class ReasonScheduleDTO implements Serializable {

    /*Id del motivo*/
    private Long id;
    
    /* Nombre del motivo */
    private ReasonDTO reason;
    
    /*Fecha y hora de inicio de atencion del motivo*/
    private Date fechaHoraInicio;
    
    /*Fecha y hora final de atencion del motivo*/
    private Date fechaHoraFin;
           
    /*Metodos GET y SET de los atributos del DTO*/
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReasonDTO getReason() {
        return reason;
    }

    public void setReason(ReasonDTO reason) {
        this.reason = reason;
    }
    
    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }   
}
