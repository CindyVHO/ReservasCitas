/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.converters;

import co.edu.uniandes.reservacitaslogic.dtos.ContactDTO;
import co.edu.uniandes.reservacitaslogic.entities.Contact;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class ContactConverter {

    private ContactConverter() {
    }
     
    public static ContactDTO refEntity2DTO(Contact entity) {
        if (entity != null) {
            ContactDTO dto = new ContactDTO();            
            dto.setId(entity.getId());
            dto.setNombreContacto(entity.getNombreContacto());
            dto.setNumeroContacto(entity.getNumeroContacto());
            return dto;
        } else {
            return null;
        }
    }

    public static Contact refDTO2Entity(ContactDTO dto) {
        if (dto != null) {
            Contact entity = new Contact();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static ContactDTO basicEntity2DTO(Contact entity) {
        if (entity != null) {
            ContactDTO dto = new ContactDTO();
            dto.setNombreContacto(entity.getNombreContacto());
            dto.setNumeroContacto(entity.getNumeroContacto());
            return dto;
        } else {
            return null;
        }
    }

    public static Contact basicDTO2Entity(ContactDTO dto) {
        if (dto != null) {
            Contact entity = new Contact();
            entity.setId(dto.getId());
            entity.setNombreContacto(dto.getNombreContacto()); 
            entity.setNumeroContacto(dto.getNumeroContacto());
            return entity;
        } else {
            return null;
        }
    }

    public static List<ContactDTO> listEntity2DTO(List<Contact> entities) {
        List<ContactDTO> dtos = new ArrayList<ContactDTO>();
        if (entities != null) {
            for (Contact entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<Contact> listDTO2Entity(List<ContactDTO> dtos) {
        List<Contact> entities = new ArrayList<Contact>();
        if (dtos != null) {
            for (ContactDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
}