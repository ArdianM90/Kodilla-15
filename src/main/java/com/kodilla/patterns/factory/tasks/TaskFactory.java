package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task newTask(final String shapeClass) {
        switch (shapeClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping Task", "Frytki", 1);
            case PAINTING:
                return new PaintingTask("Painting Task", "Czerwony", "Obraz na płótnie");
            case DRIVING:
                return new DrivingTask("Driving Task", "Kraków", "Skoda Octavia");
            default:
                return null;
        }
    }
}
