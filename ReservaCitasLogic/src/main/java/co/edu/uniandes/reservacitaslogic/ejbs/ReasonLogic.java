/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.reservacitaslogic.ejbs;

import co.edu.uniandes.reservacitaslogic.converters.ReasonConverter;
import co.edu.uniandes.reservacitaslogic.dtos.ReasonDTO;
import co.edu.uniandes.reservacitaslogic.entities.Reason;
import co.edu.uniandes.reservacitaslogic.persistence.ReasonPersistence;
import co.edu.uniandes.reservascitaslogic.interfaces.IReasonLogic;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class ReasonLogic implements IReasonLogic{

    @Inject
    private ReasonPersistence persistence;
    
    @Override
    public int countReasons() {
        return persistence.count();
    }

    @Override
    public ReasonDTO getReasonById(Long id) {
        return ReasonConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<ReasonDTO> getReasons() {
        return ReasonConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public ReasonDTO addReason(ReasonDTO dto) {
        Reason entity = ReasonConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return ReasonConverter.refEntity2DTO(entity);
    }

    @Override
    public ReasonDTO updateReason(ReasonDTO dto) {
        Reason entity = persistence.update(ReasonConverter.basicDTO2Entity(dto));
        return ReasonConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteReason(Long id) {
        persistence.delete(id);
    }
}
