package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String nameOfTheContinent;
    private BigDecimal noOfPeopleOnTheContinent;
    private List<Country> listOfTheCountriesOnTheContinent = new ArrayList<>();


    public Continent(String nameOfTheContinent, BigDecimal noOfPeopleOnTheContinent) {
        this.nameOfTheContinent = nameOfTheContinent;
        this.noOfPeopleOnTheContinent = noOfPeopleOnTheContinent;
    }

    public String getNameOfTheContinent() {
        return nameOfTheContinent;
    }

    public BigDecimal getNoOfPeopleOnTheContinent() {
        return noOfPeopleOnTheContinent;
    }

    public List<Country> getListOfCountriesOnTheContinent() {
        return new ArrayList<>(listOfTheCountriesOnTheContinent);
    }

    public void addCountry(Country country) {
        listOfTheCountriesOnTheContinent.add(country);
    }

    public void removeCountry(Country country) {
        listOfTheCountriesOnTheContinent.remove(country);
    }

}
