package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private final User user;
    private final String name;

    public OrderRequest(User user, String name) {
        this.user = user;
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }
}
