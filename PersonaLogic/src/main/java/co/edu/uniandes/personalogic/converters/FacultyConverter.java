/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.converters;

import co.edu.uniandes.personalogic.dtos.FacultyDTO;
import co.edu.uniandes.personalogic.dtos.ProgramDTO;
import co.edu.uniandes.personalogic.entities.Faculty;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class FacultyConverter {

    private FacultyConverter() {
    }
     
    public static FacultyDTO refEntity2DTO(Faculty entity) {
        if (entity != null) {
            FacultyDTO dto = new FacultyDTO();            
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());
            return dto;
        } else {
            return null;
        }
    }

    public static Faculty refDTO2Entity(FacultyDTO dto) {
        if (dto != null) {
            Faculty entity = new Faculty();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static FacultyDTO basicEntity2DTO(Faculty entity) {
        if (entity != null) {
            FacultyDTO dto = new FacultyDTO();
            dto.setId(entity.getId());
            dto.setNombre(entity.getNombre());
            return dto;
        } else {
            return null;
        }
    }

    public static Faculty basicDTO2Entity(FacultyDTO dto) {
        if (dto != null) {
            Faculty entity = new Faculty();
            entity.setId(dto.getId());
            entity.setNombre(dto.getNombre());
            return entity;
        } else {
            return null;
        }
    }

    public static List<FacultyDTO> listEntity2DTO(List<Faculty> entities) {
        List<FacultyDTO> dtos = new ArrayList<FacultyDTO>();
        if (entities != null) {
            for (Faculty entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<Faculty> listDTO2Entity(List<FacultyDTO> dtos) {
        List<Faculty> entities = new ArrayList<Faculty>();
        if (dtos != null) {
            for (FacultyDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
}