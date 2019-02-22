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
        assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
    }

    //case: number of post = 1000
    //number of comments = 100;
    @Test
    public void testCalcWhenNumberOfPostsEqualsOneThousand() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getAverageNumberOfPosts(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfComments(), 0.01);
        assertEquals(0.1, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
    }

    //case: number of comments = 0
    //number of posts = 100
    //number of users = 10
    @Test
    public void testCalcWhenNumberOfCommentsEqualsZero() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(100);
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            userNames.add("sampleName");
        }

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        //Then
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(10, forumStatistics.getAverageNumberOfPosts(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfComments(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
    }


    //case: number of users = 0
    @Test
    public void testCalcWhenNumberOfUsersEqualsZero() {
        //Given
        List<String> userNames = new ArrayList<>();

        //When
        when(statisticsMock.usersNames()).thenReturn(userNames);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getNumberOfUsers());
        assertEquals(0, forumStatistics.getAverageNumberOfPosts(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfComments(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
    }

    //case: number of users = 100
    //number of posts: 1
    //Number of comments: 1
    @Test
    public void testCalcWhenNumberOfUsersEqualsOnaHundred() {
        //Given
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            userNames.add("sampleName");
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(userNames);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getNumberOfUsers());
        assertEquals(1, forumStatistics.getNumberOfComments());
        assertEquals(1, forumStatistics.getNumberOfPosts());
        assertEquals(0.01, forumStatistics.getAverageNumberOfPosts(), 0.01);
        assertEquals(0.01, forumStatistics.getAverageNumberOfComments(), 0.01);
        assertEquals(1, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
    }

    //Number of comments > number of posts
    @Test
    public void testCalcWhenNumberOfCommentsGreaterThanNumberOfPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getNumberOfComments());
        assertEquals(1, forumStatistics.getNumberOfPosts());
        assertEquals(100, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfPosts(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfComments(), 0.01);
    }


    //Number of comments < number of posts
    @Test
    public void testCalcWhenNumberOfCommentsLessThanNumberOfPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, forumStatistics.getNumberOfComments());
        assertEquals(100, forumStatistics.getNumberOfPosts());
        assertEquals(0.01, forumStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfPosts(), 0.01);
        assertEquals(0, forumStatistics.getAverageNumberOfComments(), 0.01);
    }
}

