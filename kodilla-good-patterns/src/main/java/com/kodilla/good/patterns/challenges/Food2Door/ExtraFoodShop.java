package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process(Order order) {

        System.out.println("Your order: " + order.getProduct().getName() + " is being processed.");
        return true;
    }
}
