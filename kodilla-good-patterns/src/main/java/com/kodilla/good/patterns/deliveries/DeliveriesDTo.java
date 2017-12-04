package com.kodilla.good.patterns.deliveries;

public class DeliveriesDTo {
    public boolean isOrdered;
    public Suppliers suppliers;

    public DeliveriesDTo(boolean isOrdered, Suppliers suppliers) {
        this.isOrdered = isOrdered;
        this.suppliers = suppliers;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }
}
