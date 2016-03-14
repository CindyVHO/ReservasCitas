/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.dtos;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO de la entidad Motivo
 * @author Cindy
 */
public class ReasonDTO implements Serializable {

    /*Id del motivo*/
    private Long id;
    
    /* Nombre del motivo */
    private String nombre;
    
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
