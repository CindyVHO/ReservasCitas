/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.dtos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO de la entidad Contacto
 * @author Cindy
 */
@XmlRootElement
public class ContactDTO{
    
    /*Id de contacto*/
    private Long id;
    
    /* Nombre de contacto */
    private String nombreContacto;
    
    /* Numero de contacto de la persona que va a tener la cita en caso de que no exista en la BD */
    private String numeroContacto;
    
    /*Metodos GET y SET de los atributos del DTO*/
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}
