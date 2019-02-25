package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightFinder {

    Map<String, Boolean> routes = new HashMap<>();

    //adding airports to the map of available airports
    routes.put("KRK", true);
    routes.put("ALC", false);
    routes.put("OPO", true);
    routes.put("LON", false);
    routes.put("NYC", true);
    routes.put("HEL", false);


    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getDepartureAirport()) && findAirport(flight.getArrivalAirport());
    }

    public boolean findAirport(String airport) {
        if (routes.containsKey(airport)) {
            routes.get(airport);
        } else {
            throw new RouteNotFoundException("Given airport does not exist!");
        }
    }
}
