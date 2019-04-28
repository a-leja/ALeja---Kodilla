package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDTO {
    private Customer customer;
    private boolean isOrdered;

    public OrderDTO(final Customer customer, final boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }

    public Customer getUser() {
        return customer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
