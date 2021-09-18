package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context =
            new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    Calculator calculator = context.getBean(Calculator.class);

    @Test
    public void testAddNumbersShouldReturnCorrectValue() {
        double value = calculator.add(1.0, 2.0);
        Assertions.assertEquals(3.0, value);
    }

    @Test
    public void testSubtractOfNumbersShouldReturnCorrectValue() {
        double value = calculator.subtract(4.50, 2.50);
        Assertions.assertEquals(2.0, value);
    }

    @Test
    public void testMultiplyOfNumbersShouldReturnCorrectValue() {
        double value = calculator.multiply(2.0, 2.0);
        Assertions.assertEquals(4.0, value);
    }

    @Test
    public void testDivideOfNumbersShouldReturnCorrectValue() {
        double value = calculator.divide(4.0, 2.0);
        Assertions.assertEquals(2.0, value);
    }
}