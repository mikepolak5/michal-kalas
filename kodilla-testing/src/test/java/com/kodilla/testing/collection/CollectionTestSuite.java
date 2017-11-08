package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<>());
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> inputCollection = new ArrayList<>();

        inputCollection.add(7);
        inputCollection.add(6);
        inputCollection.add(12);
        inputCollection.add(3);
        inputCollection.add(9);

        System.out.println("inputCollection");
        for(Integer k : inputCollection) {
            System.out.println(k);
        }
        List<Integer> result = oddNumbersExterminator.exterminate(inputCollection);
        System.out.println("Result");
        for(Integer k : result) {
            System.out.println(k);
        }
        Assert.assertEquals(2, result.size());
    }
}
