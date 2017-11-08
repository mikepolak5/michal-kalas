package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 5;
        int z = 10;
        int y = calculator.getAddResult(x, z);
    }
}