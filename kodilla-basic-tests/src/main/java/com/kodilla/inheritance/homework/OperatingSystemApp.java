package com.kodilla.inheritance.homework;

public class OperatingSystemApp {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2013);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println("The year of release: " + operatingSystem.getYear());

        Windows windows = new Windows();
        windows.turnOn();
        windows.turnOff();
        System.out.println("The year of release: " + windows.getYear());

        Linux linux = new Linux();
        linux.turnOn();
        linux.turnOff();
        System.out.println("The year of release: " + linux.getYear());
    }
}