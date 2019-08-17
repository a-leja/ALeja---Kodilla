package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksTestSuite {

    @Test
    public void testTasksDequeue() {
        //Given
        Mentor andrewNorman = new Mentor("Andrew", "Norman");
        Mentor richardBrown = new Mentor("Richard", "Brown");

        Task taskOne = new Task(1);
        Task taskTwo = new Task(2);
        Task taskThree = new Task(3);
        Task taskFour = new Task(4);
        Task taskFive = new Task(5);
        Task taskSix = new Task(6);
        Task taskSeven = new Task(7);
        Task taskEight = new Task(8);
        Task taskNine = new Task(9);

        Student adamMills = new Student("Adam", "Mills", richardBrown);
        Student lillyFranz = new Student("Lilly", "Franz", richardBrown);
        Student michaelDunn = new Student("Michael", "Dunn", andrewNorman);
        Student hansBritt = new Student("Hans", "Britt", andrewNorman);
        Student soniaMellow = new Student("Sonia", "Mellow", andrewNorman);

        adamMills.registerObserver(richardBrown);
        lillyFranz.registerObserver(richardBrown);
        michaelDunn.registerObserver(andrewNorman);
        hansBritt.registerObserver(andrewNorman);
        soniaMellow.registerObserver(andrewNorman);

        adamMills.addTask(taskOne);
        adamMills.addTask(taskTwo);
        adamMills.addTask(taskThree);
        lillyFranz.addTask(taskFour);
        michaelDunn.addTask(taskFive);
        hansBritt.addTask(taskSix);
        soniaMellow.addTask(taskSeven);
        soniaMellow.addTask(taskEight);
        soniaMellow.addTask(taskNine);

        //¨When
        int andrewsTasksToReview = andrewNorman.getCounter();
        int richardsTasksToReview = richardBrown.getCounter();
        //Then
        assertEquals(5, andrewsTasksToReview);
        assertEquals(4, richardsTasksToReview);
    }
}
