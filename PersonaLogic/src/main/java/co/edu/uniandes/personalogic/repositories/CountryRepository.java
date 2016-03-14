/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.repositories;

import org.springframework.data.repository.CrudRepository;
import co.edu.uniandes.personalogic.entities.Country;

/**
 * Clase que contiene la consultas relacionadas con la entidad
 * @author Cindy
 */
public interface CountryRepository extends CrudRepository<Country,Long>{
    
}
