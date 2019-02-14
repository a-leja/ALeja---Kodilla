package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}

public class ForumStatistics implements Statistics{

    public int getUsersQuantity() {

        return;
    }


    public int getPostsQuantity() {

        return;
    }


    public int getCommentsQuantity() {

        return;
    }


    public int getAveragePostsQuantity() {

        return;
    }



    public int getAverageCommentsQuantity() {

        return;
    }


    public int getAverageCommentsPerPost() {

        return;
    }


    public int calculateAdvStatistics(Statistics statistics) {

        return;
    }


    public int showStatistics() {

        return;
    }
}

