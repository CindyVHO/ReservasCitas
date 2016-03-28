/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.personalogic.interfaces;

import co.edu.uniandes.personalogic.dtos.CountryDTO;
import java.util.List;

/**
 *
 * @author Cindy
 */
public interface ICountryLogic {
    
    public int countCountrys();
    
    public CountryDTO getCountryById(Long id);
    
    public List<CountryDTO> getCountrys();
    
    public CountryDTO addCountry(CountryDTO Country);
    
    public CountryDTO updateCountry(CountryDTO Country);
    
    public void deleteCountry(Long id);
}
