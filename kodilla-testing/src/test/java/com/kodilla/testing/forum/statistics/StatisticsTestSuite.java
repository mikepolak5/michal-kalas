package com.kodilla.testing.forum.statistics;


import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class StatisticsTestSuite {


    @Test
    public void calculateAdvStatisticsTest0Posts() {
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);

        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);
        assertEquals(0,statisticCalculator.getNumberOfPosts());
    }
    @Test
    public void calculateAdvStatisticsTest1000Posts() {
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);

        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);
        assertEquals(1000,statisticCalculator.getNumberOfPosts());
    }
    @Test
    public void calculateAdvStatisticsTest0Comments() {
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);

        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);
        assertEquals(0, statisticCalculator.getNumberOfComments());
    }
    @Test
    public void calculateAdvStatisticsTestMoreCommentsThanPosts() {
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(7);
        when(statistics.postsCount()).thenReturn(5);

        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);
        assertEquals(7, statisticCalculator.getNumberOfComments());
        assertEquals(5, statisticCalculator.getNumberOfPosts());
    }
    @Test
    public void calculateAdvStatisticsTestMorePostsThanComments() {
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(3);
        when(statistics.postsCount()).thenReturn(9);

        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);
        assertEquals(3, statisticCalculator.getNumberOfComments());
        assertEquals(9, statisticCalculator.getNumberOfPosts());
    }
    @Test
    public void calculateAdvStatisticsTest0Users() {
        Statistics statistics = mock(Statistics.class);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());

        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);
        assertEquals(0, statisticCalculator.getNumberOfUsers());
    }
    @Test
    public void calculateAdvStatisticsTest100Users() {
        Statistics statistics = mock(Statistics.class);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("User number " + i);
        }
        when(statistics.usersNames()).thenReturn(names);

        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);
        assertEquals(100, statisticCalculator.getNumberOfUsers());
    }
}