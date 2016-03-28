/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservascitaslogic.interfaces;

import co.edu.uniandes.reservacitaslogic.dtos.ContactDTO;
import java.util.List;

/**
 * Interfaz para el manejo de la entidad Contacto
 * @author Cindy
 */
public interface IContactLogic {
    
    public int countContacts();
    
    public ContactDTO getContactById(Long id);
    
    public List<ContactDTO> getContacts();
    
    public ContactDTO addContact(ContactDTO Contact);
    
    public ContactDTO updateContact(ContactDTO Contact);
    
    public void deleteContact(Long id);
}
