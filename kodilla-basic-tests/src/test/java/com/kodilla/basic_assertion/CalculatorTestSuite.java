package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.minus(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquaredPositiveNumber() {
        Calculator calculator = new Calculator();
        double a = 5.0;
        double squaredResult = calculator.squared(a);
        assertEquals(25, squaredResult);
    }

    @Test
    public void testSquaredNegativeNumber() {
        Calculator calculator = new Calculator();
        double a = -5.0;
        double squaredResult = calculator.squared(a);
        assertEquals(25,squaredResult,0.01);
    }

    @Test
    public void testSquareZeroNumber() {
        Calculator calculator = new Calculator();
        double a = 0.0;
        double squaredResult = calculator.squared(a);
        assertEquals(0.0,squaredResult,0.01);
    }
}