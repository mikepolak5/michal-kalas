package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDTo process(final OrderRequest orderRequest) {
        boolean isOrdered = orderRepository.order(orderRequest.getUser());

        if(isOrdered) {
            informationService.getInform();
            orderRepository.placeOrder(orderRequest.getUser(), orderRepository.product());
            return new OrderDTo(orderRequest.getUser(), true);
        } else {
            return new OrderDTo(orderRequest.getUser(), false);
        }
    }
}

