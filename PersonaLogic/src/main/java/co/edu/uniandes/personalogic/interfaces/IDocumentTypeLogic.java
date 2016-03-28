/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.interfaces;

import co.edu.uniandes.personalogic.dtos.DocumentTypeDTO;
import java.util.List;

/**
 *
 * @author Cindy
 */
public interface IDocumentTypeLogic {
    
    public int countDocumentTypes();
    
    public DocumentTypeDTO getDocumentTypeById(Long id);
    
    public List<DocumentTypeDTO> getDocumentTypes();
    
    public DocumentTypeDTO addDocumentType(DocumentTypeDTO DocumentType);
    
    public DocumentTypeDTO updateDocumentType(DocumentTypeDTO DocumentType);
    
    public void deleteDocumentType(Long id);
}
