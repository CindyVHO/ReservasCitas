/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.persistence;

import co.edu.uniandes.entitymanager.GeneralPersistence;
import co.edu.uniandes.reservacitaslogic.entities.ContactImportant;
import javax.ejb.Stateless;

/**
 * Persistence para manejar la entidad de Motivo
 * @author Cindy
 */
@Stateless
public class ContactImportantPersistence extends GeneralPersistence<ContactImportant>{
    
    public ContactImportantPersistence() {
        this.entityClass = ContactImportant.class;
    }
    
}
