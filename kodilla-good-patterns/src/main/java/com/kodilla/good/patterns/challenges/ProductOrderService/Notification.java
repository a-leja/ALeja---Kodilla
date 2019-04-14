package com.kodilla.good.patterns.challenges.ProductOrderService;

public class Notification implements NotificationService {

    @Override
    public void sendNotification(User user) {
        System.out.println("Dear " + user.getUserName() + ", your order is confirmed!");
    }
}
