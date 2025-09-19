package com.mickyholmes.java60days.day04;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class Ex01SimpleInterestCalculatorInputTest {

    @Test
    void testReadDouble_withInvalidThenValidInput(){
        String mockedUserInput ="yoho\n1000\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(mockedUserInput.getBytes()));
        double result = Ex01SimpleInterestCalculator.readDouble(scanner, "Enter principal: ");
        assertEquals(1000, result, 0.001);
    }
}
