package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals(shopping.isTaskExecuted(), true);
        Assert.assertEquals("Groceries", shopping.getTaskName());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals(painting.isTaskExecuted(), true);
        Assert.assertEquals("Painting", painting.getTaskName());
    }
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals(driving.isTaskExecuted(), true);
        Assert.assertEquals("Driving", driving.getTaskName());
    }
}
