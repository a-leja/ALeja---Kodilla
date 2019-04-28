package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "Shopping";
    public static final String PAINTINGTASK = "Painting";
    public static final String DRIVINGTASK = "Driving";


    public final Task createTask(final String specificTaskType) {

        switch (specificTaskType) {
            case SHOPPINGTASK:
                return new ShoppingTask("To buy", "water", 2);
            case PAINTINGTASK:
                return new PaintingTask("New painting", "Black", "A Cat");
            case DRIVINGTASK:
                return new DrivingTask("Drive home", "Cracow", "A Car");
            default:
                return null;
        }
    }
}
