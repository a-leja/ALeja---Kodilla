package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        Millenials millenials = new Millenials("Jack");

        //When
        String millenialsChannel = millenials.socialPublisher.share();

        //Then
        Assert.assertEquals("Used channel: Snapchat", millenialsChannel);
    }



    @Test
    public void testIndividualSharingStrategy() {

        //Given
        Millenials millenials = new Millenials("Floren");
        millenials.setSocialPublisher(new TwitterPublisher());

        //When
        String changedChannel = millenials.socialPublisher.share();

        //Then
        Assert.assertEquals("Used channel: Twitter", changedChannel);
    }
}

