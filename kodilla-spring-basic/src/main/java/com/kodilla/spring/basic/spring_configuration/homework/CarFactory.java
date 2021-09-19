package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarFactory {

    @Bean
    public Car chooseCarDependingOnSeason() {
        Car car;
        if ((MonthDay.now().isAfter(MonthDay.of(3, 20)))
            && MonthDay.now().isBefore(MonthDay.of(6, 21))
                || ((MonthDay.now().isAfter(MonthDay.of(9,21)))
                && MonthDay.now().isBefore(MonthDay.of(12,21)))) {
            car = new Sedan();
        } else if (MonthDay.now().isAfter(MonthDay.of(6,20))
            && MonthDay.now().isBefore(MonthDay.of(9,21))) {
            car = new Cabrio();
        } else {
            car = new SUV();
        }
        return car;
    }
}