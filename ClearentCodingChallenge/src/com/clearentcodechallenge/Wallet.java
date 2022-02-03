package com.clearentcodechallenge;


import java.util.ArrayList;


public class Wallet {
    private ArrayList<CreditCard> wallet = new ArrayList<>();

    public Wallet(ArrayList<CreditCard> wallet) {
        this.wallet = wallet;
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
