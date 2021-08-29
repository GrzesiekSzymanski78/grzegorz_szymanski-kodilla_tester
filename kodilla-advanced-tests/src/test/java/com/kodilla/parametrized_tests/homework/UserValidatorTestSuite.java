package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"ArD", "mA4_p.-", "...", "-_-"})
    public void shouldReturnTrueIfUserNameIsCorrect(String username) {
        assertTrue(validator.validateUserName(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"34", "%$*", "023^", "fr", "r"})
    public void shouldReturnFalseIfUserNameIsNotCorrect(String username) {
        assertFalse(validator.validateUserName(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"g_s@poczta.onet.pl", "martin@wp.pl", "tree@poland.pl"})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"@may.pl", "mark@pl", "dark@gate_com.pl"})
    public void shouldReturnFalseIfEmailIsNotCorrect(String email) {
        assertFalse(validator.validateEmail(email));
    }
}