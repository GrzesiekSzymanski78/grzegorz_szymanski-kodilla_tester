package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100);
        doRace(ford);

        Audi audi = new Audi(100);
        doRace(audi);

        Ferrari ferrari = new Ferrari(100);
        doRace(ferrari);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}