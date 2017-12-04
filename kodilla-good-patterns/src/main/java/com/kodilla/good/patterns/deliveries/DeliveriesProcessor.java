package com.kodilla.good.patterns.deliveries;

public class DeliveriesProcessor {
    private DeliveriesRepo deliveriesRepo;

    public DeliveriesProcessor(final DeliveriesRepo deliveriesRepo) {
        this.deliveriesRepo = deliveriesRepo;
    }
    public DeliveriesDTo process(final DeliveryRequest deliveryRequest) {
        boolean isOrdered = deliveriesRepo.order(deliveryRequest.getProduct(), deliveryRequest.getSupplier());

        if (isOrdered) {
            deliveriesRepo.placedOrder(deliveryRequest.getSupplier(), deliveryRequest.getProduct());
            return new DeliveriesDTo(true, deliveryRequest.getSupplier());
        } else {
            return new DeliveriesDTo(false, deliveryRequest.getSupplier());
        }
    }
}
