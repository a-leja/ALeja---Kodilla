package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    OrderService orderService;
    OrderRepository orderRepository;

    public OrderProcessor(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(), orderRequest.getOrder());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getOrder());
            return new OrderDTO(orderRequest.getCustomer(), true);
        } else {
            return new OrderDTO(orderRequest.getCustomer(), false);
        }
    }
}
