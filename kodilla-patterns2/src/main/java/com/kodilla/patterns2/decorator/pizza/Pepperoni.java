package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Pepperoni extends AbstractPizzaOrderDecorator {

    public Pepperoni(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", pepperoni";
    }
}
