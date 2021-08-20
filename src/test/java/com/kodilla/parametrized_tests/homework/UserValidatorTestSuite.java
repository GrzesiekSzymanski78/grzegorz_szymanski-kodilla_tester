package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"ArD", "mA4_p.-", "...", "-_-"})
    public void shouldReturnTrueIfUserNameIsCorrect() {
        assertTrue(validator.validateUserName("M.o-o_N"));
    }

    @ParameterizedTest
    @CsvSource(value = {"34", "%$*", "023^", "fr", "r"})
    public void shouldReturnFalseIfUserNameIsNotCorrect() {
        assertFalse(validator.validateUserName("&%$"));
    }

    @ParameterizedTest
    @CsvSource(value = {"g_s@poczta.onet.pl", "martin@wp.pl", "tree@poland.pl"})
    public void shouldReturnTrueIfEmailIsCorrect() {
        assertTrue(validator.validateEmail("test@gmail.com"));
    }

    @ParameterizedTest
    @CsvSource(value = {"@may.pl","mark@pl","dark@gate_com.pl"})
    public void shouldReturnFalseIfEmailIsNotCorrect(){
        assertFalse(validator.validateEmail("@map"));
    }
}