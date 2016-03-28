/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.dtos;

/**
 * Clase que contiene el nivel de formacion de un estudiante
 * @author Cindy
 */
public class FormationLevelDTO{
    
    private Long id;
    
    private String nombre;

    /* Constructor de la clase */
    public FormationLevelDTO() {     }

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
   
}
