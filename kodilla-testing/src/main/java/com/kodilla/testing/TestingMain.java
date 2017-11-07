package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int addResult = calculator.getAddResult(5, 2);
        int substractResult = calculator.getSubstractResult(6, 3);

        if(addResult == 7) {
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }
        if (substractResult == 3) {
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }
    }
}