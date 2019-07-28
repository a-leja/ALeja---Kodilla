package com.kodilla.good.patterns.challenges.FlightFinder;

public class App {

    public static void main(String[] args) {

        FlightFinder.searchForAllFlightsFrom("BCN").forEach(System.out::println);
        FlightFinder.searchForAllFlightsTo("DUB").forEach(System.out::println);
        FlightFinder.searchForAllFlightsVia("FRA","AMS", "DUB").forEach(System.out::println);
    }
}
