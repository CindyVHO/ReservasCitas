/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.dtos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO de la entidad Contacto Importante
 * @author Cindy
 */
@XmlRootElement
public class ContactImportantDTO{

    /*Id contacto importante*/
    private Long id;

    /*Contacto al cual se le quiere almacenar su datos*/
    private ContactDTO contacto;
    
    /*Nombre de la empresa del contacto*/
    private String empresa;
    
    /*Cargo de la persona*/
    private String cargo;
    
    /*Telefono de celular de la persona*/
    private String celular;

    /*Metodos GET y SET de los atributos del DTO*/
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContactDTO getContacto() {
        return contacto;
    }

    public void setContacto(ContactDTO contacto) {
        this.contacto = contacto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
    
}
