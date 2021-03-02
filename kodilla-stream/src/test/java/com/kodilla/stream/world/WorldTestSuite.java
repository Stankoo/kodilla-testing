package com.kodilla.stream.world;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent();
        Country germany = new Country(new BigDecimal("80996685"));
        Country france = new Country(new BigDecimal("66259012"));
        Country unitedKingdom = new Country(new BigDecimal("63742977"));
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(unitedKingdom);

        Continent asia = new Continent();
        Country china = new Country(new BigDecimal("1343239923"));
        Country india = new Country(new BigDecimal("1205073612"));
        Country indonesia = new Country(new BigDecimal("248645008"));
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);

        Continent africa = new Continent();
        Country nigeria = new Country(new BigDecimal("195875237"));
        Country ethiopia = new Country(new BigDecimal("107534882"));
        Country egypt = new Country(new BigDecimal("99375741"));
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("3410743077");
        assertEquals(expectedPeople, totalPeople);
    }
}