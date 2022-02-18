package org.devchallenge.countriesapi.model;


import javax.persistence.*;

@Entity
@Table(name="province")
public class Province {
    @Id
    private Integer id;
    private String provinceName;

    @ManyToOne
    private Country country;


    public Province() {
    }

    public Province(Integer id, String provinceName, Country country) {
        this.id = id;
        this.provinceName = provinceName;
        this.country=country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
