/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.converters;

import co.edu.uniandes.personalogic.dtos.CountryDTO;
import co.edu.uniandes.personalogic.entities.Country;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cindy
 */
public abstract class CountryConverter {

    private CountryConverter() {
    }
     
    public static CountryDTO refEntity2DTO(Country entity) {
        if (entity != null) {
            CountryDTO dto = new CountryDTO();            
            dto.setId(entity.getId());
            dto.setNameCountry(entity.getNombrePais());
            return dto;
        } else {
            return null;
        }
    }

    public static Country refDTO2Entity(CountryDTO dto) {
        if (dto != null) {
            Country entity = new Country();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    private static CountryDTO basicEntity2DTO(Country entity) {
        if (entity != null) {
            CountryDTO dto = new CountryDTO();
            dto.setNameCountry(entity.getNombrePais());
            return dto;
        } else {
            return null;
        }
    }

    public static Country basicDTO2Entity(CountryDTO dto) {
        if (dto != null) {
            Country entity = new Country();
            entity.setId(dto.getId());
            entity.setNombrePais(dto.getNameCountry());
            return entity;
        } else {
            return null;
        }
    }

    public static List<CountryDTO> listEntity2DTO(List<Country> entities) {
        List<CountryDTO> dtos = new ArrayList<CountryDTO>();
        if (entities != null) {
            for (Country entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<Country> listDTO2Entity(List<CountryDTO> dtos) {
        List<Country> entities = new ArrayList<Country>();
        if (dtos != null) {
            for (CountryDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }  
}