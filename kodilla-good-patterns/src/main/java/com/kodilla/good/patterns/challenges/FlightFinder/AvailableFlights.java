package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.Set;

public class AvailableFlights {

    private Set<Flight> availableFlights;

    public AvailableFlights(Set<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flight> getAvailableFlights() {
        return availableFlights;
    }
}
