package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent) {
        world.add(continent);
    }


    public void removeContinent(Continent continent) {
        world.remove(continent);
    }


    public BigDecimal getPeopleQuantity() {
        BigDecimal totalNoOfPeople = world.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return getPeopleQuantity();
    }
}