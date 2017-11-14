package com.kodilla.testing.forum.statistics;

import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


public class StatisticsTestSuite {


    @Test
    public void calculateAdvStatisticsTest(){
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(1000);

        List<String> userNames = new ArrayList<>();
        userNames.add("69");
        userNames.add("rer");
        when(statistics.usersNames()).thenReturn(userNames);


        StatisticCalculator statisticCalculator = new StatisticCalculator();
        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(4,statisticCalculator.getNumberOfPosts());


    }
}
