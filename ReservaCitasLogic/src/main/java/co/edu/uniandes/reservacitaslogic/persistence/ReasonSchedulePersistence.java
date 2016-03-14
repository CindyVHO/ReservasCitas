/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.persistence;

import co.edu.uniandes.entitymanager.GeneralPersistence;
import co.edu.uniandes.reservacitaslogic.entities.ReasonSchedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 * Persistence para manejar la entidad de Motivo
 * @author Cindy
 */
@Stateless
public class ReasonSchedulePersistence extends GeneralPersistence<ReasonSchedule>{
    
    public ReasonSchedulePersistence() {
        this.entityClass = ReasonSchedule.class;
    }
    
}
