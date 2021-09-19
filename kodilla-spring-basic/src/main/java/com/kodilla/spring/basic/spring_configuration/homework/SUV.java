package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

    @Override
    public boolean hasHeadLightsTurnedOn() {
        if (LocalTime.now().isAfter(LocalTime.of(20, 00)) || (LocalTime.now().isBefore(LocalTime.of(6, 00)))) {
            return true;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}