package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double orderValue;
    private LocalDate orderDate;
    private String userLogin;

    public Order(double orderValue, LocalDate orderDate, String userLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.userLogin = userLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getUserLogin() {
        return userLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderValue == order.orderValue && Objects.equals(orderDate, order.orderDate)
                && Objects.equals(userLogin, order.userLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, userLogin);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", userLogin='" + userLogin + '\'' +
                '}';
    }
}