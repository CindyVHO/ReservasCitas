/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservascitaslogic.interfaces;

import co.edu.uniandes.reservacitaslogic.dtos.CoordinationDateDTO;
import co.edu.uniandes.reservacitaslogic.entities.CoordinationDate;
import java.util.List;

/**
 * Interfaz para el manejo de la entidad Motivo
 * @author Cindy
 */
public interface ICoordinationDateLogic {
    
    public int countCoordinationDates();
    
    public CoordinationDateDTO getCoordinationDateById(Long id);
    
    public List<CoordinationDateDTO> getCoordinationDates();
    
    public CoordinationDateDTO addCoordinationDate(CoordinationDateDTO CoordinationDate);
    
    public CoordinationDateDTO updateCoordinationDate(CoordinationDateDTO CoordinationDate);
    
    public void deleteCoordinationDate(Long id);
    
}
