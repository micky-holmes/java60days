package com.mickyholmes.java60days.day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01CalorieCounterTest {

    @Test
    void calculateTotal_addsAllCalories(){
        int result = Ex01CalorieCounter.calculateTotal(100, 200, 300);
        assertEquals(600, result);
    }

    @Test
    void calculateTotal_handlesZero(){
        int result = Ex01CalorieCounter.calculateTotal(0,500, 600);
        assertEquals(1100, result);
    }

    @Test
    void calculateTotal_handlesEmptyInput(){
        int result = Ex01CalorieCounter.calculateTotal();
        assertEquals(0, result);
    }

}