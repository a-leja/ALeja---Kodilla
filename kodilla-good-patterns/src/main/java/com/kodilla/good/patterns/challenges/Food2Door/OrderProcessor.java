package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    private OrderRepository orderRepository;


    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();


}
