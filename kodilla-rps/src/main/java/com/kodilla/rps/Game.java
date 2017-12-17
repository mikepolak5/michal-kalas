package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Game {
    private Random AI = new Random();
    private static Map<String, String> numberToRPSMap = new HashMap<>();

    static {
        numberToRPSMap.put("1", "rock");
        numberToRPSMap.put("2", "paper");
        numberToRPSMap.put("3", "scissors");
    }

    public int playAGame(String userChoice) {
        String AIChoice = String.valueOf(AI.nextInt(3) + 1);
        if (userChoice.equals("1")) {
            System.out.println("You picked rock and AI picked " + numberToRPSMap.get(AIChoice));
            switch(AIChoice) {
                case "1":
                    System.out.println("DRAW");
                    return 2;
                case "2":
                    System.out.println("DEFEAT");
                    return 0;
                case "3":
                    System.out.println("WIN");
                    return 1;
                }
        }
        if (userChoice.equals("2") ) {
            System.out.println("You picked rock and AI picked " + numberToRPSMap.get(AIChoice));
            switch(AIChoice){
                case "2":
                    System.out.println("DRAW");
                    return 2;
                case "1":
                    System.out.println("WIN");
                    return 1;
                case "3":
                    System.out.println("DEFEAT");
                    return 0;
            }
        }
        if (userChoice.equals("3")) {
            System.out.println("You picked rock and AI picked " + numberToRPSMap.get(AIChoice));
            switch(AIChoice){
                case "3":
                    System.out.println("DRAW");
                    return 2;
                case "1":
                    System.out.println("DEFEAT");
                    return 0;
                case "2":
                    System.out.println("WIN");
                    return 1;
            }
        }
        throw new IllegalArgumentException("I have: " + userChoice);
    }
}
