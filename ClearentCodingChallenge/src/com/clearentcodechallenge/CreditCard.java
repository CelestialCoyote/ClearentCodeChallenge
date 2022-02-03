package com.clearentcodechallenge;


public class CreditCard {

    private double balance;
    private double interestRate;

    public CreditCard(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public CreditCard(double balance) {
        this.balance = balance;
        this.interestRate = interestRate;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public double calculateInterest(CreditCard creditCard) {
        double balance = creditCard.getBalance();
        double rate = creditCard.getInterestRate();     // Rate is in percentage format - 0.00
        double time = 1;                                // Represents time unit of 1 month.

        double totalInterest = balance * time * rate;

        return totalInterest;
    }
}

