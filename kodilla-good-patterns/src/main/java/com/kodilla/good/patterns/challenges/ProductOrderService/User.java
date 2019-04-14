package com.kodilla.good.patterns.challenges.ProductOrderService;

public class User {

    private String userName;
    private String firstName;
    private String email;

    public User(final String userName, final String firstName, final String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.email = email;
    }


    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
