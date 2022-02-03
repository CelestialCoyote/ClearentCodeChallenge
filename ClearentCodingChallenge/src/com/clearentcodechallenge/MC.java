package com.clearentcodechallenge;


public class MC extends CreditCard {

    private final double interestRate = 0.05;

    public MC(double balance) {
        super(balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

}
