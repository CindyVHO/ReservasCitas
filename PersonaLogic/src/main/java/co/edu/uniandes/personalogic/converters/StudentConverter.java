/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.converters;

import co.edu.uniandes.personalogic.dtos.StudentDTO;
import co.edu.uniandes.personalogic.entities.Student;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Cindy
 */
public abstract class StudentConverter {

    private StudentConverter() {
    }
     
    public static StudentDTO refEntity2DTO(Student entity) {
        if (entity != null) {
            StudentDTO dto = new StudentDTO();            
            dto.setId(entity.getId());
            dto.setActivo(entity.getActivo());
            dto.setAvisarEmergenciaApellidos(entity.getAvisarEmergenciaApellidos());
            dto.setAvisarEmergenciaNombres(entity.getAvisarEmergenciaNombres());
            dto.setBanco(entity.getBanco());
            dto.setCuentaBancaria(entity.getCuentaBancaria());
            dto.setDoblePrograma(ProgramConverter.refEntity2DTO(entity.getDoblePrograma()));
            dto.setPersona(PersonConverter.refEntity2DTO(entity.getPersona()));
            dto.setPrograma(ProgramConverter.refEntity2DTO(entity.getPrograma()));
            dto.setTelefonoEmergencia(entity.getTelefonoEmergencia());
            dto.setTipoEstudiante(FormationLevelConverter.refEntity2DTO(entity.getTipoEstudiante()));
            return dto;
        } else {
            return null;
        }
    }

    public static Student refDTO2Entity(StudentDTO dto) {
        if (dto != null) {
            Student entity = new Student();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static StudentDTO basicEntity2DTO(Student entity) {
        if (entity != null) {
            StudentDTO dto = new StudentDTO();
            dto.setActivo(entity.getActivo());
            dto.setAvisarEmergenciaApellidos(entity.getAvisarEmergenciaApellidos());
            dto.setAvisarEmergenciaNombres(entity.getAvisarEmergenciaNombres());
            dto.setBanco(entity.getBanco());
            dto.setCuentaBancaria(entity.getCuentaBancaria());
            dto.setDoblePrograma(ProgramConverter.refEntity2DTO(entity.getDoblePrograma()));
            dto.setPersona(PersonConverter.refEntity2DTO(entity.getPersona()));
            dto.setPrograma(ProgramConverter.refEntity2DTO(entity.getPrograma()));
            dto.setTelefonoEmergencia(entity.getTelefonoEmergencia());
            dto.setTipoEstudiante(FormationLevelConverter.refEntity2DTO(entity.getTipoEstudiante()));
            return dto;
        } else {
            return null;
        }
    }

    public static Student basicDTO2Entity(StudentDTO dto) {
        if (dto != null) {
            Student entity = new Student();
            entity.setId(dto.getId());
            entity.setActivo(dto.getActivo());
            entity.setAvisarEmergenciaApellidos(dto.getAvisarEmergenciaApellidos());
            entity.setAvisarEmergenciaNombres(dto.getAvisarEmergenciaNombres());
            entity.setBanco(dto.getBanco());
            entity.setCuentaBancaria(dto.getCuentaBancaria());
            entity.setDoblePrograma(ProgramConverter.refDTO2Entity(dto.getDoblePrograma()));
            entity.setPersona(PersonConverter.refDTO2Entity(dto.getPersona()));
            entity.setPrograma(ProgramConverter.refDTO2Entity(dto.getPrograma()));
            entity.setTelefonoEmergencia(dto.getTelefonoEmergencia());
            entity.setTipoEstudiante(FormationLevelConverter.refDTO2Entity(dto.getTipoEstudiante()));
            return entity;
        } else {
            return null;
        }
    }

    public static List<StudentDTO> listEntity2DTO(List<Student> entities) {
        List<StudentDTO> dtos = new ArrayList<StudentDTO>();
        if (entities != null) {
            for (Student entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<Student> listDTO2Entity(List<StudentDTO> dtos) {
        List<Student> entities = new ArrayList<Student>();
        if (dtos != null) {
            for (StudentDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
    
    public static StudentDTO fullEntity2DTO(Student entity) {
        if (entity != null) {
            return basicEntity2DTO(entity);
        } else {
            return null;
        }
    }

    public static Student fullDTO2Entity(StudentDTO dto) {
        if (dto != null) {
            return basicDTO2Entity(dto);
        } else {
            return null;
        }
    }
}