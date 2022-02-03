package com.clearentcodechallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


class CreditCardTest {

    private CreditCard creditCard;


    @BeforeEach
    void setUp() throws Exception {
        creditCard = new CreditCard(100.00, 0.12);
    }

    @Test
    void getBalance() {
        assertEquals(100.00, creditCard.getBalance(), 0.001);
    }

    @Test
    void setBalance() {
        creditCard.setBalance(150.00);
        assertEquals(150.00, creditCard.getBalance(), 0.001);
    }

    @Test
    void getInterestRate() {
        assertEquals(0.12, creditCard.getInterestRate(), 0.001);
    }

    @Test
    void setInterestRate() {
        creditCard.setInterestRate(0.18);
        assertEquals(0.18, creditCard.getInterestRate(), 0.001);
    }

//    @Test
//    void calculateInterest(CreditCard creditCard) {
//        assertEquals(12.00, creditCard.calculateInterest(creditCard));
//    }
}