package com.kodilla.good.patterns.challenges.Food2Door;

public class Notification implements NotificationService {

    @Override
    public void sendNotification(Customer customer) {
        System.out.println("Dear " + customer.getFirstName() + ", your order is being prepared for the delivery!");
    }
}
