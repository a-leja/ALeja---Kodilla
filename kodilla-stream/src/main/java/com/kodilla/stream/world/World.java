package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<Continent> listOfTheContinentsInTheWorld = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfTheContinentsInTheWorld.add(continent);
    }


    public void removeContinent(Continent continent) {
        listOfTheContinentsInTheWorld.remove(continent);
    }


    public BigDecimal getPeopleQuantity() {
        BigDecimal totalNoOfPeople = listOfTheContinentsInTheWorld.stream()
                .flatMap(continent -> continent.getListOfCountriesOnTheContinent().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return getPeopleQuantity();
    }
}