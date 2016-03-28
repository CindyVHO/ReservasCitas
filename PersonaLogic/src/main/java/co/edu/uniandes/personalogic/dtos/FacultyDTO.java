/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.dtos;

import java.util.Collection;

/**
 * Tabla que almacena la facultad a la que pertenece un Programa
 * @author Cindy
 */
public class FacultyDTO {
    
    private Long id;
    private String nombre;
    private Collection<ProgramDTO> programas;
    
    /** Metodos Get y Set de los atributos de la clase */    
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

    public Collection<ProgramDTO> getProgramas() {
        return programas;
    }

    public void setProgramas(Collection<ProgramDTO> programas) {
        this.programas = programas;
    }
    
}
