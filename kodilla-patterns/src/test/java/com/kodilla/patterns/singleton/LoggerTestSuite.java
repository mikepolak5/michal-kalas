package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLasLog() {
        //Given
        //When
        Logger.getInstance().log("test");
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(Logger.getInstance().getLastLog(), log);
    }
}
