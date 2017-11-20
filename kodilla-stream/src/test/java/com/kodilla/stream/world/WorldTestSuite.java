package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        List<World> peopleQuantity = new ArrayList<>();
        peopleQuantity.add()

        Country croatia = new Country("Croatia", new BigDecimal("11000000"));
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("30000000"));
        Country russia = new Country("Russia", new BigDecimal("120000000"));
        Country uk = new Country("United Kingdom", new BigDecimal("65000000"));
        Country egypt = new Country("Egypt", new BigDecimal("25000000"));
        Country cameroon = new Country("Cameroon", new BigDecimal("13000000"));
        Country argentina = new Country("Argentina", new BigDecimal("9000000"));
        Country brasil = new Country("Brasil", new BigDecimal("90000000"));
        Country usa = new Country("USA", new BigDecimal("875000000"));
        Country canada = new Country("Canada", new BigDecimal("215000000"));
        Country australia = new Country("Australia", new BigDecimal("25000000"));
        Country newZealand = new Country("New Zealand", new BigDecimal("4000000"));
        Country china = new Country("China", new BigDecimal("3100000000"));
        Country japan = new Country("Japan", new BigDecimal("17000000"));


        Continent europe = new Continent();
        Continent africa = new Continent();
        Continent asia = new Continent();
        Continent oceania = new Continent();
        Continent southAmerica = new Continent();
        Continent northAmerica = new Continent();
        europe.addCountry(croatia);
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(russia);
        europe.addCountry(uk);
        africa.addCountry(egypt);
        africa.addCountry(cameroon);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brasil);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        oceania.addCountry(australia);
        oceania.addCountry(newZealand);
        asia.addCountry(china);
        asia.addCountry(japan);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(oceania);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);

        List<World> continentList = new ArrayList<>();
        continentList.add(world.addContinent(europe));

        BigDecimal people = continentList.stream()
                .map(continent -> getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
