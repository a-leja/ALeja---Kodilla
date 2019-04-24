package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private AvailableFlights availableFlights;

    public FlightFinder(AvailableFlights availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flight> searchForAllFlightsFrom(String departureAirport) {
        return availableFlights.getAvailableFlights().stream()
                .filter(flight -> departureAirport.equals(flight.getDepartureAirport())
                        .collect(Collectors.toSet());
    }

    public Set<Flight> searchForAllFlightsTo(String arrivalAirport) {
        return availableFlights.getAvailableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchForAllFlightsFrom(String departureAirport, String arrivalAirport) {
        availableFlights.getAvailableFlights().stream()

    }
}
