package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        BoardConfig lists = new BoardConfig();
        board.toDoList.tasks.add(0, "do laundry");
        board.inProgressList.tasks.add(0, "doing homework");
        board.doneList.tasks.add(0, "walk");


        //When
        boolean toDoExists = context.containsBean("toDo");
        boolean inProgressExists = context.containsBean("inProgress");
        boolean doneExists = context.containsBean("done");

        //Then
        System.out.println("Bean 'toDo' was found in the container." + toDoExists);
        System.out.println("Bean 'inProgress' was found in the container." + inProgressExists);
        System.out.println("Bean 'done' was found in the container." + doneExists);
    }
}
