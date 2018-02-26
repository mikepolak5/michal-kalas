package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Salmon extends AbstractPizzaOrderDecorator {

    public Salmon(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", salmon";
    }
}
