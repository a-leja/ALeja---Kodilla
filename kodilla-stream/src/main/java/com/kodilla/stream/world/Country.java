package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String nameOfTheCountry;
    private BigDecimal noOfPeopleInTheCountry;

    public Country(String nameOfTheCountry, BigDecimal noOfPeopleInTheCountry) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.noOfPeopleInTheCountry = noOfPeopleInTheCountry;
    }

    public String getNameOfTheCountry() {
        return nameOfTheCountry;
    }

    public BigDecimal getNoOfPeopleInTheCountry() {
        return noOfPeopleInTheCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfTheCountry='" + nameOfTheCountry + '\'' +
                ", noOfPeopleInTheCountry=" + noOfPeopleInTheCountry +
                '}';
    }

    BigDecimal getPeopleQuantity() {
        return noOfPeopleInTheCountry;
    }
}
