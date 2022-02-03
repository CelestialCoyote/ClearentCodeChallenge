package com.clearentcodechallenge;


import java.util.ArrayList;


public class Person {
    private String name;
    private ArrayList<CreditCard> wallet = new ArrayList<>();


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCardsToWallet(CreditCard creditCard) {
        wallet.add(creditCard);
    }

    public double getInterestSingleCard(int index) {
        double sum = wallet.get(index).calculateInterest(wallet.get(index));
        //System.out.println(sum);
        return sum;
    }

    public double getInterestAllCardsInWallet() {
        int numberOfCards = wallet.size();
        double totalInterestPaymentDue = 0;

        for(int i = 0; i < numberOfCards; i++) {
            totalInterestPaymentDue = totalInterestPaymentDue +
                    wallet.get(i).calculateInterest(wallet.get(i));
        }
        return totalInterestPaymentDue;
    }
}