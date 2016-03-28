/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.interfaces;

import co.edu.uniandes.personalogic.dtos.FacultyDTO;
import java.util.List;

/**
 *
 * @author Cindy
 */
public interface IFacultyLogic {
    
    public int countFacultys();
    
    public FacultyDTO getFacultyById(Long id);
    
    public List<FacultyDTO> getFacultys();
    
    public FacultyDTO addFaculty(FacultyDTO Faculty);
    
    public FacultyDTO updateFaculty(FacultyDTO Faculty);
    
    public void deleteFaculty(Long id);
}
