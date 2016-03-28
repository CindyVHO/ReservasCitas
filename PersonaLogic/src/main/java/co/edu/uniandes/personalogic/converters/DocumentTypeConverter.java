/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.converters;

import co.edu.uniandes.personalogic.dtos.DocumentTypeDTO;
import co.edu.uniandes.personalogic.entities.DocumentType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class DocumentTypeConverter {

    private DocumentTypeConverter() {
    }
     
    public static DocumentTypeDTO refEntity2DTO(DocumentType entity) {
        if (entity != null) {
            DocumentTypeDTO dto = new DocumentTypeDTO();            
            dto.setId(entity.getId());
            dto.setNameDocumentType(entity.getNameDocumentType());
            dto.setSiglaDocumentType(entity.getSiglaDocumentType());
            return dto;
        } else {
            return null;
        }
    }

    public static DocumentType refDTO2Entity(DocumentTypeDTO dto) {
        if (dto != null) {
            DocumentType entity = new DocumentType();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static DocumentTypeDTO basicEntity2DTO(DocumentType entity) {
        if (entity != null) {
            DocumentTypeDTO dto = new DocumentTypeDTO();
            dto.setNameDocumentType(entity.getNameDocumentType());
            dto.setSiglaDocumentType(entity.getSiglaDocumentType());
            return dto;
        } else {
            return null;
        }
    }

    public static DocumentType basicDTO2Entity(DocumentTypeDTO dto) {
        if (dto != null) {
            DocumentType entity = new DocumentType();
            entity.setId(dto.getId());
            entity.setNameDocumentType(dto.getNameDocumentType());
            entity.setSiglaDocumentType(dto.getSiglaDocumentType());
            return entity;
        } else {
            return null;
        }
    }

    public static List<DocumentTypeDTO> listEntity2DTO(List<DocumentType> entities) {
        List<DocumentTypeDTO> dtos = new ArrayList<DocumentTypeDTO>();
        if (entities != null) {
            for (DocumentType entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<DocumentType> listDTO2Entity(List<DocumentTypeDTO> dtos) {
        List<DocumentType> entities = new ArrayList<DocumentType>();
        if (dtos != null) {
            for (DocumentTypeDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
}