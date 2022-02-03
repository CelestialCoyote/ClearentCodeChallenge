package com.clearentcodechallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    Cup c = new Cup("Orange Juice", 85.5);

    @Test
    void getLiquidType() {
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void setLiquidType() {
        c.setLiquidType("Water");
        assertEquals("Water", c.getLiquidType());
    }

    @Test
    void getPercentageFull() {
        assertEquals(85.5, c.getPercentFull(), 0.001);
    }

    @Test
    void setPercentageFull() {
        c.setPercentFull(75);
        assertEquals(75, c.getPercentFull(), 0.001);
    }

}