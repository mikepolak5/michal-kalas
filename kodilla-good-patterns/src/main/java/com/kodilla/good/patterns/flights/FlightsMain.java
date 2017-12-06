package com.kodilla.good.patterns.flights;

import java.util.List;

public class FlightsMain {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        List<Flight> lol = flightService.flightsFrom("WAR");
        List<Flight> lol2 = flightService.flightsTo("POZ");
        List<Flight> lol3 = flightService.flightsVia("WAR", "KRK");
        for (int i = 0; i<lol.size(); i++) {
            System.out.print("To: " + lol.get(i).getArrival());
            System.out.println(" From: " + lol.get(i).getDeparture());
        }
        for (int i = 0; i<lol2.size(); i++) {
            System.out.print("To: " + lol2.get(i).getArrival());
            System.out.println(" From: " +lol2.get(i).getDeparture());
        }
        for (int i = 0; i<lol3.size(); i++) {
            System.out.print("To: " + lol3.get(i).getArrival());
            System.out.println(" From: " + lol3.get(i).getDeparture());
        }
    }
}

