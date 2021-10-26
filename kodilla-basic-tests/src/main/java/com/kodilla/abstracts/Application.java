package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.EquilateralTriangle;
import com.kodilla.abstracts.homework.Rectangle;
import com.kodilla.abstracts.homework.Square;

public class Application {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.giveVoice();
//
//        AnimalProcessor processor = new AnimalProcessor();
//        processor.process(dog);
//
//        Duck duck = new Duck();
//        duck.giveVoice();

        Square square = new Square();
        square.calculateArea(5, 5, 0);
        System.out.println("The area of the square: " + square.result);
        square.calculateCircuit(5, 5);
        System.out.println("The circuit of the square: " + square.result);

        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(5.5, 11, 0);
        System.out.println();
        System.out.println("The area of the rectangle: " + rectangle.result);
        rectangle.calculateCircuit(11, 5.5);
        System.out.println("The circuit of the rectangle: " + rectangle.result);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.calculateArea(10, 0, 8.65);
        System.out.println();
        System.out.println("The area of the equilateral triangle: " + equilateralTriangle.result);
        equilateralTriangle.calculateCircuit(10, 0);
        System.out.println("The circuit of the equilateral triangle: "
                + equilateralTriangle.result);
    }
}