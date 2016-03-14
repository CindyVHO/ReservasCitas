/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservascitaslogic.interfaces;

import co.edu.uniandes.reservacitaslogic.dtos.ReasonScheduleDTO;
import java.util.List;

/**
 * Interfaz para el manejo de la entidad los Horarios del Motivo
 * @author Cindy
 */
public interface IReasonScheduleLogic {
    
    public int countReasonSchedules();
    
    public ReasonScheduleDTO getReasonScheduleById(Long id);
    
    public List<ReasonScheduleDTO> getReasonSchedules();
    
    public ReasonScheduleDTO addReasonSchedule(ReasonScheduleDTO ReasonSchedule);
    
    public ReasonScheduleDTO updateReasonSchedule(ReasonScheduleDTO ReasonSchedule);
    
    public void deleteReasonSchedule(Long id);
}
