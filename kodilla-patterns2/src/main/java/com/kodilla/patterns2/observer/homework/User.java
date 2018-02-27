package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class User implements Observable {
    private final List<Observer> observers;
    private final List<String> homework;
    private final String name;

    public User(String name) {
        observers = new ArrayList<>();
        homework = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void sendTask(String task) {
        homework.add(task);
        notifyObserver();
    }

    public List<String> getHomework() {
        return homework;
    }

    public String getName() {
        return name;
    }
}
