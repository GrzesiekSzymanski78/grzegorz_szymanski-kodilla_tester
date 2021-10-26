package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    public List<Order> shopOrders = new ArrayList<>();

    public void addOrder(Order order) {
        this.shopOrders.add(order);
    }

    public List<Order> getOrdersInTwoDatesRange(LocalDate startDate, LocalDate endDate) {
        return shopOrders.stream()
                .filter(d -> d.getOrderDate().isAfter(startDate)
                        && d.getOrderDate().isBefore(endDate)
                        || d.getOrderDate().isEqual(startDate)
                        || d.getOrderDate().isEqual(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersInValueRange(double min, double max) {
        return shopOrders.stream()
                .filter(v -> v.getOrderValue() >= min && v.getOrderValue() <= max)
                .collect(Collectors.toList());
    }

    public int getOrderSize() {
        return shopOrders.size();
    }

    public Order getOrder(int index) {
        if (index >= 0 && index < shopOrders.size()) {
            return this.shopOrders.get(index);
        }
        return null;
    }
}