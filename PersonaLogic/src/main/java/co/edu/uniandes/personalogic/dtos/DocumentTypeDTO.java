/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.dtos;

/**
 *
 * @author Cindy
 */
public class DocumentTypeDTO{
    
    private Long id;
    
    private String nameDocumentType;
    
    private String siglaDocumentType;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDocumentType() {
        return nameDocumentType;
    }

    public void setNameDocumentType(String nameDocumentType) {
        this.nameDocumentType = nameDocumentType;
    }

    public String getSiglaDocumentType() {
        return siglaDocumentType;
    }

    public void setSiglaDocumentType(String siglaDocumentType) {
        this.siglaDocumentType = siglaDocumentType;
    }
}
