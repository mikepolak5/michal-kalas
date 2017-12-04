package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Airports {
    public List<String> departureAirport = new ArrayList<>();
    public List<String> arrivalAirport = new ArrayList<>();
    public List<String> throughAirport = new ArrayList<>();

    public Airports(List<String> departureAirport, List<String> arrivalAirport, List<String> throughAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.throughAirport = throughAirport;
    }

    public List<String> getDepartureAirport() {
        return departureAirport;
    }

    public List<String> getArrivalAirport() {
        return arrivalAirport;
    }

    public List<String> getThroughAirport() {
        return throughAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airports airports = (Airports) o;

        if (departureAirport != null ? !departureAirport.equals(airports.departureAirport) : airports.departureAirport != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(airports.arrivalAirport) : airports.arrivalAirport != null)
            return false;
        return throughAirport != null ? throughAirport.equals(airports.throughAirport) : airports.throughAirport == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (throughAirport != null ? throughAirport.hashCode() : 0);
        return result;
    }
}
