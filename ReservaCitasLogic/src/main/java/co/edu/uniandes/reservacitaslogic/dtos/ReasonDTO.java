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
 * DTO de la entidad Motivo
 * @author Cindy
 */
@XmlRootElement
public class ReasonDTO implements Serializable {

    /*Id del motivo*/
    private Long id;
    
    /* Nombre del motivo */
    private String nombre;
           
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
}
