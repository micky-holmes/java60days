package com.mickyholmes.java60days.day03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex02tradeProfitCalculatorTest {

    private static final double EPS = 1e-9;

    @Test
    @DisplayName("calculateProfit: selling - cost")
    void calculateProfit_basic() {
        assertEquals(50.0, Ex02tradeProfitCalculator.calculateProfit(100.0, 150.0), EPS);
        assertEquals(0.0,  Ex02tradeProfitCalculator.calculateProfit(99.99, 99.99), EPS);
        assertEquals(-10.0, Ex02tradeProfitCalculator.calculateProfit(60.0, 50.0), EPS);
    }

    @Test
    @DisplayName("calculateStock: ++units then --units (pre-increment/decrement)")
    void calculateStock_unarySequence() {
        // Given unitsSold = 10
        Ex02tradeProfitCalculator.StockCalculation sc = Ex02tradeProfitCalculator.calculateStock(10);
        // ++10 -> 11, then --11 -> 10
        assertEquals(11, sc.unitsAfterIncrement());
        assertEquals(10, sc.unitsAfterDecrement());

        // Another quick check
        sc = Ex02tradeProfitCalculator.calculateStock(0);
        assertEquals(1, sc.unitsAfterIncrement());
        assertEquals(0, sc.unitsAfterDecrement());
    }

    @Test
    @DisplayName("calculateProfitOrLoss: units * profitPerUnit")
    void calculateProfitOrLoss_basic() {
        assertEquals(500.0, Ex02tradeProfitCalculator.calculateProfitOrLoss(10, 50.0), EPS);
        assertEquals(0.0,   Ex02tradeProfitCalculator.calculateProfitOrLoss(0,  123.45), EPS);
        assertEquals(-150.0,Ex02tradeProfitCalculator.calculateProfitOrLoss(10, -15.0), EPS);
    }

    @Test
    @DisplayName("calculateModulo: remainder for division by 3")
    void calculateModulo_values() {
        assertEquals(0, Ex02tradeProfitCalculator.calculateModulo(3));
        assertEquals(1, Ex02tradeProfitCalculator.calculateModulo(4));
        assertEquals(2, Ex02tradeProfitCalculator.calculateModulo(5));
        assertEquals(0, Ex02tradeProfitCalculator.calculateModulo(0));

        // Note: Java keeps the sign of the dividend for %, e.g. -1 % 3 == -1
        assertEquals(-1, Ex02tradeProfitCalculator.calculateModulo(-1));
        assertEquals(-2, Ex02tradeProfitCalculator.calculateModulo(-2));
    }
}
