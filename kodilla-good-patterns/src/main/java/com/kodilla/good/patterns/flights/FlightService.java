package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    Set<Flight> flights = new HashSet<>();

    public FlightService() {
        flights.add(new Flight("KRK", "WAR"));
        flights.add(new Flight("WRO", "LDZ"));
        flights.add(new Flight("LUB", "GDA"));
        flights.add(new Flight("POZ", "KTW"));
        flights.add(new Flight("WAR", "GDA"));
    }
    public List<Flight> flightsFrom(String airport) {
        return flights.stream()
                .filter(f -> f.getDeparture().equals(airport))
                .collect(Collectors.toList());
    }
    public List<Flight> flightsTo(String airport) {
        return flights.stream()
                .filter(f -> f.getArrival().equals(airport))
                .collect(Collectors.toList());
    }
    public List<Flight> flightsVia(String to, String via) {
        List<Flight> flightsVia = flights.stream()
                .filter(f -> f.getDeparture().equals(via))
                .collect(Collectors.toList());
        List<Flight> flightsTo = flights.stream()
                .filter(f -> f.getArrival().equals(via))
                .filter(f -> f.getDeparture().equals(to))
                .collect(Collectors.toList());
        flightsVia.addAll(flightsTo);
        return flightsVia;
    }
}
