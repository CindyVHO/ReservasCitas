/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.converters;

import co.edu.uniandes.personalogic.dtos.PersonDTO;
import co.edu.uniandes.personalogic.entities.Person;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class PersonConverter {

    private PersonConverter() {
    }

    public static PersonDTO refEntity2DTO(Person entity) {
        if (entity != null) {
            PersonDTO dto = new PersonDTO();
            dto.setId(entity.getId());
            dto.setActivo(entity.isActivo());
            dto.setApellidos(entity.getApellidos());
            dto.setCelular(entity.getCelular());
            dto.setCiudadNacimiento(entity.getCiudadNacimiento());
            dto.setCodigo(entity.getCodigo());
            dto.setCorreo(entity.getCorreo());
            dto.setCorreoAlterno(entity.getCorreoAlterno());
            dto.setDireccionResidencia(entity.getDireccionResidencia());
            dto.setExtension(entity.getExtension());
            dto.setFechaNacimiento(entity.getFechaNacimiento());
            dto.setNombres(entity.getNombres());
            dto.setNumDocumentoIdentidad(entity.getNumDocumentoIdentidad());
            dto.setPais(CountryConverter.refEntity2DTO(entity.getPais()));
            dto.setRol(entity.getRol());
            dto.setTelefono(entity.getTelefono());
            dto.setTipoDocumento(DocumentTypeConverter.refEntity2DTO(entity.getTipoDocumento()));
            return dto;
        } else {
            return null;
        }
    }

    public static Person refDTO2Entity(PersonDTO dto) {
        if (dto != null) {
            Person entity = new Person();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static PersonDTO basicEntity2DTO(Person entity) {
        if (entity != null) {
            PersonDTO dto = new PersonDTO();
            dto.setActivo(entity.isActivo());
            dto.setApellidos(entity.getApellidos());
            dto.setCelular(entity.getCelular());
            dto.setCiudadNacimiento(entity.getCiudadNacimiento());
            dto.setCodigo(entity.getCodigo());
            dto.setCorreo(entity.getCorreo());
            dto.setCorreoAlterno(entity.getCorreoAlterno());
            dto.setDireccionResidencia(entity.getDireccionResidencia());
            dto.setExtension(entity.getExtension());
            dto.setFechaNacimiento(entity.getFechaNacimiento());
            dto.setNombres(entity.getNombres());
            dto.setNumDocumentoIdentidad(entity.getNumDocumentoIdentidad());
            dto.setPais(CountryConverter.refEntity2DTO(entity.getPais()));
            dto.setRol(entity.getRol());
            dto.setTelefono(entity.getTelefono());
            dto.setTipoDocumento(DocumentTypeConverter.refEntity2DTO(entity.getTipoDocumento()));
            return dto;
        } else {
            return null;
        }
    }

    public static Person basicDTO2Entity(PersonDTO dto) {
        if (dto != null) {
            Person entity = new Person();
            entity.setId(dto.getId());
            entity.setActivo(dto.isActivo());
            entity.setApellidos(dto.getApellidos());
            entity.setCelular(dto.getCelular());
            entity.setCiudadNacimiento(dto.getCiudadNacimiento());
            entity.setCodigo(dto.getCodigo());
            entity.setCorreo(dto.getCorreo());
            entity.setCorreoAlterno(dto.getCorreoAlterno());
            entity.setDireccionResidencia(dto.getDireccionResidencia());
            entity.setExtension(dto.getExtension());
            entity.setFechaNacimiento((Timestamp) dto.getFechaNacimiento());
            entity.setNombres(dto.getNombres());
            entity.setNumDocumentoIdentidad(dto.getNumDocumentoIdentidad());
            entity.setPais(CountryConverter.refDTO2Entity(dto.getPais()));
            entity.setRol(dto.getRol());
            entity.setTelefono(dto.getTelefono());
            entity.setTipoDocumento(DocumentTypeConverter.refDTO2Entity(dto.getTipoDocumento()));
            return entity;
        } else {
            return null;
        }
    }

    public static List<PersonDTO> listEntity2DTO(List<Person> entities) {
        List<PersonDTO> dtos = new ArrayList<PersonDTO>();
        if (entities != null) {
            for (Person entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<Person> listDTO2Entity(List<PersonDTO> dtos) {
        List<Person> entities = new ArrayList<Person>();
        if (dtos != null) {
            for (PersonDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }

    public static PersonDTO fullEntity2DTO(Person entity) {
        if (entity != null) {
            return basicEntity2DTO(entity);
        } else {
            return null;
        }
    }

    public static Person fullDTO2Entity(PersonDTO dto) {
        if (dto != null) {
            return basicDTO2Entity(dto);
        } else {
            return null;
        }
    }
}
