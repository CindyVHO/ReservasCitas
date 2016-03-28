/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.persistence;

import co.edu.uniandes.entitymanager.GeneralPersistence;
import co.edu.uniandes.personalogic.entities.Student;
import javax.ejb.Stateless;

/**
 *
 * @author Cindy
 */
@Stateless
public class StudentPersistence extends GeneralPersistence<Student>{
    
    public StudentPersistence() {
        this.entityClass = Student.class;
    }
    
}
