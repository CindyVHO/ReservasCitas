/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.ejbs;

import co.edu.uniandes.reservacitaslogic.converters.CoordinationDateConverter;
import co.edu.uniandes.reservacitaslogic.dtos.CoordinationDateDTO;
import co.edu.uniandes.reservacitaslogic.entities.CoordinationDate;
import co.edu.uniandes.reservacitaslogic.persistence.CoordinationDatePersistence;
import co.edu.uniandes.reservascitaslogic.interfaces.ICoordinationDateLogic;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class CoordinationDateLogic implements ICoordinationDateLogic{

    @Inject
    private CoordinationDatePersistence persistence;
    
    @Override
    public int countCoordinationDates() {
        return persistence.count();
    }

    @Override
    public CoordinationDateDTO getCoordinationDateById(Long id) {
        return CoordinationDateConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<CoordinationDateDTO> getCoordinationDates() {
        return CoordinationDateConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public CoordinationDateDTO addCoordinationDate(CoordinationDateDTO dto) {
        CoordinationDate entity = CoordinationDateConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return CoordinationDateConverter.refEntity2DTO(entity);
    }

    @Override
    public CoordinationDateDTO updateCoordinationDate(CoordinationDateDTO dto) {
        CoordinationDate entity = persistence.update(CoordinationDateConverter.basicDTO2Entity(dto));
        return CoordinationDateConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteCoordinationDate(Long id) {
        persistence.delete(id);
    }
}
