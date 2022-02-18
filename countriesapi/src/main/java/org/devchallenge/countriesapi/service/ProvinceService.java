package org.devchallenge.countriesapi.service;

import org.devchallenge.countriesapi.model.Province;
import org.devchallenge.countriesapi.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService {

    @Autowired
    ProvinceRepository stateRepository;

    public ProvinceService() {
    }

    public List<Province> getAllStates(){
        return stateRepository.findAll();
    }

    public Optional<Province> getState(Integer id){
        return stateRepository.findById(id);
    }

    public void addState(Province state){
        stateRepository.save(state);
    }

    public void updateState(Integer id, Province state){
        stateRepository.save(state);
    }
    public void deleteStateByID(int id){
        stateRepository.deleteById(id);
    }
}
