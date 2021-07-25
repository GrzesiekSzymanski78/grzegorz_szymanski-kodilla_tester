package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    @Override
    public double calculateArea(double sideA, double sideB, double height) {
        return result = sideA * sideB;
    }

    @Override
    public double calculateCircuit(double sideA, double sideB) {
        return result = 2 * sideA + 2 * sideB;
    }
}