package com.kodilla.good.patterns.deliveries;

import java.util.ArrayList;
import java.util.List;

public class DeliveriesRepoImpl implements DeliveriesRepo {
    List<String> productsList = new ArrayList<>();
/*    @Override
    public void product(Products getProductQuantity, Products getProductType) {
        Products product1 = new Products(10, 'm');
        productsList.add(product1);
    }*/

    @Override
    public boolean order(Products product, Suppliers supplier) {
        if (supplier.getSupplier() == null && product.getProductQuantity() == 0)
            return false;
        return true;
    }

    @Override
    public void placedOrder(Suppliers suppliers, Products product) {
        Suppliers supplier1 = new Suppliers("New company - ");
        Products product1 = new Products(10, 'm');


    }

    @Override
    public List<String> getRepo(Suppliers suppliers, Products products) {
        productsList.add("Supplier: " + suppliers.getSupplier() + " delivered " + products.getProductQuantity() + " pcs of item");
        return productsList;
    }
}
