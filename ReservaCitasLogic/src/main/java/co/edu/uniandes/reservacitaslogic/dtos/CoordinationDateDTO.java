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
 * DTO de la entidad Cita con Coordinacion
 * @author Cindy
 */
@XmlRootElement
public class CoordinationDateDTO implements Serializable {

    /*Id cita con coordinacion*/
    private Long id;
    
    /* Estado en el cual se encuentra la cita Pendiente/Cumplida/No Cumplida */
    private String estado;
    
    /* Fecha de la cita */
    private Date fecha;
    
    /* Hora de inicio de la cita */
    private Date horaInicio;
    
    /* Hora fin de la cita */
    private Date horaFin;
    
    /* Motivo de la cita */
    private ContactImportantDTO motivo;
    
    /* Programa al que pertenece el estudiante */
    private String programa;
    
    /* Comentarios que se puedan presentar en el momento de reserva de la cita */
    private String comentarios;

    /*Metodos GET y SET de los atributos del DTO*/     
   
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
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
        
}