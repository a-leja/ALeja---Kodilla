package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();

        //Then
        Assert.assertEquals("To buy", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }


    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();

        //Then
        Assert.assertEquals("New painting", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }


    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();

        //Then
        Assert.assertEquals("Drive home", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
