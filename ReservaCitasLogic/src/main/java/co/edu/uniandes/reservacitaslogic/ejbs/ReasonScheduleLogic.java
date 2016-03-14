/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.ejbs;

import co.edu.uniandes.reservacitaslogic.converters.ReasonScheduleConverter;
import co.edu.uniandes.reservacitaslogic.dtos.ReasonScheduleDTO;
import co.edu.uniandes.reservacitaslogic.entities.ReasonSchedule;
import co.edu.uniandes.reservacitaslogic.persistence.ReasonSchedulePersistence;
import co.edu.uniandes.reservascitaslogic.interfaces.IReasonScheduleLogic;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class ReasonScheduleLogic implements IReasonScheduleLogic{

    @Inject
    private ReasonSchedulePersistence persistence;
    
    @Override
    public int countReasonSchedules() {
        return persistence.count();
    }

    @Override
    public ReasonScheduleDTO getReasonScheduleById(Long id) {
        return ReasonScheduleConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<ReasonScheduleDTO> getReasonSchedules() {
        return ReasonScheduleConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public ReasonScheduleDTO addReasonSchedule(ReasonScheduleDTO dto) {
        ReasonSchedule entity = ReasonScheduleConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return ReasonScheduleConverter.refEntity2DTO(entity);
    }

    @Override
    public ReasonScheduleDTO updateReasonSchedule(ReasonScheduleDTO dto) {
        ReasonSchedule entity = persistence.update(ReasonScheduleConverter.basicDTO2Entity(dto));
        return ReasonScheduleConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteReasonSchedule(Long id) {
        persistence.delete(id);
    }
}