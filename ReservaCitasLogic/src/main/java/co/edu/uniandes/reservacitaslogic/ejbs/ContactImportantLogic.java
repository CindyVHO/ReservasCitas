/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.ejbs;

import co.edu.uniandes.reservacitaslogic.converters.ContactImportantConverter;
import co.edu.uniandes.reservacitaslogic.dtos.ContactImportantDTO;
import co.edu.uniandes.reservacitaslogic.entities.ContactImportant;
import co.edu.uniandes.reservacitaslogic.persistence.ContactImportantPersistence;
import co.edu.uniandes.reservascitaslogic.interfaces.IContactImportantLogic;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class ContactImportantLogic implements IContactImportantLogic{

    @Inject
    private ContactImportantPersistence persistence;
    
    @Override
    public int countContactImportants() {
        return persistence.count();
    }

    @Override
    public ContactImportantDTO getContactImportantById(Long id) {
        return ContactImportantConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<ContactImportantDTO> getContactImportants() {
        return ContactImportantConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public ContactImportantDTO addContactImportant(ContactImportantDTO dto) {
        ContactImportant entity = ContactImportantConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return ContactImportantConverter.refEntity2DTO(entity);
    }

    @Override
    public ContactImportantDTO updateContactImportant(ContactImportantDTO dto) {
        ContactImportant entity = persistence.update(ContactImportantConverter.basicDTO2Entity(dto));
        return ContactImportantConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteContactImportant(Long id) {
        persistence.delete(id);
    }
}
