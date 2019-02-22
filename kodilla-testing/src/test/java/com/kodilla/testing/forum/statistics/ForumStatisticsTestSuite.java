package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {
    Statistics statisticsMock = mock(Statistics.class);
    private static int counter = 0;

    @Before
    public void before() {
        counter++;
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }


    //case: number of posts = 0
    @Test
    public void testCalcWhenNumberOfPostsEqualsZero() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getAverageNumberOfPosts(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfComments(), 0.01);
    }

    //Number of post = 1000
    @Test
    public void testCalcWhenNumberOfPostsEqualsOneThousand() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getNumberOfPosts());
    }

    //Number of comments = 0
    @Test
    public void testCalcWhenNumberOfCommentsEqualsZero() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, ForumStatistics.numberOfComments());
        assertEquals(0, ForumStatistics.averageNumberOfCommentsPerPost());
    }


    //Number of users = 0
    @Test
    public void testCalcWhenNumberOfUsersEqualsZero() {
        //Given
        List<String> userNames = new ArrayList<>();

        //When
        when(statisticsMock.usersNames()).thenReturn(userNames);
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, ForumStatistics.numberOfUsers());
    }

    //Number of users = 100
    @Test
    public void testCalcWhenNumberOfUsersEqualsOnaHundred() {
        //Given
        List<String> userNames = new ArrayList<>();
        for (int i; i <= 100; i++) {
            userNames.add("sampleName");
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(100);
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, ForumStatistics.numberOfUsers());
    }

    //Number of comments > number of posts
    @Test
    public void testCalcWhenNumberOfCommentsGreaterThanNumberOfPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, ForumStatistics.numberOfComments());
        assertEquals(1, ForumStatistics.numberOfPosts());
        assertEquals(100, ForumStatistics.averageNumberOfCommentsPerPost());
    }


    //Number of comments < number of posts
    @Test
    public void testCalcWhenNumberOfCommentsLessThanNumberOfPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        ForumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, ForumStatistics.numberOfComments());
        assertEquals(100, ForumStatistics.numberOfPosts());
        assertEquals(0.01, ForumStatistics.averageNumberOfCommentsPerPost());
    }
}

