package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> arrivalAirports = new HashMap<>();
        arrivalAirports.put("London", true);
        arrivalAirports.put("Wroclaw", true);
        arrivalAirports.put("Berlin", false);
        arrivalAirports.put("Vienna", true);
        arrivalAirports.put("Amsterdam", false);
        arrivalAirports.put("Prague", false);
        arrivalAirports.put("Gdansk", true);
        arrivalAirports.put("Poznan", false);

        if (arrivalAirports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight to " + flight.getArrivalAirport() + ": " + arrivalAirports.get(flight.getArrivalAirport()));
        } else {
            throw new RouteNotFoundException("Flight not found.");
        }
    }
}