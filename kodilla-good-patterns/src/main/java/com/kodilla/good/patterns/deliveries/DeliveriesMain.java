package com.kodilla.good.patterns.deliveries;

public class DeliveriesMain {
    public static void main(String[] args) {
        DeliveriesRepo deliveriesRepo = new DeliveriesRepoImpl();
        Suppliers supplier = new Suppliers("FlatBread");
        Products product1 = new Products(10, 'm');
        DeliveryRequest deliveryRequest = new DeliveryRequest(supplier, product1);

        DeliveriesProcessor deliveriesProcessor = new DeliveriesProcessor(deliveriesRepo);
        DeliveriesDTo deliveriesDTo = new DeliveriesDTo(true, supplier);
        System.out.println(deliveriesDTo.getSuppliers() + " " + deliveriesDTo.isOrdered);
        System.out.println(deliveriesRepo.getRepo(supplier, product1));
    }
}
