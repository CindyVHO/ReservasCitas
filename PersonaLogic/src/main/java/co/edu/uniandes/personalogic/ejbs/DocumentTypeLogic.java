/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.ejbs;

import co.edu.uniandes.personalogic.converters.DocumentTypeConverter;
import co.edu.uniandes.personalogic.dtos.DocumentTypeDTO;
import co.edu.uniandes.personalogic.entities.DocumentType;
import co.edu.uniandes.personalogic.interfaces.IDocumentTypeLogic;
import co.edu.uniandes.personalogic.persistence.DocumentTypePersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class DocumentTypeLogic implements IDocumentTypeLogic{

    @Inject
    private DocumentTypePersistence persistence;
    
    @Override
    public int countDocumentTypes() {
        return persistence.count();
    }

    @Override
    public DocumentTypeDTO getDocumentTypeById(Long id) {
        return DocumentTypeConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<DocumentTypeDTO> getDocumentTypes() {
        return DocumentTypeConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public DocumentTypeDTO addDocumentType(DocumentTypeDTO dto) {
        DocumentType entity = DocumentTypeConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return DocumentTypeConverter.refEntity2DTO(entity);
    }

    @Override
    public DocumentTypeDTO updateDocumentType(DocumentTypeDTO dto) {
        DocumentType entity = persistence.update(DocumentTypeConverter.basicDTO2Entity(dto));
        return DocumentTypeConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteDocumentType(Long id) {
        persistence.delete(id);
    }

}
