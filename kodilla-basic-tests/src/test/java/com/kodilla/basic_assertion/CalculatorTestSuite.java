package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 8;
        int subtractResult = calculator.minus(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquaredPositiveNumber() {
        double a = 5.0;
        double squaredResult = calculator.power(a, 2);
        assertEquals(25, squaredResult);
    }

    @Test
    public void testSquaredNegativeNumber() {
        double a = -5.0;
        double squaredResult = calculator.power(a, 2);
        assertEquals(25, squaredResult, 0.01);
    }

    @Test
    public void testSquareZeroNumber() {
        double a = 0.0;
        double squaredResult = calculator.power(a, 2);
        assertEquals(0.0, squaredResult, 0.01);
    }
}