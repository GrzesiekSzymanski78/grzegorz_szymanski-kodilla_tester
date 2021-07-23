package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
        return;
    }

    public boolean turnOff() {
        System.out.println("The system has been shut down");
        return true;
    }

    public boolean turnOn() {
        System.out.println("The system has started");
        return true;
    }

    public int getYear() {
        return year;
    }
}