package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING  = "DRIVING TASK";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Groceries", "butter", 2);
            case PAINTING:
                return new PaintingTask("Painting", "blue", "Living Room");
            case DRIVING:
                return new DrivingTask("Driving", "Post Office", "car");
                default:
                    return null;
        }
    }
}
