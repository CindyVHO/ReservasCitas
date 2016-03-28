/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.ejbs;

import co.edu.uniandes.personalogic.converters.FormationLevelConverter;
import co.edu.uniandes.personalogic.dtos.FormationLevelDTO;
import co.edu.uniandes.personalogic.entities.FormationLevel;
import co.edu.uniandes.personalogic.interfaces.IFormationLevelLogic;
import co.edu.uniandes.personalogic.persistence.FormationLevelPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class FormationLevelLogic implements IFormationLevelLogic{

    @Inject
    private FormationLevelPersistence persistence;
    
    @Override
    public int countFormationLevels() {
        return persistence.count();
    }

    @Override
    public FormationLevelDTO getFormationLevelById(Long id) {
        return FormationLevelConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<FormationLevelDTO> getFormationLevels() {
        return FormationLevelConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public FormationLevelDTO addFormationLevel(FormationLevelDTO dto) {
        FormationLevel entity = FormationLevelConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return FormationLevelConverter.refEntity2DTO(entity);
    }

    @Override
    public FormationLevelDTO updateFormationLevel(FormationLevelDTO dto) {
        FormationLevel entity = persistence.update(FormationLevelConverter.basicDTO2Entity(dto));
        return FormationLevelConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteFormationLevel(Long id) {
        persistence.delete(id);
    }

}
