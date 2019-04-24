package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest) {

        System.out.println(orderRequest.getCustomer() + ", welcome to HealthyShop! Thank you for choosing our product");
        return true;
    }
}
