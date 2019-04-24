package com.kodilla.exception.test;


public class App {
    public static void main(String[] args) {

        Flight KrkAlc = new Flight("KRK", "ALC");
        Flight LonNYC = new Flight("LON", "NYC");
        Flight OpoHel = new Flight("OPO", "HEL");
        Flight ZrhJfk = new Flight("ZRH", "JFK");


        FlightFinder flightFinder = new FlightFinder();


        try {
            boolean checkIfAvailable = flightFinder.findFlight(KrkAlc);
            System.out.println("The airport: " + KrkAlc.getArrivalAirport() + (checkIfAvailable ? " is available." : " is not available."));
        } catch (RouteNotFoundException e) {
            System.out.print("There is no connection from " + KrkAlc.getDepartureAirport() + " to " + KrkAlc.getArrivalAirport() + " available.");
        }


        try {
            boolean checkIfAvailable = flightFinder.findFlight(LonNYC);
            System.out.println("The airport: " + LonNYC.getArrivalAirport() + (checkIfAvailable ? " is available." : " is not available."));
        } catch (RouteNotFoundException e) {
            System.out.print("There is no connection from " + LonNYC.getDepartureAirport() + " to " + LonNYC.getArrivalAirport() + " available.");
        }


        try {
            boolean checkIfAvailable = flightFinder.findFlight(OpoHel);
            System.out.println("The airport: " + OpoHel.getArrivalAirport() + (checkIfAvailable ? " is available." : " is not available."));
        } catch (RouteNotFoundException e) {
            System.out.print("There is no connection from " + OpoHel.getDepartureAirport() + " to " + OpoHel.getArrivalAirport() + " available.");
        }

        try {
            boolean checkIfAvailable = flightFinder.findFlight(ZrhJfk);
            System.out.println("The airport: " + ZrhJfk.getArrivalAirport() + (checkIfAvailable ? " is available." : " is not available."));
        } catch (RouteNotFoundException e) {
            System.out.print("There is no connection from " + ZrhJfk.getDepartureAirport() + " to " + ZrhJfk.getArrivalAirport() + " available.");
        }
    }
}
