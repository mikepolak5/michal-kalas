package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User robby = new Millenials("robby");
        User matt = new YGeneration("matt");
        User jimmy = new ZGeneration("jimmy");

        //When
        String robbyShare = robby.publish();
        System.out.println("User robby shares: " + robbyShare);
        String mattShare = matt.publish();
        System.out.println("User matt shares: " + mattShare);
        String jimmyShare = jimmy.publish();
        System.out.println("User jimmy shares: " + jimmyShare);

        //Then
        Assert.assertEquals("random message", robbyShare);
        Assert.assertEquals("random photo", mattShare);
        Assert.assertEquals("random tweet", jimmyShare);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User matt = new YGeneration("matt");

        //When
        String mattShare = matt.publish();
        System.out.println("User matt shares: " + mattShare);
        matt.setDefaultShare(new FacebookPublisher());
        mattShare = matt.publish();
        System.out.println("User matt final share: " + mattShare);

        //Then
        Assert.assertEquals("random message", mattShare);
    }
}
