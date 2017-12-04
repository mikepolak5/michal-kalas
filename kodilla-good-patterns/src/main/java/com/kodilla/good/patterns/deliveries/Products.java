package com.kodilla.good.patterns.deliveries;

public class Products {
    int productQuantity;
    char productType;

    public Products(int productQuantity, char productType) {
        this.productQuantity = productQuantity;
        this.productType = productType;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public char getProductType() {
        return productType;
    }
}
