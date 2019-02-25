package com.kodilla.exception.test;


public class App {
    public static void main(String[] args) {

        Flight KrkAlc = new Flight("KRK", "ALC");
        Flight LonNYC = new Flight("LON", "NYC");
        Flight OpoHel = new Flight("OPO", "HEL");


        FlightFinder flightFinder = new FlightFinder();


        try {
            flightFinder.findFlight(KrkAlc);
        } catch (RouteNotFoundException e) {
            System.out.print("There is no connection from " + KrkAlc.getDepartureAirport() + " to " + KrkAlc.getArrivalAirport() + " available");
        }


        try {
            flightFinder.findFlight(LonNYC);
        } catch (RouteNotFoundException e) {
            System.out.print("There is no connection from " + LonNYC.getDepartureAirport() + " to " + LonNYC.getArrivalAirport() + " available");
        }


        try {
            flightFinder.findFlight(OpoHel);
        } catch (RouteNotFoundException e) {
            System.out.print("There is no connection from " + OpoHel.getDepartureAirport() + " to " + OpoHel.getArrivalAirport() + " available");
        }
    }
}
