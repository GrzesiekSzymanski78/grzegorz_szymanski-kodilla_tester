package com.kodilla.abstracts.homework;

public class Square extends Shape {

    @Override
    public double calculateArea(double sideA, double sideB, double height) {
        return result = sideA * sideA;
    }

    @Override
    public double calculateCircuit(double sideA, double sideB) {
        return result = 4 * sideA;
    }
}