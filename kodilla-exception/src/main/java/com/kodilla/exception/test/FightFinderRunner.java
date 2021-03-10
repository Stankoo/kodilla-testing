package com.kodilla.exception.test;

class FlightFinderRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("London", "Berlin");
        Flight flight2 = new Flight("Warsaw", "Madrid");

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e + " Please search for another flight");
        } finally {
            System.out.println("Thanks for using Flight Finder");
        }

        try {
            flightFinder.findFilght(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e + " Please search for another flight");
        } finally {
            System.out.println("Thanks for using Flight Finder");
        }
    }
}
