/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tabla que contiene los datos de informacion academica del estudiante
 * @author Cindy
 */
@Entity
@Table (name = "informacion_academica")
public class InformacionAcademica implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_informacion_academica")
    private Long id;
    
    /*Columna que almacena los creditos aprobados */
    @Column(name = "creditos_aprobados")
    private Double creditosAprobados;
    
    /*Columna que almacena los creditos aprobados */
    @Column(name = "creditos_cursados")
    private Double creditosCursados;
    
    /*Columna que almacena los creditos semestre actual */
    @Column(name = "creditos_semestre_actual")
    private Double creditosSemestreActual;
    
    /*Columna que almacena el promedio del antepenultimo semestre */
    @Column(name = "promedio_antepenultipo")
    private Double promedioAntepenultipo;
    
    /*Columna que almacena el promedio del penultimo semestre */
    @Column(name = "promedio_penultimo_semestre")
    private Double promedioPenultimo;
    
    /*Columna que almacena el promedio acumulado en general*/
    @Column(name = "promedio_acumulado_total")
    private Double promedioTotal;
    
    /*Columna que almacena el promedio del ultimo semestre */
    @Column(name = "promedio_ultimo_semestre")
    private Double promedioUltimo;
    
    /*Columna que almacena el semestre segun créditos */
    @Column(name = "semestre_segun_creditos")
    private String semestreSegunCreditos;
    
    /*Columna que almacena los creditos de monitorias ISIS */
    @Column(name = "creditos_monitorias_ISIS_este_semestre")
    private Double creditosMonitoriasISISEsteSemestre;

    /* Constructor de la Clase */
    public InformacionAcademica() {     }

    /** Metodos Get y Set de los atributos de la clase */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCreditosAprobados() {
        return creditosAprobados;
    }

    public void setCreditosAprobados(Double creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }

    public Double getCreditosCursados() {
        return creditosCursados;
    }

    public void setCreditosCursados(Double creditosCursados) {
        this.creditosCursados = creditosCursados;
    }

    public Double getCreditosSemestreActual() {
        return creditosSemestreActual;
    }

    public void setCreditosSemestreActual(Double creditosSemestreActual) {
        this.creditosSemestreActual = creditosSemestreActual;
    }

    public Double getPromedioAntepenultipo() {
        return promedioAntepenultipo;
    }

    public void setPromedioAntepenultipo(Double promedioAntepenultipo) {
        this.promedioAntepenultipo = promedioAntepenultipo;
    }

    public Double getPromedioPenultimo() {
        return promedioPenultimo;
    }

    public void setPromedioPenultimo(Double promedioPenultimo) {
        this.promedioPenultimo = promedioPenultimo;
    }

    public Double getPromedioTotal() {
        return promedioTotal;
    }

    public void setPromedioTotal(Double promedioTotal) {
        this.promedioTotal = promedioTotal;
    }

    public Double getPromedioUltimo() {
        return promedioUltimo;
    }

    public void setPromedioUltimo(Double promedioUltimo) {
        this.promedioUltimo = promedioUltimo;
    }

    public String getSemestreSegunCreditos() {
        return semestreSegunCreditos;
    }

    public void setSemestreSegunCreditos(String semestreSegunCreditos) {
        this.semestreSegunCreditos = semestreSegunCreditos;
    }

    public Double getCreditosMonitoriasISISEsteSemestre() {
        return creditosMonitoriasISISEsteSemestre;
    }

    public void setCreditosMonitoriasISISEsteSemestre(Double creditosMonitoriasISISEsteSemestre) {
        this.creditosMonitoriasISISEsteSemestre = creditosMonitoriasISISEsteSemestre;
    }
    
    /*Metodos Extra*/    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionAcademica)) {
            return false;
        }
        InformacionAcademica other = (InformacionAcademica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.uniandes.reservacitaslogic.entities.InformacionAcademica[ id=" + id + " ]";
    }
    
    
}
