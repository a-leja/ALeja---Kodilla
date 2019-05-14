package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    private TaskListDao taskListDao;
    private static final String LISTNAME = "Done";
    private static final String DESCRIPTION = "All what's been actioned";


    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        String listName = taskList.getListName();

        //When
        List<TaskList> findTaskList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(LISTNAME, listName);

        //CleanUp
//        int id = findTaskList.get(0).getId();
//        taskListDao.deleteById(id);
    }
}
