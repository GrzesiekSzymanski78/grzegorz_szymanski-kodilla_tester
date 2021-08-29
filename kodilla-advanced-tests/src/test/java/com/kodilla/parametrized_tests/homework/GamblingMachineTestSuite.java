package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validSetOfNumbers.csv")
    public void shouldReturnTrueWhenTheNumberOfDigitsHitIsGreaterThenZero(String numbers)
            throws InvalidNumberException {

        String[] stringNumbers = numbers.split(" ");

        Set<Integer> numbers1 = new HashSet<>();

        for (String value : stringNumbers) {
            numbers1.add(Integer.valueOf(value));
        }
        int howManyWins = gamblingMachine.howManyWins(numbers1);
        System.out.println(howManyWins);
        assertTrue(howManyWins > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidSetOfNumbers.csv")
    public void shouldThrowExceptionWhenSetOfNumbersIsLessThanSix(String strings) {

        String[] numbers = strings.split(" ");

        Set<Integer> userNumbers = new HashSet<>();

        for (String number : numbers) {
            userNumbers.add(Integer.parseInt(number));
            assertThrows(InvalidNumberException.class, () -> gamblingMachine.howManyWins(userNumbers));
        }
    }
}