package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsExceptionRunner {
    public static void main(String[] args) {
        SearchingFlights searchingFlights = new SearchingFlights();
        Flight flight = new Flight("Alaska", "Warsaw");
        try {
            System.out.println(searchingFlights.findFlight(flight));
        } catch (RouteNotFoundException e) {
            System.out.println("Not found");
        }
        System.out.println("Searching for another flights!");
    }
}
