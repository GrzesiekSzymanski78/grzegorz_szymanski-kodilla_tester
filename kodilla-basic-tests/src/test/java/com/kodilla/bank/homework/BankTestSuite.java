package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
        bank.addDepositCashMachine(200, 1);
        bank.addDepositCashMachine(200, 2);

        bank.addWithdrawCashMachine(200, 3);
        bank.addWithdrawCashMachine(200, 4);
        bank.addWithdrawCashMachine(100, 2);

        double depositAverage = bank.getAverageAmountDepositOperations();
        double withdrawAverage = bank.getAverageAmountWithdrawOperations();

        assertEquals(200, depositAverage, 0.01);
        assertEquals(20, withdrawAverage, 0.01);
    }

    @Test
    public void shouldCalculateAveragesIfValuesAreOutsideRange() {
        bank.addDepositCashMachine(0,1);
        bank.addDepositCashMachine(-100,2);

        bank.addWithdrawCashMachine(0,3);
        bank.addWithdrawCashMachine(5,2);

        assertEquals(0,bank.getAverageAmountDepositOperations(),0.01);
        assertEquals(2.5,bank.getAverageAmountWithdrawOperations(),0.01);
    }
}