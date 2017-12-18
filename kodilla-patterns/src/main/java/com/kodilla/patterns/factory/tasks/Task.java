package com.kodilla.patterns.factory.tasks;

import java.util.List;

public interface Task {
    String executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
