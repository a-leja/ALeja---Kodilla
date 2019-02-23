package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private List<Country> countries = new ArrayList<>();


    public Continent(String name) {
        this.name = name;
    }

    public String getNameOfTheContinent() {
        return name;
    }


    public List<Country> getListOfCountries() {
        return new ArrayList<>(countries);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void removeCountry(Country country) {
        countries.remove(country);
    }

}
