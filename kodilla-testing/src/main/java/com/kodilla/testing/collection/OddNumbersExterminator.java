package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    public List <Integer> exterminate(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();

        for(int n = 0; n < numbers.size(); n++) {

            if (numbers.get(n) % 2 != 0) {
                even.add(numbers.get(n));
            }
        }
        return even;
    }
}
