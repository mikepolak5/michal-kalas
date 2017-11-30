package com.kodilla.good.patterns.challenges;

public class ServiceMain {
    public static void main (String[] args) {
        InformationService informationService = new InformationServiceImpl();
        OrderRepository orderRepository = new OrderRepositoryImpl();
        User user = new User("Greg");
        OrderRequest orderRequest = new OrderRequest(user, "Shoes");



        OrderProcessor orderProcessor = new OrderProcessor(informationService, orderRepository);
        OrderDTo orderDTo = orderProcessor.process(orderRequest);
        System.out.println(orderDTo.getUser() + " " + orderDTo.isOrdered());
        System.out.println(orderRepository.getRepo());
    }
}
