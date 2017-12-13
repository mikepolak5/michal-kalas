package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier(value = "toDo")
    TaskList toDoList;
    @Autowired
    @Qualifier(value = "inProgress")
    TaskList inProgressList;
    @Autowired
    @Qualifier(value = "done")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList(new ArrayList<>());
    }
    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList(new ArrayList<>());
    }
    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList(new ArrayList<>());
    }

}
