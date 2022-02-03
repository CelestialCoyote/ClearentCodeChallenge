package com.clearentcodechallenge;


public class Visa extends CreditCard {

    private final double interestRate = 0.1;

    public Visa(double balance) {
        super(balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

}
