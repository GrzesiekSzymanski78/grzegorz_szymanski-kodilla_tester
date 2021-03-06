package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {

    private List <Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public Order getOrder(String number) throws Exception {
        Order order = orderList
                .stream()
                .filter(order1 -> order1.getNumber().equals(number))
                .findFirst()
//                .orElseThrow(OrderDoesntExistException::new);
        .orElseThrow(()->new Exception("My exception"));
        return order;
    }
}