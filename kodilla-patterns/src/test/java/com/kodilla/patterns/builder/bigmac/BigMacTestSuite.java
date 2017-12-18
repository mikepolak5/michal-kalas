package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testThisBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .burgers(4)
                .ingredient("onions")
                .ingredient("pickles")
                .ingredient("tomato")
                .roll("plain")
                .sauce("mayo")
                .build();
        System.out.println(bigMac);

        //When
        int numberOfIngredients = bigMac.getIngredients().size();

        //Then
        Assert.assertEquals(3, numberOfIngredients);
    }
}
