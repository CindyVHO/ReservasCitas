/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.interfaces;

import co.edu.uniandes.personalogic.dtos.FormationLevelDTO;
import java.util.List;

/**
 *
 * @author Cindy
 */
public interface IFormationLevelLogic {
    
    public int countFormationLevels();
    
    public FormationLevelDTO getFormationLevelById(Long id);
    
    public List<FormationLevelDTO> getFormationLevels();
    
    public FormationLevelDTO addFormationLevel(FormationLevelDTO FormationLevel);
    
    public FormationLevelDTO updateFormationLevel(FormationLevelDTO FormationLevel);
    
    public void deleteFormationLevel(Long id);
}
