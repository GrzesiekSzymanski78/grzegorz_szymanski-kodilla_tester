package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication{
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(100);

        cars.add(ford);
        cars.add(new Audi(140));
        cars.add(new Ferrari(210));

        cars.remove(2);
        cars.remove(ford);

        for (Car car : cars) {
            CarUtils.displayCarInfo(car);
        }
    }
}