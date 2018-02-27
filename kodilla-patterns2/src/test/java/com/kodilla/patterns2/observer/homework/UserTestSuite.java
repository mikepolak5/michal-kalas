package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mrAndrzej = new Mentor("Mr. Andrzej");
        Mentor mrTomasz = new Mentor("Mr. Tomasz");
        User johnSmith = new JohnSmith();
        User ivoneEscobar = new IvoneEscobar();
        johnSmith.registerObserver(mrAndrzej);
        ivoneEscobar.registerObserver(mrTomasz);

        //When
        johnSmith.sendTask("20.4");
        johnSmith.sendTask("20.5");
        ivoneEscobar.sendTask("18.2");

        int countTasksAndrzej = mrAndrzej.getCountTasks();
        int countTasksTomasz = mrTomasz.getCountTasks();

        //Then
        Assert.assertEquals(2, countTasksAndrzej);
        Assert.assertEquals(1, countTasksTomasz);
    }
}
