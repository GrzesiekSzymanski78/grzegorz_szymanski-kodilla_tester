package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb: " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb: " + a + " i " + b);
        }

        int subtractResult = calculator.minus(a,b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb: " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb: " + a + " i " + b);
        }

        double squaredResult = calculator.power(a,2);
        boolean correctSquared = ResultChecker.assertEquals(25, squaredResult);
        if (correctSquared) {
            System.out.println("Metoda squared działa poprawnie dla liczby: " + a);
        } else {
            System.out.println("Metoda squared działa poprawnie dla liczby: " + a);
        }
    }
}