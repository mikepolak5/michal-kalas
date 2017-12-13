package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLasLog() {
        //Given
        Logger.getInstance().log("test");
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("test", log);
    }
}
