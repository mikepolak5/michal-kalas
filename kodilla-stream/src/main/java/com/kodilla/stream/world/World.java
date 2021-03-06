package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class World {
    private List<Continent> continentList = new ArrayList<>();
    BigDecimal peopleQuantity;



    public void addContinent(Continent continent){
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }



}