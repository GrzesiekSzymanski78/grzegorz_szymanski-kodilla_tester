package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Ford;

public class CarUtils {

    public static void displayCarInfo(Car car){
        System.out.println("-------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("The current speed is: " + car.getSpeed());
    }

    private static String getCarName(Car car){
        if(car instanceof Ford)
            return "Ford";
        else if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ferrari)
            return "Ferrari";
        else
            return "Unknown car name";
    }
}