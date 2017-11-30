package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public interface OrderRepository {
    String product();
    boolean order(User user);
    void placeOrder(User user, String p);
    List<String> getRepo();
}
