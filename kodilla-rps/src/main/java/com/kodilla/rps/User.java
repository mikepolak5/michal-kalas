package com.kodilla.rps;

import java.util.Scanner;

public class User {
    private String name;

    public User() {
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);

        while (name.equals("")) {
            System.out.println("You have to type a name!");
            setName(scanner.nextLine());
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
