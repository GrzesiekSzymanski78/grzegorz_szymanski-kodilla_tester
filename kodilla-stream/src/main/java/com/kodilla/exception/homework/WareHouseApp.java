package com.kodilla.exception.homework;

import java.util.Scanner;

public class WareHouseApp {

    public static void main(String[] args) throws Exception {

        WareHouse wareHouse = new WareHouse();

        wareHouse.addOrder(new Order("1"));
        wareHouse.addOrder(new Order("2"));
        wareHouse.addOrder(new Order("3"));
        wareHouse.addOrder(new Order("4"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your order number(from 1 to 4): ");
        String orderNumber = scanner.nextLine();

        try {
            wareHouse.getOrder(orderNumber);
            System.out.println("Your order is in the warehouse.");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry we don't have this number of order.");
        }
    }
}