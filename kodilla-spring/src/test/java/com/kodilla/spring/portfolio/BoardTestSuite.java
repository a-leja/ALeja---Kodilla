package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "call the board meeting";
        String taskInProgress = "prepare the notes";
        String taskDone = "analyze the most recent quarter";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        Assert.assertEquals("call the board meeting", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("prepare the notes", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("analyze the most recent quarter", board.getDoneList().getTasks().get(0));
    }
}
