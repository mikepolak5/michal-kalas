package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchingFlights {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> searchingFlight = new HashMap<>();
        searchingFlight.put("Alaska", true);
        searchingFlight.put("Detroit", false);
        searchingFlight.put("New York", true);
        List<Boolean> resultList = searchingFlight.entrySet().stream()
                .filter(e -> e.getKey().equals(flight.getArrivalAirport()))
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
        if (resultList.size() == 0) {
            throw new RouteNotFoundException("There's no such airport in our database");
        } else {
            return resultList.get(0);
        }
    }
}
