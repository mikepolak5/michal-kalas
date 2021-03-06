package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;



public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {


        int[] numbers = new int[20];
        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 12;
        numbers[3] = 13;
        numbers[4] = 14;
        numbers[5] = 15;
        numbers[6] = 17;
        numbers[7] = 18;
        numbers[8] = 19;
        numbers[9] = 20;
        numbers[10] = 21;
        numbers[11] = 22;
        numbers[12] = 23;
        numbers[13] = 24;
        numbers[14] = 25;
        numbers[15] = 26;
        numbers[16] = 27;
        numbers[17] = 28;
        numbers[18] = 29;
        numbers[19] = 30;

        Assert.assertEquals(20.2, ArrayOperations.getAverage(numbers), 0);
    }
}
