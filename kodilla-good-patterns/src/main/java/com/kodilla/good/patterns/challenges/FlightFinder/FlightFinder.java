package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private AvailableFlights availableFlights;

    public FlightFinder(AvailableFlights availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flight> searchForAllFlightsFrom(String departureAirport) {
        return availableFlights.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchForAllFlightsTo(String arrivalAirport) {
        return availableFlights.getAvailableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchForAllFlightsVia(String departureAirport, String via, String arrivalAirport) {
        Set<Flight> flightsFrom = new HashSet<>();
        availableFlights.getAvailableFlights().stream()
        .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(via))
//                .collect(Collectors.toCollection(() -> flightsFrom));
                .forEach(flightsFrom::add);
        //        return flightsFrom;

        flightsFrom.stream()
                .filter(flight -> flight.getDepartureAirport().equals(via))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toCollection(() -> searchForAllFlightsVia()));
    }
}
