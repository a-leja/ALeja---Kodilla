package com.kodilla.good.patterns.challenges.ProductOrderService;

public class ProductOrderService {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new Notification(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(orderRequest);
    }
}
