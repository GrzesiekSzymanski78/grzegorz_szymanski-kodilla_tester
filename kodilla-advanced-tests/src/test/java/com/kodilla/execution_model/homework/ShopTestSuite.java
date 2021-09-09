package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(new Order(125.99, LocalDate.of(2021, 06, 01), "Kate81"));
        shop.addOrder(new Order(60.00, LocalDate.of(2021, 04, 30), "Johnny25"));
        shop.addOrder(new Order(55.50, LocalDate.of(2021, 05, 29), "Dave02"));
        shop.addOrder(new Order(260.00, LocalDate.of(2021, 04, 15), "JackBlack"));
        shop.addOrder(new Order(32.20, LocalDate.of(2021, 06, 23), "Harry02"));
    }

    @Test
    public void shouldAddOrdersToOrderList() {
        int numberOfOrders = shop.shopOrders.size();
        assertEquals(5, numberOfOrders);
    }

    @Test
    public void shouldGetOrdersInDatesRange() {
        List<Order> result = shop.getOrdersInTwoDatesRange(LocalDate.of(2021, 04, 15),
                LocalDate.of(2021, 04, 30));
        assertEquals(2, result.size());
    }

    @Test
    public void shouldGetOrdersInValueRange() {
        List<Order> orders = shop.getOrdersInValueRange(30, 60);
        assertEquals(3, orders.size());
    }

    @Test
    public void shouldReturnEmptyListIfDatesOutOfRange() {
        List<Order> emptyList = shop.getOrdersInTwoDatesRange(LocalDate.of(2021, 01, 01),
                LocalDate.of(2021, 03, 31));
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldReturnEmptyListIfValuesOutOfRange() {
        List<Order> emptyList = shop.getOrdersInValueRange(10, 30);
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldSelectedOrderExist() {
        Order result = shop.shopOrders.get(0);
        assertEquals("Kate81", result.getUserLogin());
        assertEquals(125.99, result.getOrderValue());
        assertEquals(LocalDate.of(2021, 06, 01), result.getOrderDate());
    }

    @Test
    public void shouldExistingIndexOfOrder() {
        Order result = shop.getOrder(3);
        assertEquals(shop.getOrder(3), result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        Order result = shop.getOrder(5);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        Order result = shop.getOrder(-1);
        assertNull(result);
    }

    @Test
    public void shouldClearExistingOrders() {
        shop.shopOrders.clear();
        assertEquals(0, shop.getOrderSize());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessages() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodbyeMessage() {
        System.out.println("Finishing testing");
    }
}