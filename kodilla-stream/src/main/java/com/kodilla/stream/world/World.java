package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World implements Country {

    List<Continent> listOfContinentsinTheWorld = new ArrayList<>();

    public addContinent(Continent continent) {
        return listOfContinentsinTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalNumberOfPeople = listOfContinentsinTheWorld.stream()

        return totalNumberOfPeople;
    }
}
