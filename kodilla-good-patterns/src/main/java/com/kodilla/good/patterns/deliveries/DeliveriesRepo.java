package com.kodilla.good.patterns.deliveries;

import java.util.List;

public interface DeliveriesRepo {
/*    void product(Products getProductQuantity, Products getProductType);*/
    boolean order(Products product, Suppliers supplier);
    void placedOrder(Suppliers supplier, Products product);
    List<String> getRepo(Suppliers suppliers, Products products);
}
