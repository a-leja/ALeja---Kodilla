package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.Set;

public class AvailableFlights {

    private Set<Flight> allAvailableFlights;

    public AvailableFlights(Set<Flight> allAvailableFlights) {
        this.allAvailableFlights = allAvailableFlights;
    }

    public Set<Flight> getAvailableFlights() {
        return allAvailableFlights;
    }
}
