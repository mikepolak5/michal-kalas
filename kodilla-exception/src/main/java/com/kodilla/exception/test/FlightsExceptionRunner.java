package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsExceptionRunner {
    public static void main(String[] args) {
        SearchingFlights searchingFlights = new SearchingFlights();
        Flight flight = new Flight("Alaska", "Detroit");
        try {
            searchingFlights.findFlight(flight, "Alaska");
        } catch (RouteNotFoundException e) {
            System.out.println("Not found");
        }
        System.out.println("Searching for another flights!");
    }
}
