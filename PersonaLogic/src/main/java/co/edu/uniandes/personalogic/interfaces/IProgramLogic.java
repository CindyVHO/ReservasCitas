/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.interfaces;

import co.edu.uniandes.personalogic.dtos.ProgramDTO;
import java.util.List;

/**
 *
 * @author Cindy
 */
public interface IProgramLogic {
    
    public int countPrograms();
    
    public ProgramDTO getProgramById(Long id);
    
    public List<ProgramDTO> getPrograms();
    
    public ProgramDTO addProgram(ProgramDTO Program);
    
    public ProgramDTO updateProgram(ProgramDTO Program);
    
    public void deleteProgram(Long id);
}
