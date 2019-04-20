package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Customer customer = new Customer("Anthony", "Rimmer", "Tony.Rimmer@gmail.com", "0044123456789");

        Order order = new Order(HealthyShop, 12, "Rice milk");

        return new OrderRequest(customer, order);
    }
}
