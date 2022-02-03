package com.clearentcodechallenge;


public class Discovery extends CreditCard {

    private final double interestRate = 0.01;

    public Discovery(double balance) {
        super(balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

}

