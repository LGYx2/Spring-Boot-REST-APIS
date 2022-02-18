package org.devchallenge.countriesapi.service;


import org.devchallenge.countriesapi.model.Country;
import org.devchallenge.countriesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public CountryService() {
    }

    public List<Country> getAllCountries(){
       return countryRepository.findAll();
    }
    public List<Country> getAllCountriesByName(){
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC,"name"));
    }
    public List<Country> getAllCountriesByCapitalName(){
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC,"capital"));
    }
    public List<Country> getAllCountriesByRegion(){
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC,"region"));
    }
    public List<Country> getAllCountriesBySubRegion(){
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC,"subRegion"));
    }
    public List<Country> getAllCountriesByArea(){
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC,"area"));
    }
    public List<Country> getAllCountriesByNumberOfProvinces(){
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC,"numberOfProvinces"));
    }

    public Optional<Country> getCountry(Integer id){
        return countryRepository.findById(id);
    }

    public void addCountry(Country country){
        countryRepository.save(country);
    }

    public void updateCountry(Integer id,Country country){
        countryRepository.save(country);
    }
    public void deleteCountryByID(int id){
        countryRepository.deleteById(id);
    }

}
