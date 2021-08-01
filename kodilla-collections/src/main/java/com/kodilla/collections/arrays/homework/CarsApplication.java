package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for(int n = 0; n < cars.length;n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int drawSpeed = random.nextInt(200);
        if (drawCarKind == 0)
            return new Ford(drawSpeed);
        else if (drawCarKind == 1)
            return new Audi(drawSpeed);
        else
            return new Ferrari(drawSpeed);
    }
}