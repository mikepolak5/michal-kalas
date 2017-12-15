package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        System.out.println("Type your name.");
        User user = new User();
        user.setName(scanner.nextLine());
        System.out.println("Your name is: " + user.getName());
        System.out.println("Insert number of rounds, that you'd like to play.");
        RoundNumber roundNumber = new RoundNumber();
        roundNumber.setNumberOfRounds(Integer.valueOf(scanner.nextLine()));
        System.out.println("You chose " + roundNumber.getNumberOfRounds() + " rounds to play");
        int numberOfVictories = 0;
        int numberOfLooses = 0;

        while (!end) {
            System.out.println("1 - rock");
            System.out.println("2 - paper");
            System.out.println("3 - scissors");
            System.out.println("x - exit");
            System.out.println("n - new game");
            System.out.println("Pick a key");
            String userChoice = scanner.nextLine();
            switch (userChoice) {
                case "x":
                    end = true;
                    break;
                case "1":
                case "2":
                case "3":
                    int result = game.playAGame(userChoice);
                    switch (result) {
                        case 0:
                            numberOfLooses++;
                            break;
                        case 1:
                            numberOfVictories++;
                            break;
                        case 2:
                            break;
                    }
                    break;
                case "n":
                    System.out.println("ARE YOU SURE? PRESS (y) for yes, (n) for no");
                    switch (scanner.nextLine()) {
                        case "y":
                            numberOfLooses = 0;
                            numberOfVictories = 0;
                            break;
                        case "n":
                            break;
                        default:
                            System.out.println("You have to decide.");
                    }
                    break;
                default:
                    System.out.println("Wrong key!");
            }
            System.out.println("Number of your wins: {" + numberOfVictories + "}, Number of your looses: {"
                    + numberOfLooses + "}");

            if (roundNumber.getNumberOfRounds() == numberOfLooses) {
                System.out.println("YOU LOST");
                numberOfLooses = 0;
                numberOfVictories = 0;
                end = isEnd(end, scanner);
            }
            if (roundNumber.getNumberOfRounds() == numberOfVictories) {
                System.out.println("YOU WON");
                numberOfLooses = 0;
                numberOfVictories = 0;
                end = isEnd(end, scanner);
            }
        }
    }

    private static boolean isEnd(boolean end, Scanner scanner) {
        System.out.println("Would you like to play again? Press (n) for no, and (y) for yes.");
        switch (scanner.nextLine()) {
            case "n":
                end = true;
                break;
            case "y":
                break;
        }
        return end;
    }
}
