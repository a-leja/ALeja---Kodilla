package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String name;
    private BigDecimal population;

    public Country(String name, BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfTheCountry='" + name + '\'' +
                ", noOfPeopleInTheCountry=" + population +
                '}';
    }

    BigDecimal getPeopleQuantity() {
        return population;
    }
}
