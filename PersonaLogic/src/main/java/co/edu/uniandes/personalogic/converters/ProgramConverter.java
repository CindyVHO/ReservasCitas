/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.converters;

import co.edu.uniandes.personalogic.dtos.ProgramDTO;
import co.edu.uniandes.personalogic.entities.Program;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Cindy
 */
public abstract class ProgramConverter {

    private ProgramConverter() {
    }
     
    public static ProgramDTO refEntity2DTO(Program entity) {
        if (entity != null) {
            ProgramDTO dto = new ProgramDTO();            
            dto.setId(entity.getId());
            dto.setFacultad(FacultyConverter.refEntity2DTO(entity.getFacultad()));
            dto.setNombrePrograma(entity.getNombrePrograma());
            return dto;
        } else {
            return null;
        }
    }

    public static Program refDTO2Entity(ProgramDTO dto) {
        if (dto != null) {
            Program entity = new Program();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static ProgramDTO basicEntity2DTO(Program entity) {
        if (entity != null) {
            ProgramDTO dto = new ProgramDTO();
            dto.setFacultad(FacultyConverter.refEntity2DTO(entity.getFacultad()));
            dto.setNombrePrograma(entity.getNombrePrograma());
            return dto;
        } else {
            return null;
        }
    }

    public static Program basicDTO2Entity(ProgramDTO dto) {
        if (dto != null) {
            Program entity = new Program();
            entity.setId(dto.getId());
            entity.setFacultad(FacultyConverter.refDTO2Entity(dto.getFacultad()));
            entity.setNombrePrograma(dto.getNombrePrograma());
            return entity;
        } else {
            return null;
        }
    }

    public static List<ProgramDTO> listEntity2DTO(List<Program> entities) {
        List<ProgramDTO> dtos = new ArrayList<ProgramDTO>();
        if (entities != null) {
            for (Program entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<Program> listDTO2Entity(List<ProgramDTO> dtos) {
        List<Program> entities = new ArrayList<Program>();
        if (dtos != null) {
            for (ProgramDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
    
    public static ProgramDTO fullEntity2DTO(Program entity) {
        if (entity != null) {
            return basicEntity2DTO(entity);
        } else {
            return null;
        }
    }

    public static Program fullDTO2Entity(ProgramDTO dto) {
        if (dto != null) {
            return basicDTO2Entity(dto);
        } else {
            return null;
        }
    }
}