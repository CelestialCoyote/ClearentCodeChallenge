package com.clearentcodechallenge;


import java.text.NumberFormat;


public class CodeChallenge {
    public static void main(String[] args) {

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        // Test Case 1:
        Person Homer = new Person("Homer");

        Homer.addCardsToWallet(new Visa(100));
        Homer.addCardsToWallet(new MC(100));
        Homer.addCardsToWallet(new Discovery(100));

        double paymentHomerVisa = Homer.getInterestSingleCard(0);
        double paymentHomerMC = Homer.getInterestSingleCard(1);
        double paymentHomerDiscovery = Homer.getInterestSingleCard(2);

        double totalPaymentHomer = Homer.getInterestAllCardsInWallet();

        System.out.println("Test Case 1:");
        System.out.println("Homer Visa interest payment due = " + currencyFormatter.format(paymentHomerVisa));
        System.out.println("Homer MC interest payment due = " + currencyFormatter.format(paymentHomerMC));
        System.out.println("Homer Discovery interest payment due = " + currencyFormatter.format(paymentHomerDiscovery));
        System.out.println("Homer Total payment due = " + currencyFormatter.format(totalPaymentHomer));
        System.out.println();
        System.out.println();
        System.out.println();


        // Test Case 2:
        Person Monty1 = new Person("Monty1");
        Person Monty2 = new Person("Monty2");

        Monty1.addCardsToWallet(new Visa(100));
        Monty1.addCardsToWallet(new Discovery(100));

        Monty2.addCardsToWallet(new MC(100));
        Monty2.addCardsToWallet(new MC(100));

        double paymentMonty1Visa = Monty1.getInterestSingleCard(0);
        double paymentMonty1Discovery = Monty1.getInterestSingleCard(1);

        double paymentMonty2MC1 = Monty2.getInterestSingleCard(0);
        double paymentMonty2MC2 = Monty2.getInterestSingleCard(1);

        double totalPaymentMonty1 = Monty1.getInterestAllCardsInWallet();
        double totalPaymentMonty2 = Monty2.getInterestAllCardsInWallet();

        System.out.println("Test Case 2:");
        System.out.println("Monty1 Visa interest payment due = " + currencyFormatter.format(paymentMonty1Visa));
        System.out.println("Monty1 Discovery interest payment due = " + currencyFormatter.format(paymentMonty1Discovery));
        System.out.println("Monty1 Total payment due = " + currencyFormatter.format(totalPaymentMonty1));
        System.out.println();
        System.out.println("Monty2 MC1 interest payment due = " + currencyFormatter.format(paymentMonty2MC1));
        System.out.println("Monty2 MC2 interest payment due = " + currencyFormatter.format(paymentMonty2MC2));
        System.out.println("Monty2 Total payment due = " + currencyFormatter.format(totalPaymentMonty2));
        System.out.println();
        System.out.println("Monty All Total payment due = " + currencyFormatter.format(totalPaymentMonty1 + totalPaymentMonty2));
        System.out.println();
        System.out.println();


        // Test Case 3:
        Person Bart = new Person("Bart");
        Person Lisa = new Person("Lisa");

        Bart.addCardsToWallet(new Visa(100));
        Bart.addCardsToWallet(new MC(100));

        Lisa.addCardsToWallet(new Visa(100));
        Lisa.addCardsToWallet(new MC(100));

        double paymentBartVisa = Bart.getInterestSingleCard(0);
        double paymentBartMC = Bart.getInterestSingleCard(1);

        double paymentLisaVisa = Bart.getInterestSingleCard(0);
        double paymentLisaMC = Bart.getInterestSingleCard(1);

        double totalPaymentBart = Bart.getInterestAllCardsInWallet();
        double totalPaymentLisa = Lisa.getInterestAllCardsInWallet();

        System.out.println("Test Case 3:");
        System.out.println("Bart Visa interest payment due = " + currencyFormatter.format(paymentBartVisa));
        System.out.println("Bart MC interest payment due = " + currencyFormatter.format(paymentBartMC));
        System.out.println("Bart Total payment due = " + currencyFormatter.format(totalPaymentBart));
        System.out.println();
        System.out.println("Lisa Visa interest payment due = " + currencyFormatter.format(paymentLisaVisa));
        System.out.println("Lisa MC interest payment due = " + currencyFormatter.format(paymentLisaMC));
        System.out.println("Lisa Total payment due = " + currencyFormatter.format(totalPaymentLisa));
    }
}

