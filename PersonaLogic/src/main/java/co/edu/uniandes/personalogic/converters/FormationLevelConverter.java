/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.converters;

import co.edu.uniandes.personalogic.dtos.FormationLevelDTO;
import co.edu.uniandes.personalogic.entities.FormationLevel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class FormationLevelConverter {

    private FormationLevelConverter() {
    }
     
    public static FormationLevelDTO refEntity2DTO(FormationLevel entity) {
        if (entity != null) {
            FormationLevelDTO dto = new FormationLevelDTO();            
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());
            return dto;
        } else {
            return null;
        }
    }

    public static FormationLevel refDTO2Entity(FormationLevelDTO dto) {
        if (dto != null) {
            FormationLevel entity = new FormationLevel();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static FormationLevelDTO basicEntity2DTO(FormationLevel entity) {
        if (entity != null) {
            FormationLevelDTO dto = new FormationLevelDTO();
            dto.setNombre(entity.getNombre());
            return dto;
        } else {
            return null;
        }
    }

    public static FormationLevel basicDTO2Entity(FormationLevelDTO dto) {
        if (dto != null) {
            FormationLevel entity = new FormationLevel();
            entity.setId(dto.getId());
            entity.setNombre(dto.getNombre()); 
            return entity;
        } else {
            return null;
        }
    }

    public static List<FormationLevelDTO> listEntity2DTO(List<FormationLevel> entities) {
        List<FormationLevelDTO> dtos = new ArrayList<FormationLevelDTO>();
        if (entities != null) {
            for (FormationLevel entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<FormationLevel> listDTO2Entity(List<FormationLevelDTO> dtos) {
        List<FormationLevel> entities = new ArrayList<FormationLevel>();
        if (dtos != null) {
            for (FormationLevelDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
    
    public static FormationLevelDTO fullEntity2DTO(FormationLevel entity) {
        if (entity != null) {
            return basicEntity2DTO(entity);
        } else {
            return null;
        }
    }

    public static FormationLevel fullDTO2Entity(FormationLevelDTO dto) {
        if (dto != null) {
            return basicDTO2Entity(dto);
        } else {
            return null;
        }
    }
}