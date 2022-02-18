package org.devchallenge.countriesapi.controller;

import org.devchallenge.countriesapi.model.Country;
import org.devchallenge.countriesapi.repository.CountryRepository;
import org.devchallenge.countriesapi.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    public CountryController() {
    }

    @RequestMapping("/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
    @RequestMapping("/countries/getbyname")
    public List<Country> getAllCountriesByName(){
        return countryService.getAllCountriesByName();
    }
    @RequestMapping("/countries/getbycapitalname")
    public List<Country> getAllCountriesByCapitalName(){
        return countryService.getAllCountriesByCapitalName();
    }
    @RequestMapping("/countries/getbyregion")
    public List<Country> getAllCountriesByRegion(){
        return countryService.getAllCountriesByRegion();
    }
    @RequestMapping("/countries/getbysubregion")
    public List<Country> getAllCountriesBySubRegion(){
        return countryService.getAllCountriesBySubRegion();
    }
    @RequestMapping("/countries/getbyarea")
    public List<Country> getAllCountriesByArea(){
        return countryService.getAllCountriesByArea();
    }
    @RequestMapping("/countries/getbynumberofprovinces")
    public List<Country> getAllCountriesByNumberOfProvinces(){
        return countryService.getAllCountriesByNumberOfProvinces();
    }
    @RequestMapping("/countries/{id}")
    public Optional<Country> getCountry(@PathVariable Integer id){
        return countryService.getCountry(id);
    }

    @RequestMapping(value="/countries",method = RequestMethod.POST)
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }
    @RequestMapping(value="/countries/{id}",method = RequestMethod.PUT)
    public void updateCountry(@RequestBody Country country,@PathVariable Integer id){
        countryService.updateCountry(id,country);
    }

    @RequestMapping(value="/countries",method = RequestMethod.DELETE)
    public void deleteCountryByID(@PathVariable int id){
        countryService.deleteCountryByID(id);
    }
}
