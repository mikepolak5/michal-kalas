package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository{
    List<String> repo = new ArrayList<>();
    @Override
    public String product() {
        return "Nike shoes";
    }

    @Override
    public boolean order(User user) {
        if (user.getUser() == "Aurelia")
            return false;
        return true;
    }

    @Override
    public void placeOrder(User user, String p) {
        repo.add("Order: " + user.getUser() + "-" + p);
    }

    @Override
    public List<String> getRepo() {
        return repo;
    }
}
