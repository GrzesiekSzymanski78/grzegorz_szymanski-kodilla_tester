package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {

    static Stream<Arguments> provideDoubleForTestingBMI() {
        return Stream.of(
                Arguments.of(1.8, 45.0, "Very severely underweight"),
                Arguments.of(1.8, 50.0, "Severely underweight"),
                Arguments.of(1.8, 55.0, "Underweight"),
                Arguments.of(1.8, 75.0, "Normal(healthy weight)"),
                Arguments.of(1.8, 95.0, "Overweight"),
                Arguments.of(1.8, 105.0, "Obese Class I (Moderately obese)"),
                Arguments.of(1.8, 120.0, "Obese Class II (Severely obese)"),
                Arguments.of(1.8, 135.0, "Obese Class III (Very severely obese)"),
                Arguments.of(1.8, 150.0, "Obese Class IV (Morbidly obese)"),
                Arguments.of(1.8, 180.0, "Obese Class V (Super obese)"),
                Arguments.of(1.8, 200.0, "Obese Class VI (Hyper obese)")
        );
    }
}