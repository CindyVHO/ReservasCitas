/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.repositories;

import org.springframework.data.repository.CrudRepository;
import co.edu.uniandes.personalogic.entities.FormationLevel;

/**
 * Clase a través de la cual se realizan las consultas a la entidad
 * @author Cindy
 */
public interface FormationLevelRepository extends CrudRepository<FormationLevel,Long>{
    
}
