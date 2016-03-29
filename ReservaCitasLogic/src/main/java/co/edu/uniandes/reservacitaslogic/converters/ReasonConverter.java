/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.converters;

import co.edu.uniandes.reservacitaslogic.dtos.ReasonDTO;
import co.edu.uniandes.reservacitaslogic.entities.Reason;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class ReasonConverter {

    private ReasonConverter() {
    }
     
    public static ReasonDTO refEntity2DTO(Reason entity) {
        if (entity != null) {
            ReasonDTO dto = new ReasonDTO();            
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());
            dto.setColor(entity.getColor());
            return dto;
        } else {
            return null;
        }
    }

    public static Reason refDTO2Entity(ReasonDTO dto) {
        if (dto != null) {
            Reason entity = new Reason();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static ReasonDTO basicEntity2DTO(Reason entity) {
        if (entity != null) {
            ReasonDTO dto = new ReasonDTO();
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());
            dto.setColor(entity.getColor());
            return dto;
        } else {
            return null;
        }
    }

    public static Reason basicDTO2Entity(ReasonDTO dto) {
        if (dto != null) {
            Reason entity = new Reason();
            entity.setId(dto.getId());
            entity.setNombre(dto.getNombre()); 
            entity.setColor(dto.getColor());
            return entity;
        } else {
            return null;
        }
    }

    public static List<ReasonDTO> listEntity2DTO(List<Reason> entities) {
       
        List<ReasonDTO> dtos = new ArrayList<ReasonDTO>();
        if (entities != null) {
            for (Reason entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<Reason> listDTO2Entity(List<ReasonDTO> dtos) {
        List<Reason> entities = new ArrayList<Reason>();
        if (dtos != null) {
            for (ReasonDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
    
    public static ReasonDTO fullEntity2DTO(Reason entity) {
        if (entity != null) {
            return basicEntity2DTO(entity);
        } else {
            return null;
        }
    }

    public static Reason fullDTO2Entity(ReasonDTO dto) {
        if (dto != null) {
            return basicDTO2Entity(dto);
        } else {
            return null;
        }
    }
}