package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int countTasks;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(User user) {
        System.out.println("New task from: " + user.getName() + "\n" + "Number of all tasks to check: " +
                user.getHomework().size());
        countTasks++;
    }

    public String getName() {
        return name;
    }

    public int getCountTasks() {
        return countTasks;
    }
}
