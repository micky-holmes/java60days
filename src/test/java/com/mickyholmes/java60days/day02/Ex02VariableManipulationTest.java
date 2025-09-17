package com.mickyholmes.java60days.day02;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex02VariableManipulationTest {

    // this captures output to console. not the correct approach just proof of concept

    @Test
    void manipulateVariables_printsExpectedContent() {
        // capture System.out
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(baos));
        try {
            Ex02VariableManipulation.manipulateVariables();
        } finally {
            System.setOut(original);
        }

        String out = baos.toString();

        // Assertions on the important lines/values
        assertTrue(out.contains("Boolean: true"));
        assertTrue(out.contains("String: Java Programming"));

        assertTrue(out.contains("Performing Arithmetic Operations:"));
        assertTrue(out.contains("Sum of wholeNumber + 20: 30"));
        assertTrue(out.contains("Division of floatingPointNumber by 2.0: 2.875"));

        assertTrue(out.contains("Typecasting Demonstration:"));
        assertTrue(out.contains("Casted floatingPointNumber to int: 5"));

        assertTrue(out.contains("String Manipulation:"));
        assertTrue(out.contains("Combined String: Java Programming is fun!"));

        assertTrue(out.contains("Boolean Logic:"));
        assertTrue(out.contains("Negation of isTrue: false"));
    }
}
