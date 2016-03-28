/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.dtos;

/**
 * Clase que contiene los programas
 * @author Cindy
 */
public class ProgramDTO{
    
    private Long id;
    
    private String nombrePrograma;
    private FacultyDTO facultad;
    private String codigo;


    /** Metodos Get y Set de los atributos de la clase */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public FacultyDTO getFacultad() {
        return facultad;
    }

    public void setFacultad(FacultyDTO facultad) {
        this.facultad = facultad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    } 
}
