package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;

public class ForumStatistics {

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberOfPost;
    double averageNumberOfComments;
    double averageNumberOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();


        if (numberOfUsers > 0) {
            averageNumberOfPost = numberOfPosts / numberOfUsers;
        } else {
            averageNumberOfPost = 0;
            System.out.println("No user provided!");
        }


        if (numberOfUsers > 0) {
            averageNumberOfComments = numberOfComments / numberOfUsers;
        } else {
            averageNumberOfComments = 0;
            System.out.println("No user provided!");
        }

        if (numberOfComments > 0 && numberOfPosts > 0) {
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;
        } else if (numberOfPosts == 0) {
            System.out.println("There is not post yet!");
        } else if (numberOfComments == 0) {
            System.out.println("There is not comment yet!");
        }
    }


    public int getNumberOfUsers() {
        return numberOfUsers;
    }


    public int getNumberOfPosts() {
        return numberOfPosts;
    }


    public int getNumberOfComments() {
        return numberOfComments;
    }


    public double getAverageNumberOfPosts() {

        return averageNumberOfPost;
    }


    public double getAverageNumberOfComments() {

        return averageNumberOfComments;
    }


    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }


    public void showStatistics(Statistics statistics) {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts: " + averageNumberOfPost);
        System.out.println("Average number of comments: " + averageNumberOfComments);
        System.out.println("Average number of comments per post: " + averageNumberOfCommentsPerPost);
    }
}

