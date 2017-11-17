package com.kodilla.testing.forum.statistics;


import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class StatisticsTestSuite {


    @Test
    public void calculateAdvStatisticsTest0Posts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        //When
        statisticCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticCalculator.getNumberOfUsers());
        assertEquals(0, statisticCalculator.getNumberOfPosts());
        assertEquals(0, statisticCalculator.getNumberOfComments());
        assertEquals(0, statisticCalculator.getAverageCommentsPerPost(), 0);
        assertEquals(0, statisticCalculator.getAverageCommentsPerUser(), 0);
        assertEquals(0, statisticCalculator.getAveragePostsPerUser(), 0);
    }
    @Test
    public void calculateAdvStatisticsTest1000Posts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        //When
        statisticCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticCalculator.getNumberOfUsers());
        assertEquals(1000, statisticCalculator.getNumberOfPosts());
        assertEquals(0, statisticCalculator.getNumberOfComments());
        assertEquals(0, statisticCalculator.getAverageCommentsPerPost(), 0);
        assertEquals(0, statisticCalculator.getAverageCommentsPerUser(), 0);
        assertEquals(0, statisticCalculator.getAveragePostsPerUser(), 0);
    }
    @Test
    public void calculateAdvStatisticsTest0Comments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        //When
        statisticCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticCalculator.getNumberOfUsers());
        assertEquals(0, statisticCalculator.getNumberOfPosts());
        assertEquals(0, statisticCalculator.getNumberOfComments());
        assertEquals(0, statisticCalculator.getAverageCommentsPerPost(), 0);
        assertEquals(0, statisticCalculator.getAverageCommentsPerUser(), 0);
        assertEquals(0, statisticCalculator.getAveragePostsPerUser(), 0);
    }
    @Test
    public void calculateAdvStatisticsTestMoreCommentsThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(7);
        when(statistics.postsCount()).thenReturn(5);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        //When
        statisticCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticCalculator.getNumberOfUsers());
        assertEquals(5, statisticCalculator.getNumberOfPosts());
        assertEquals(7, statisticCalculator.getNumberOfComments());
        assertEquals(1.0, statisticCalculator.getAverageCommentsPerPost(), 0);
        assertEquals(0, statisticCalculator.getAverageCommentsPerUser(), 0);
        assertEquals(0, statisticCalculator.getAveragePostsPerUser(), 0);
    }
    @Test
    public void calculateAdvStatisticsTestMorePostsThanComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(3);
        when(statistics.postsCount()).thenReturn(9);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        //When
        statisticCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticCalculator.getNumberOfUsers());
        assertEquals(9, statisticCalculator.getNumberOfPosts());
        assertEquals(3, statisticCalculator.getNumberOfComments());
        assertEquals(0, statisticCalculator.getAverageCommentsPerPost(), 0);
        assertEquals(0, statisticCalculator.getAverageCommentsPerUser(), 0);
        assertEquals(0, statisticCalculator.getAveragePostsPerUser(), 0);
    }
    @Test
    public void calculateAdvStatisticsTest0Users() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        //When
        statisticCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticCalculator.getNumberOfUsers());
        assertEquals(0, statisticCalculator.getNumberOfPosts());
        assertEquals(0, statisticCalculator.getNumberOfComments());
        assertEquals(0, statisticCalculator.getAverageCommentsPerPost(), 0);
        assertEquals(0, statisticCalculator.getAverageCommentsPerUser(), 0);
        assertEquals(0, statisticCalculator.getAveragePostsPerUser(), 0);
    }
    @Test
    public void calculateAdvStatisticsTest100Users() {
        //Given
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("User number " + i);
        }
        when(statistics.usersNames()).thenReturn(names);
        StatisticCalculator statisticCalculator = new StatisticCalculator();

        //When
        statisticCalculator.calculateAdvStatistics(statistics);

        //Then
        assertEquals(100, statisticCalculator.getNumberOfUsers());
        assertEquals(0, statisticCalculator.getNumberOfPosts());
        assertEquals(0, statisticCalculator.getNumberOfComments());
        assertEquals(0, statisticCalculator.getAverageCommentsPerPost(), 0);
        assertEquals(0, statisticCalculator.getAverageCommentsPerUser(), 0);
        assertEquals(0, statisticCalculator.getAveragePostsPerUser(), 0);
    }
}