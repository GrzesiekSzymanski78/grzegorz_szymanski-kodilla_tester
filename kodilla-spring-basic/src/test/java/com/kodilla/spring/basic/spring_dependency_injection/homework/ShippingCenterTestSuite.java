package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {

    String address = "HeroldowStreet 10B, Warsaw";

    @Test
    public void shouldReturnTrueIfPackageIsDelivered() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean info = bean.deliverPackage(address, 29.99);
        assertTrue(info);
    }

    @Test
    public void shouldReturnFalseIfPackageNotDelivered() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean info = bean.deliverPackage(address, 32.40);
        assertFalse(info);
    }

    @Test
    public void shouldDeliveredPackageIfAddressIsCorrect() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        String myAddress = bean.success(address);
        assertEquals("Package delivered to: HeroldowStreet 10B, Warsaw", myAddress);
    }

    @Test
    public void shouldNotDeliveredPackageIfAddressNotCorrect() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        NotificationService bean = context.getBean(NotificationService.class);
        String wrongAddress = bean.fail(address);
        assertEquals("Package not delivered to: HeroldowStreet 10B, Warsaw", wrongAddress);
    }
}