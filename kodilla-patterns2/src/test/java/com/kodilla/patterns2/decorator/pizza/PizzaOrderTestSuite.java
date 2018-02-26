package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void BasicPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void BasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getIngredients());

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals("Your pizza: mozarella, tomato sauce", ingredients);
    }

    @Test
    public void PizzaWithHamTomatoOlivesOnionGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Ham(theOrder);
        theOrder = new Tomato(theOrder);
        theOrder = new Olives(theOrder);
        theOrder = new Onion(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void PizzaWithHamTomatoOlivesOnionGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Ham(theOrder);
        theOrder = new Tomato(theOrder);
        theOrder = new Olives(theOrder);
        theOrder = new Onion(theOrder);
        System.out.println(theOrder.getIngredients());

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals("Your pizza: mozarella, tomato sauce, ham, tomato, olives, onion", ingredients);
    }
}
