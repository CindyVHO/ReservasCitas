/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.interfaces;

import co.edu.uniandes.personalogic.dtos.StudentDTO;
import java.util.List;

/**
 *
 * @author Cindy
 */
public interface IStudentLogic {
    
    public int countStudents();
    
    public StudentDTO getStudentById(Long id);
    
    public List<StudentDTO> getStudents();
    
    public StudentDTO addStudent(StudentDTO Student);
    
    public StudentDTO updateStudent(StudentDTO Student);
    
    public void deleteStudent(Long id);
}
