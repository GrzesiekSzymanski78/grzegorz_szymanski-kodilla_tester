package com.kodilla.bank.homework;

public class CashMachine {

    private int transactions[];
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public double getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double balance = 0;
        for (int i = 0; i < transactions.length; i++) {
            balance = balance + this.transactions[i];
        }
        return balance;
    }

    public double getCashAmount() {
        double cashAmount = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            cashAmount = cashAmount + this.transactions[i];
        }
        return cashAmount;
    }

    public double getAverage() {
        if (this.transactions.length == 0) {
            return 0;
        }
        return getCashAmount()/this.transactions.length;
    }

    public double getAverageOfPayments() {
        if (this.transactions.length == 0) {
            return 0;
        } else {
            double avg = 0;
            int operation = 0;
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] > 0) {
                    avg += this.transactions[i];
                    operation += 1;
                }
            }
            return avg / operation;
        }
    }
}