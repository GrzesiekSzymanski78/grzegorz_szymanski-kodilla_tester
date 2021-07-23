package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    Linux() {
        super(2016);
    }

    @Override
    public boolean turnOn() {
        System.out.println("Linux has started");
        return true;
    }

    @Override
    public boolean turnOff() {
        System.out.println("Linux has been shut down");
        return true;
    }
}