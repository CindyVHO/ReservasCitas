/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservascitaslogic.interfaces;

import co.edu.uniandes.reservacitaslogic.dtos.ReasonDTO;
import java.util.List;

/**
 * Interfaz para el manejo de la entidad Motivo
 * @author Cindy
 */
public interface IReasonLogic {
    
    public int countReasons();
    
    public ReasonDTO getReasonById(Long id);
    
    public List<ReasonDTO> getReasons();
    
    public ReasonDTO addReason(ReasonDTO Reason);
    
    public ReasonDTO updateReason(ReasonDTO Reason);
    
    public void deleteReason(Long id);
}
