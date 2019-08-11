package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Observable {
    private final String firstName;
    private final String lastName;
    private Deque<Task> tasks;
    private final Mentor mentor;
    private List<Observer> observers;

    public Student(String firstName, String lastName, Mentor mentor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mentor = mentor;
        this.tasks = new ArrayDeque<>();
        this.observers = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public Deque<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task no. " + task.getTaskNo() + " has been submitted by " + firstName + " " + lastName + " ");
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
            for (Observer observer : observers) {
                observer.notify(this);
            }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
