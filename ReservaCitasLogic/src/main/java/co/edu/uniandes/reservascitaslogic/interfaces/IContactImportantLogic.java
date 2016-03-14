/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservascitaslogic.interfaces;

import co.edu.uniandes.reservacitaslogic.dtos.ContactImportantDTO;
import java.util.List;

/**
 * Interfaz para el manejo de la entidad Contacto Importante
 * @author Cindy
 */
public interface IContactImportantLogic {
    
    public int countContactImportants();
    
    public ContactImportantDTO getContactImportantById(Long id);
    
    public List<ContactImportantDTO> getContactImportants();
    
    public ContactImportantDTO addContactImportant(ContactImportantDTO ContactImportant);
    
    public ContactImportantDTO updateContactImportant(ContactImportantDTO ContactImportant);
    
    public void deleteContactImportant(Long id);
}
