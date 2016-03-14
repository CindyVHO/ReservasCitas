/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.ejbs;

import co.edu.uniandes.reservacitaslogic.converters.ContactConverter;
import co.edu.uniandes.reservacitaslogic.dtos.ContactDTO;
import co.edu.uniandes.reservacitaslogic.entities.Contact;
import co.edu.uniandes.reservacitaslogic.persistence.ContactPersistence;
import co.edu.uniandes.reservascitaslogic.interfaces.IContactLogic;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class ContactLogic implements IContactLogic{

    @Inject
    private ContactPersistence persistence;
    
    @Override
    public int countContacts() {
        return persistence.count();
    }

    @Override
    public ContactDTO getContactById(Long id) {
        return ContactConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<ContactDTO> getContacts() {
        return ContactConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public ContactDTO addContact(ContactDTO dto) {
        Contact entity = ContactConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return ContactConverter.refEntity2DTO(entity);
    }

    @Override
    public ContactDTO updateContact(ContactDTO dto) {
        Contact entity = persistence.update(ContactConverter.basicDTO2Entity(dto));
        return ContactConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteContact(Long id) {
        persistence.delete(id);
    }
}
