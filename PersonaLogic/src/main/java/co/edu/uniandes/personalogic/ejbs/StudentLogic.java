/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.ejbs;

import co.edu.uniandes.personalogic.converters.StudentConverter;
import co.edu.uniandes.personalogic.dtos.StudentDTO;
import co.edu.uniandes.personalogic.entities.Student;
import co.edu.uniandes.personalogic.interfaces.IStudentLogic;
import co.edu.uniandes.personalogic.persistence.StudentPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class StudentLogic implements IStudentLogic{

    @Inject
    private StudentPersistence persistence;
    
    @Override
    public int countStudents() {
        return persistence.count();
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        return StudentConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<StudentDTO> getStudents() {
        return StudentConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public StudentDTO addStudent(StudentDTO dto) {
        Student entity = StudentConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return StudentConverter.refEntity2DTO(entity);
    }

    @Override
    public StudentDTO updateStudent(StudentDTO dto) {
        Student entity = persistence.update(StudentConverter.basicDTO2Entity(dto));
        return StudentConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteStudent(Long id) {
        persistence.delete(id);
    }

}
