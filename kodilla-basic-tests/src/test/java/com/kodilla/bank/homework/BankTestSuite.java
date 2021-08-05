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
        bank.addWithdrawCashMachine(1,0);
        bank.addWithdrawCashMachine(5,2);
        bank.addDepositCashMachine(1,1);
        bank.addDepositCashMachine(2,4);
        bank.addDepositCashMachine(-100,2);
        bank.addDepositCashMachine(1,5);

        bank.addWithdrawCashMachine(1,3);
        bank.addWithdrawCashMachine(5,2);
        System.out.println("średnia " + bank.getAverageAmountDepositOperations());

        assertEquals(1.83,bank.getAverageAmountDepositOperations(),0.01);
        assertEquals(2.5,bank.getAverageAmountWithdrawOperations(),0.01);
    }
}