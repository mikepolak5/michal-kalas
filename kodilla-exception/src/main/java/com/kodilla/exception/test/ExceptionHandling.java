package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge stringReader = new SecondChallenge();

        try {
            stringReader.probablyIWillThrowException(88, 1.5);
        } catch (Exception e) {
            System.out.println("Problem, while reading!");
        }
    }
}
