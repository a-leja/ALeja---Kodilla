package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println("Your order " + orderRequest.getOrder() + " is being processed");
        return true;
    }
}
