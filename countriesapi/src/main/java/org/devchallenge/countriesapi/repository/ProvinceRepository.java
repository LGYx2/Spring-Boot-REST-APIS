package org.devchallenge.countriesapi.repository;

import org.devchallenge.countriesapi.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Integer> {
}
