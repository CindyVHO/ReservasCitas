/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.interfaces;

import co.edu.uniandes.personalogic.dtos.PersonDTO;
import java.util.List;

/**
 *
 * @author Cindy
 */
public interface IPersonLogic {
    
    public int countPersons();
    
    public PersonDTO getPersonById(Long id);
    
    public List<PersonDTO> getPersons();
    
    public PersonDTO addPerson(PersonDTO Person);
    
    public PersonDTO updatePerson(PersonDTO Person);
    
    public void deletePerson(Long id);
}
