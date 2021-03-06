package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticCalculator {

    Statistics statistics;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int hundredUsers;


    public Statistics getStatistics() {
        return statistics;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
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


    public void ShowStatistics() {
        System.out.println("Average comments Per Post: " + averageCommentsPerPost);
        System.out.println("Average comments per User: " + averageCommentsPerUser);
        System.out.println("Average posts per User: " + averagePostsPerUser);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of users: " + numberOfUsers);
}

    public void calculateAdvStatistics (Statistics statistics) {

        if(statistics.postsCount() != 0) {
            averageCommentsPerPost = statistics.commentsCount()/statistics.postsCount();
        }
        if (statistics.usersNames().size() > 0) {
            averageCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
            averagePostsPerUser = statistics.postsCount()/statistics.usersNames().size();
        }
        numberOfComments = statistics.commentsCount();
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
    }
}
