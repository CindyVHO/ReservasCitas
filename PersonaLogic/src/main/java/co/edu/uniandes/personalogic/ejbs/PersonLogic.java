/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.ejbs;

import co.edu.uniandes.personalogic.converters.PersonConverter;
import co.edu.uniandes.personalogic.dtos.PersonDTO;
import co.edu.uniandes.personalogic.entities.Person;
import co.edu.uniandes.personalogic.interfaces.IPersonLogic;
import co.edu.uniandes.personalogic.persistence.PersonPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class PersonLogic implements IPersonLogic{

    @Inject
    private PersonPersistence persistence;
    
    @Override
    public int countPersons() {
        return persistence.count();
    }

    @Override
    public PersonDTO getPersonById(Long id) {
        return PersonConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<PersonDTO> getPersons() {
        return PersonConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public PersonDTO addPerson(PersonDTO dto) {
        Person entity = PersonConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return PersonConverter.refEntity2DTO(entity);
    }

    @Override
    public PersonDTO updatePerson(PersonDTO dto) {
        Person entity = persistence.update(PersonConverter.basicDTO2Entity(dto));
        return PersonConverter.refEntity2DTO(entity);
    }

    @Override
    public void deletePerson(Long id) {
        persistence.delete(id);
    }

}
