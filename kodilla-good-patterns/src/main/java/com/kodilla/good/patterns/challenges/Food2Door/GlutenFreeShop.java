package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println("Thank you " + orderRequest.getCustomer() + " for ordering " + orderRequest.getOrder() + ". We would appreciate your feedback on it!");
        return true;
    }
}
