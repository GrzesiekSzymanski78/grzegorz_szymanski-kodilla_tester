package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarFactoryTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldChooseCorrectCarForCurrentSeason(){
        Car car = (Car) context.getBean("chooseCarDependingOnSeason");
        String myCar = car.getCarType();
        System.out.println(myCar);
        Assertions.assertEquals("Cabrio",myCar);
    }


    @Test
    public void shouldReturnFalseIfHeadlightsTurnOf() {
        Car car = (Car) context.getBean("chooseCarDependingOnSeason");
        boolean headlightsStatus = car.hasHeadLightsTurnedOn();
        System.out.println(headlightsStatus);
        Assertions.assertFalse(headlightsStatus);
    }
}