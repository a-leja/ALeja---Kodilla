package com.kodilla.good.patterns.challenges.FlightFinder;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class FlightFinderTestSuite {
    private static FlightFinder flightFinder;
    private static Set<Flight> allAvailableFlights;

    @BeforeClass
    public static void beforeClass() {
        allAvailableFlights = new HashSet<>();
        allAvailableFlights.add(new Flight("BCN", "KRK"));
        allAvailableFlights.add(new Flight("FRA", "AMS"));
        allAvailableFlights.add(new Flight("AMS", "PMI"));
        allAvailableFlights.add(new Flight("PMI", "DUB"));
    }

    @Test
    public void flightsFromTest() {
        //Given
        //When
        Set<Flight> airport = flightFinder.searchForAllFlightsFrom("BCN");

        //Then
        Assert.assertEquals("KRK",airport);
    }
}