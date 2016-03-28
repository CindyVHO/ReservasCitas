/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.ejbs;

import co.edu.uniandes.personalogic.converters.FacultyConverter;
import co.edu.uniandes.personalogic.dtos.FacultyDTO;
import co.edu.uniandes.personalogic.entities.Faculty;
import co.edu.uniandes.personalogic.interfaces.IFacultyLogic;
import co.edu.uniandes.personalogic.persistence.FacultyPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class FacultyLogic implements IFacultyLogic{

    @Inject
    private FacultyPersistence persistence;
    
    @Override
    public int countFacultys() {
        return persistence.count();
    }

    @Override
    public FacultyDTO getFacultyById(Long id) {
        return FacultyConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<FacultyDTO> getFacultys() {
        return FacultyConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public FacultyDTO addFaculty(FacultyDTO dto) {
        Faculty entity = FacultyConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return FacultyConverter.refEntity2DTO(entity);
    }

    @Override
    public FacultyDTO updateFaculty(FacultyDTO dto) {
        Faculty entity = persistence.update(FacultyConverter.basicDTO2Entity(dto));
        return FacultyConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteFaculty(Long id) {
        persistence.delete(id);
    }

}
