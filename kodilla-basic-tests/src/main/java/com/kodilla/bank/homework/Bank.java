package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine[] cashMachines = new CashMachine[2];

    public Bank() {
        this.cashMachines = new CashMachine[6];
        this.name = "CashMachine";
        for (int i = 0; i < cashMachines.length; i++) {
            cashMachines[i] = new CashMachine();
        }
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int getCashAmount() {
        int amount = 0;
        for (int i = 0; i > cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                amount = amount + cashMachine.getTransactions()[j];
            }
        }
        return amount;
    }

    public int getNumberOfWithdrawOperations() {
        int withdrawNumber = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions()[j] < 0) {
                    withdrawNumber = withdrawNumber + 1;
                }
            }
        }
        return withdrawNumber;
    }

    public int getNumberOfDepositOperations() {
        int depositNumber = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions()[j] > 0) {
                    depositNumber = depositNumber + 1;
                }
            }
        }
        return depositNumber;
    }

    public double getAverageAmountDepositOperations() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        System.out.println(this.cashMachines.length);
        double deposit = 0;
        double depositNumber = 0;
        for (int i = 0; i < cashMachines.length; i++) {
//            CashMachine cashMachine = cashMachines[i];
//            for (int j = 0; j < cashMachines[i].getTransactions().length; j++) {
//                System.out.println("Jestem tu");
//                if (cashMachines[i].getTransactions()[i] > 0) {
                    deposit = deposit + cashMachines[i].getAverageOfPayments();
                    depositNumber = depositNumber + 1;
                }
//            }
//        }
        System.out.println(deposit/depositNumber);
        System.out.println(deposit);
        System.out.println(depositNumber);
        return deposit / depositNumber;
    }

    public double getAverageAmountWithdrawOperations() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double withdraw = 0;
        double withdrawNumber = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getTransactions().length; j++) {
                if (cashMachine.getTransactions().length > 0) {
                    withdraw = withdraw + cashMachine.getTransactions()[j];
                    withdrawNumber = withdrawNumber - 1;
                }
            }
        }
        return withdraw / withdrawNumber;
    }

    public int addDepositCashMachine(int operation, int cashMachineNumber) {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        if (operation > 0 && operation < 300) {
            this.cashMachines[cashMachineNumber].addTransaction(operation);
        }
        return operation;
    }

    public void addWithdrawCashMachine(int operation, int cashMachineNumber) {
        System.out.println(operation);
//        if (operation > -300 && operation < 0) {
            System.out.println(operation);
            this.cashMachines[cashMachineNumber].addTransaction(operation);
//        }
    }
}