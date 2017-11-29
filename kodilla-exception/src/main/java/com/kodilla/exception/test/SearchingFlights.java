package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlights {
    public void findFlight(Flight flight, String info) throws RouteNotFoundException {
        Map<String, Boolean> searchingFlight = new HashMap<>();
        searchingFlight.put("Alaska", true);
        if (searchingFlight.put("Alaska", false) == false){
            System.out.println("Departure from airport" + flight.getDepartureAirport() + "to " +
                    flight.getArrivalAirport() + " " + info);
        }
        throw new RouteNotFoundException("There's no such airport in our database");
    }
}
