package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2Door {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();


        orderRequestRetriever.processOrder(orderRequest);
    }
}
