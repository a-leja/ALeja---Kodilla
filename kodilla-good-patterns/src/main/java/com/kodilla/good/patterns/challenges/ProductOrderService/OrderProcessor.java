package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderProcessor {
    NotificationService notificationService;
    OrderService orderService;
    OrderRepository orderRepository;

    public OrderProcessor(NotificationService notificationService, OrderService orderService, OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.ordered(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate());

        if(isOrdered) {
            notificationService.sendNotification(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getOrderDate());
        return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }
}
