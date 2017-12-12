package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLasLog() {
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println("log: " + log);
        //Then
        Assert.assertEquals("mmm", log);
    }
}
