/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.converters;

import co.edu.uniandes.reservacitaslogic.dtos.CoordinationDateDTO;
import co.edu.uniandes.reservacitaslogic.entities.CoordinationDate;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class CoordinationDateConverter {

    private CoordinationDateConverter() {
    }
     
    public static CoordinationDateDTO refEntity2DTO(CoordinationDate entity) {
        if (entity != null) {
            CoordinationDateDTO dto = new CoordinationDateDTO();            
            dto.setId(entity.getId());
            dto.setEstado(entity.getEstado());
            dto.setFecha(entity.getFecha());
            dto.setComentarios(entity.getComentarios());
            dto.setHoraFin(entity.getHoraFin());
            dto.setHoraInicio(entity.getHoraInicio());
            dto.setPrograma(entity.getPrograma());
            return dto;
        } else {
            return null;
        }
    }

    public static CoordinationDate refDTO2Entity(CoordinationDateDTO dto) {
        if (dto != null) {
            CoordinationDate entity = new CoordinationDate();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static CoordinationDateDTO basicEntity2DTO(CoordinationDate entity) {
        if (entity != null) {
            CoordinationDateDTO dto = new CoordinationDateDTO();
            dto.setEstado(entity.getEstado());
            dto.setFecha(entity.getFecha());
            dto.setComentarios(entity.getComentarios());
            dto.setHoraFin(entity.getHoraFin());
            dto.setHoraInicio(entity.getHoraInicio());
            dto.setPrograma(entity.getPrograma());
            return dto;
        } else {
            return null;
        }
    }

    public static CoordinationDate basicDTO2Entity(CoordinationDateDTO dto) {
        if (dto != null) {
            CoordinationDate entity = new CoordinationDate();
            entity.setId(dto.getId());
            entity.setEstado(dto.getEstado());
            entity.setFecha((Date) dto.getFecha());
            entity.setComentarios(dto.getComentarios());
            entity.setHoraFin(dto.getHoraFin());
            entity.setHoraInicio(dto.getHoraInicio());
            entity.setPrograma(dto.getPrograma());
            return entity;
        } else {
            return null;
        }
    }

    public static List<CoordinationDateDTO> listEntity2DTO(List<CoordinationDate> entities) {
        List<CoordinationDateDTO> dtos = new ArrayList<CoordinationDateDTO>();
        if (entities != null) {
            for (CoordinationDate entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<CoordinationDate> listDTO2Entity(List<CoordinationDateDTO> dtos) {
        List<CoordinationDate> entities = new ArrayList<CoordinationDate>();
        if (dtos != null) {
            for (CoordinationDateDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
}