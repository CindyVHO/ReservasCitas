/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.ejbs;

import co.edu.uniandes.personalogic.converters.ProgramConverter;
import co.edu.uniandes.personalogic.dtos.ProgramDTO;
import co.edu.uniandes.personalogic.entities.Program;
import co.edu.uniandes.personalogic.interfaces.IProgramLogic;
import co.edu.uniandes.personalogic.persistence.ProgramPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class ProgramLogic implements IProgramLogic{

    @Inject
    private ProgramPersistence persistence;
    
    @Override
    public int countPrograms() {
        return persistence.count();
    }

    @Override
    public ProgramDTO getProgramById(Long id) {
        return ProgramConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<ProgramDTO> getPrograms() {
        return ProgramConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public ProgramDTO addProgram(ProgramDTO dto) {
        Program entity = ProgramConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return ProgramConverter.refEntity2DTO(entity);
    }

    @Override
    public ProgramDTO updateProgram(ProgramDTO dto) {
        Program entity = persistence.update(ProgramConverter.basicDTO2Entity(dto));
        return ProgramConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteProgram(Long id) {
        persistence.delete(id);
    }

}
