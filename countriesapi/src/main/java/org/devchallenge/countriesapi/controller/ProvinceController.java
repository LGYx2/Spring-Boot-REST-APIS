package org.devchallenge.countriesapi.controller;

import org.devchallenge.countriesapi.model.Province;
import org.devchallenge.countriesapi.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    public ProvinceController() {
    }

    @RequestMapping("/provinces")
    public List<Province> getAllCountries(){
        return provinceService.getAllStates();
    }
    @RequestMapping("/provinces/{id}")
    public Optional<Province> getCountry(@PathVariable Integer id){
        return provinceService.getState(id);
    }

    @RequestMapping(value="/provinces",method = RequestMethod.POST)
    public void addCountry(@RequestBody Province state){
        provinceService.addState(state);
    }
    @RequestMapping(value="/provinces",method = RequestMethod.PUT)
    public void updateCountry(@RequestBody Province state,@PathVariable Integer id){
        provinceService.updateState(id,state);
    }

    @RequestMapping(value="/provinces",method = RequestMethod.DELETE)
    public void deleteCountryByID(@PathVariable int id){
        provinceService.deleteStateByID(id);
    }

}
