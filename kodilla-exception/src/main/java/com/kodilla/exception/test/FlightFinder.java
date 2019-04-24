package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightFinder {


    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        return findAirport(flight.getDepartureAirport()) && findAirport(flight.getArrivalAirport());
    }

    public boolean findAirport(String airport) throws RouteNotFoundException {

        Map<String, Boolean> routes = new HashMap<>();
        //adding airports to the map of available airports
        routes.put("KRK", true);
        routes.put("ALC", true);
        routes.put("OPO", true);
        routes.put("LON", false);
        routes.put("NYC", true);
        routes.put("HEL", false);


        if (routes.containsKey(airport)) {
            return routes.get(airport);
        } else {
            throw new RouteNotFoundException("Given airport does not exist!");
        }
    }
}
