/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.converters;

import co.edu.uniandes.reservacitaslogic.dtos.ContactImportantDTO;
import co.edu.uniandes.reservacitaslogic.entities.ContactImportant;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class ContactImportantConverter {

    private ContactImportantConverter() {
    }
     
    public static ContactImportantDTO refEntity2DTO(ContactImportant entity) {
        if (entity != null) {
            ContactImportantDTO dto = new ContactImportantDTO();            
            dto.setId(entity.getId());
            dto.setCargo(entity.getCargo());
            dto.setCelular(entity.getCelular());
            dto.setEmpresa(entity.getEmpresa());
            dto.setContacto(ContactConverter.refEntity2DTO(entity.getContacto()));
            return dto;
        } else {
            return null;
        }
    }

    public static ContactImportant refDTO2Entity(ContactImportantDTO dto) {
        if (dto != null) {
            ContactImportant entity = new ContactImportant();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static ContactImportantDTO basicEntity2DTO(ContactImportant entity) {
        if (entity != null) {
            ContactImportantDTO dto = new ContactImportantDTO();
            dto.setCargo(entity.getCargo());
            dto.setCelular(entity.getCelular());
            dto.setEmpresa(entity.getEmpresa());
            dto.setContacto(ContactConverter.refEntity2DTO(entity.getContacto()));
            return dto;
        } else {
            return null;
        }
    }

    public static ContactImportant basicDTO2Entity(ContactImportantDTO dto) {
        if (dto != null) {
            ContactImportant entity = new ContactImportant();
            entity.setId(dto.getId());
            entity.setCargo(dto.getCargo());
            entity.setCelular(dto.getCelular());
            entity.setEmpresa(dto.getEmpresa());
            entity.setContacto(ContactConverter.refDTO2Entity(dto.getContacto()));
            return entity;
        } else {
            return null;
        }
    }

    public static List<ContactImportantDTO> listEntity2DTO(List<ContactImportant> entities) {
        List<ContactImportantDTO> dtos = new ArrayList<ContactImportantDTO>();
        if (entities != null) {
            for (ContactImportant entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<ContactImportant> listDTO2Entity(List<ContactImportantDTO> dtos) {
        List<ContactImportant> entities = new ArrayList<ContactImportant>();
        if (dtos != null) {
            for (ContactImportantDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
}