package com.mickyholmes.java60days.day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01SimpleInterestCalculatorTest {

    @Test
    void testCalculateSimpleInterest_basicCase() {
        double result = Ex01SimpleInterestCalculator.calculateSimpleInterest(1000, 5, 3);
        assertEquals(150, result, 0.001); //includes 0.001 tolerance
    }

    @Test
    void testCalculateSimpleInterest_zeroValues() {
        double result = Ex01SimpleInterestCalculator.calculateSimpleInterest(0, 5, 3);
        assertEquals(0, result, 0.001);
    }

    @Test
    void testCalculateSimpleInterest_largeValues() {
        double result = Ex01SimpleInterestCalculator.calculateSimpleInterest(12345, 12.5, 10);
        assertEquals(15431.25, result, 0.001);
    }

}