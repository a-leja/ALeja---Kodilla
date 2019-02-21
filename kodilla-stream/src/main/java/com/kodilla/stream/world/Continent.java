package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> listOfCountriesOnTheContinent = new ArrayList<>();

    private List<Country> getListOfCountriesOnTheContinent() {
        return new ArrayList<>(listOfCountriesOnTheContinent);
    }

}
