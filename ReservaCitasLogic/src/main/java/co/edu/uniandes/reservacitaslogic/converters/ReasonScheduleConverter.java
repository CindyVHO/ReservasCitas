/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.converters;

import co.edu.uniandes.personalogic.converters.FormationLevelConverter;
import co.edu.uniandes.reservacitaslogic.dtos.ReasonScheduleDTO;
import co.edu.uniandes.reservacitaslogic.entities.ReasonSchedule;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Cindy
 */
public abstract class ReasonScheduleConverter {

    private ReasonScheduleConverter() {
    }
     
    public static ReasonScheduleDTO refEntity2DTO(ReasonSchedule entity) {
        if (entity != null) {
            ReasonScheduleDTO dto = new ReasonScheduleDTO();            
            dto.setId(entity.getId());
            dto.setReason(ReasonConverter.refEntity2DTO(entity.getReason()));
            dto.setFechaInicio(entity.getFechaInicio());
            dto.setFechaFin(entity.getFechaFin());
            dto.setHoraInicio(entity.getHoraInicio());
            dto.setHoraFin(entity.getHoraFin());
            return dto;
        } else {
            return null;
        }
    }

    public static ReasonSchedule refDTO2Entity(ReasonScheduleDTO dto) {
        if (dto != null) {
            ReasonSchedule entity = new ReasonSchedule();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static ReasonScheduleDTO basicEntity2DTO(ReasonSchedule entity) {
        if (entity != null) {
            ReasonScheduleDTO dto = new ReasonScheduleDTO();
            dto.setReason(ReasonConverter.refEntity2DTO(entity.getReason()));
            dto.setFechaFin(entity.getFechaFin());
            dto.setHoraInicio(entity.getHoraInicio());
            dto.setHoraInicio(entity.getHoraInicio());
            dto.setHoraFin(entity.getHoraFin());
            return dto;
        } else {
            return null;
        }
    }

    public static ReasonSchedule basicDTO2Entity(ReasonScheduleDTO dto) {
        if (dto != null) {
            ReasonSchedule entity = new ReasonSchedule();
            entity.setId(dto.getId());
            entity.setReason(ReasonConverter.refDTO2Entity(dto.getReason()));
            entity.setFechaInicio((Timestamp) dto.getFechaInicio());
            entity.setFechaFin((Timestamp) dto.getFechaFin());
            entity.setHoraInicio(dto.getHoraInicio());
            entity.setHoraFin( dto.getHoraFin());
            return entity;
        } else {
            return null;
        }
    }

    public static List<ReasonScheduleDTO> listEntity2DTO(List<ReasonSchedule> entities) {
        List<ReasonScheduleDTO> dtos = new ArrayList<ReasonScheduleDTO>();
        if (entities != null) {
            for (ReasonSchedule entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<ReasonSchedule> listDTO2Entity(List<ReasonScheduleDTO> dtos) {
        List<ReasonSchedule> entities = new ArrayList<ReasonSchedule>();
        if (dtos != null) {
            for (ReasonScheduleDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
    
    public static ReasonScheduleDTO fullEntity2DTO(ReasonSchedule entity) {
        if (entity != null) {
            return basicEntity2DTO(entity);
        } else {
            return null;
        }
    }

    public static ReasonSchedule fullDTO2Entity(ReasonScheduleDTO dto) {
        if (dto != null) {
            return basicDTO2Entity(dto);
        } else {
            return null;
        }
    }
}