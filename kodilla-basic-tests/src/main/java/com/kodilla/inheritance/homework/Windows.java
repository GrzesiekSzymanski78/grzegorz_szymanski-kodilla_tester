package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    Windows() {
        super(2020);
    }

    @Override
    public boolean turnOn() {
        System.out.println("Windows has started");
        return true;
    }

    @Override
    public boolean turnOff() {
        System.out.println("Windows has been shut down");
        return true;
    }
}