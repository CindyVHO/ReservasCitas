/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.ejbs;

import co.edu.uniandes.personalogic.converters.CountryConverter;
import co.edu.uniandes.personalogic.dtos.CountryDTO;
import co.edu.uniandes.personalogic.entities.Country;
import co.edu.uniandes.personalogic.interfaces.ICountryLogic;
import co.edu.uniandes.personalogic.persistence.CountryPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * EJB usada para lo referente a Motivos
 * @author Cindy
 */
@Stateless
public class CountryLogic implements ICountryLogic{

    @Inject
    private CountryPersistence persistence;
    
    @Override
    public int countCountrys() {
        return persistence.count();
    }

    @Override
    public CountryDTO getCountryById(Long id) {
        return CountryConverter.refEntity2DTO(persistence.find(id));
    }

    @Override
    public List<CountryDTO> getCountrys() {
        return CountryConverter.listEntity2DTO(persistence.findAll());
    }

    @Override
    public CountryDTO addCountry(CountryDTO dto) {
        Country entity = CountryConverter.basicDTO2Entity(dto);
        persistence.create(entity);
        return CountryConverter.refEntity2DTO(entity);
    }

    @Override
    public CountryDTO updateCountry(CountryDTO dto) {
        Country entity = persistence.update(CountryConverter.basicDTO2Entity(dto));
        return CountryConverter.refEntity2DTO(entity);
    }

    @Override
    public void deleteCountry(Long id) {
        persistence.delete(id);
    }

}
