package com.kodilla.good.patterns.challenges.FlightFinder;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class FlightFinderTestSuite {
    private AvailableFlights availableFlights;

//    @BeforeClass
//    public static void beforeClass() {
//        Set<Flight> availableFlights = new HashSet<>();
//        availableFlights.add(new Flight("BCN", "KRK"));
//        availableFlights.add(new Flight("FRA", "AMS"));
//        availableFlights.add(new Flight("AMS", "PMI"));
//        availableFlights.add(new Flight("PMI", "DUB"));
//    }

    @Test
    public void flightsFromTest() {
        //Given
        //When
        Set<Flight> airport = FlightFinder.searchForAllFlightsFrom("BCN");
        Set<Flight> result = availableFlights.getAvailableFlights();

        //Then
        Assert.assertEquals(airport, result);
    }
}