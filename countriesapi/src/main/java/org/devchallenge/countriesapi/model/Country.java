package org.devchallenge.countriesapi.model;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String capital;
    private String region;
    private String subRegion;
    private String area;
    private Integer numberOfProvinces;


    public Country() {
    }

    public Country(Integer id, String name, String capital, String region, String subRegion, String area, Integer numberOfProvinces) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subRegion = subRegion;
        this.area = area;
        this.numberOfProvinces = numberOfProvinces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getNumberOfProvinces() {
        return numberOfProvinces;
    }

    public void setNumberOfProvinces(Integer numberOfProvinces) {
        this.numberOfProvinces = numberOfProvinces;
    }


}
