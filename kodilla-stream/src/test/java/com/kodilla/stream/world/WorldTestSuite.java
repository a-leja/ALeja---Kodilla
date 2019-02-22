package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given

        //Europe
        Country germany = new Country("Germany", new BigDecimal(83000000));
        Country spain = new Country("Spain", new BigDecimal(46397452));
        //North America
        Country USA = new Country("United States of America", new BigDecimal(326766748));
        Country Canada = new Country("Canada", new BigDecimal(37058856));
        //South America
        Country Argentina = new Country("Argentina", new BigDecimal(44688864));
        Country Chile = new Country("Chile", new BigDecimal(18197209));


        List<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(germany);
        europeanCountries.add(spain);

        List<Country> northAmericanCountries = new ArrayList<>();
        northAmericanCountries.add(USA);
        northAmericanCountries.add(Canada);

        List<Country> southAmericanCountries = new ArrayList<>();
        southAmericanCountries.add(Argentina);
        southAmericanCountries.add(Chile);


        Continent europe = new Continent(europeanCountries, BigDecimal getNoOfPeopleOnTheContinent());
        Continent northAmerica = new Continent(BigDecimal getNoOfPeopleOnTheContinent());
        Continent southAmerica = new Continent(BigDecimal getNoOfPeopleOnTheContinent());


        List<Continent> continentsInTheWorld = new ArrayList<>();
        continentsInTheWorld.add(europe);
        continentsInTheWorld.add(northAmerica);
        continentsInTheWorld.add(southAmerica);


        World world = List<Continent> continentsInTheWorld;

        //When
        BigDecimal totalNoOfPeople = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal(18197209), totalNoOfPeople);
    }
}
