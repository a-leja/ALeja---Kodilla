package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


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


        Continent europe = new Continent("Europe");
        europe.addCountry(germany);
        europe.addCountry(spain);

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(USA);
        northAmerica.addCountry(Canada);

        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(Argentina);
        southAmerica.addCountry(Chile);


        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);


        //When
        BigDecimal totalNoOfPeople = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal(18197209), totalNoOfPeople);
    }
}
