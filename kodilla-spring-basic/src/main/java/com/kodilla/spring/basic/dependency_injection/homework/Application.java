package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryServiceEnlargement();
        NotificationsService notificationsService = new NotificationsServiceEnlargement();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationsService);

        shippingCenter.sendPackage("Spring Street 23, Chicago", 45);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}