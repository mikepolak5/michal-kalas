/*
package com.kodilla.good.patterns.flights;

import java.util.List;

public class TupleFlights<D, A, T> {
    public D departureAirport;
    public A arrivalAirport;
    public T through;

    public TupleFlights(D departureAirport, A arrivalAirport, T through) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.through = through;
    }

    public D getDepartureAirport() {
        return departureAirport;
    }

    public A getArrivalAirport() {
        return arrivalAirport;
    }

    public T getThrough() {
        return through;
    }
    public List<TupleFlights<String, String, String>> listOfAirports() {
        List<TupleFlights<String, String, String>> airportList;
        for (TupleFlights<String, String, String> tpl: airportList) {
            tpl.arrivalAirport.

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TupleFlights<?, ?, ?> that = (TupleFlights<?, ?, ?>) o;

        if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport != null)
            return false;
        return through != null ? through.equals(that.through) : that.through == null;
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (through != null ? through.hashCode() : 0);
        return result;
    }
}
*/
