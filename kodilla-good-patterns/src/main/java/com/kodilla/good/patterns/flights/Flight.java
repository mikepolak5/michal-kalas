package com.kodilla.good.patterns.flights;

public class Flight {
    private String arrival;
    private String departure;

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (arrival != null ? !arrival.equals(flight.arrival) : flight.arrival != null) return false;
        return departure != null ? departure.equals(flight.departure) : flight.departure == null;
    }

    @Override
    public int hashCode() {
        int result = arrival != null ? arrival.hashCode() : 0;
        result = 31 * result + (departure != null ? departure.hashCode() : 0);
        return result;
    }
}
