package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String firstName;
    private final String lastName;
    private int counter;

    public Mentor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void notify(Student student) {
        String taskOrTasks = "";
        int noOfTask = student.getTasks().size();
        taskOrTasks = (noOfTask < 2) ? "task" : "tasks";
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " has " + counter + " new " + taskOrTasks + "!");
        counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCounter() {
        return counter;
    }
}
