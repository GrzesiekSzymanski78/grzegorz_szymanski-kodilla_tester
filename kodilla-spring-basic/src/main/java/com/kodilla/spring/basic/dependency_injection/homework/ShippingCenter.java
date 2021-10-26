package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter implements NotificationsService, DeliveryService {

    private DeliveryService deliveryService;
    private NotificationsService notificationsService;

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationsService.success(address);
        } else {
            notificationsService.fail(address);
        }
    }

    public ShippingCenter(DeliveryService deliveryService,
                          NotificationsService notificationsService) {
        this.deliveryService = deliveryService;
        this.notificationsService = notificationsService;
    }

    @Override
    public boolean deliverPackage(String address, double weight) {
        return false;
    }

    @Override
    public void success(String address) {

    }

    @Override
    public void fail(String address) {

    }
}