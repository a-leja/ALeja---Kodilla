package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheese extends AbstractPizzaOrderDecorator {

    public AdditionalCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", double cheese option";
    }
}
