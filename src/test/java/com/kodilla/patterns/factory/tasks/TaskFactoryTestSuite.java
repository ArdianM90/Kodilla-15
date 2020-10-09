package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testTaskShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.newTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals(shopping.getClass(), ShoppingTask.class);
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());
        if (shopping.getClass().equals(ShoppingTask.class)) {
            System.out.println(shopping);
        }
    }


    @Test
    public void testTaskPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.newTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals(painting.getClass(), PaintingTask.class);
        painting.executeTask();
        Assert.assertTrue(painting.isTaskExecuted());
        if (painting.getClass().equals(PaintingTask.class)) {
            System.out.println(painting);
        }
    }

    @Test
    public void testTaskDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.newTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals(driving.getClass(), DrivingTask.class);
        driving.executeTask();
        Assert.assertTrue(driving.isTaskExecuted());
        if (driving.getClass().equals(DrivingTask.class)) {
            System.out.println(driving);
        }
    }
}
