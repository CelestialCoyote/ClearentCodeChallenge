package com.clearentcodechallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


public class DiscoveryTest {

    private Discovery discovery;

    @BeforeEach
    void setUp() throws Exception {
        discovery = new Discovery(300.00);
    }

    @Test
    void getBalance() {
        assertEquals(300.00, discovery.getBalance(), 0.001);
    }

    @Test
    void setBalance() {
        discovery.setBalance(150.00);
        assertEquals(150.00, discovery.getBalance(), 0.001);
    }

    @Test
    void getInterestRate() {
        assertEquals(0.01, discovery.getInterestRate(), 0.001);
    }

//    @Test
//    void calculateInterest(Discovery discovery) {
//        assertEquals(3.00, discovery.calculateInterest(discovery));
//    }

}