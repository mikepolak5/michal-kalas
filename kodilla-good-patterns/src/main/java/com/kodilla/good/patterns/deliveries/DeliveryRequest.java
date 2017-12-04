package com.kodilla.good.patterns.deliveries;

public class DeliveryRequest {
    Suppliers supplier;
    Products product;

    public DeliveryRequest(Suppliers supplier, Products product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Suppliers getSupplier() {
        return supplier;
    }

    public Products getProduct() {
        return product;
    }
}
