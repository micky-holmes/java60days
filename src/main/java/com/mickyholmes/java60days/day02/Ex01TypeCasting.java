package com.mickyholmes.java60days.day02;

import java.io.PrintStream;

public class Ex01TypeCasting {
    // DTO - record to contain results
    public record CastResult(int asInt, long asLong, float asFloat, byte asByte, short asShort) {
    }

    // Perform casts - no printing or input
    public static CastResult compute(double shapeValue) {
        int intShape = (int) shapeValue;
        long longShape = (long) shapeValue;
        float floatShape = (float) shapeValue;
        byte byteShape = (byte) shapeValue;
        short shortShape = (short) shapeValue;
        return new CastResult(intShape, longShape, floatShape, byteShape, shortShape);
    }

    // Output results
    public static void printResults(double shapeValue, CastResult r, PrintStream out) {
        out.println("Current Shape (double): " + shapeValue);
        out.println("Transforming....");
        out.println("=================================");
        out.printf("%-15s | %10s%n", "Type", "Value");
        out.println("=================================");
        out.printf("%-15s | %10.2f%n", "Original double", shapeValue);
        out.printf("%-15s | %10d%n", "Cast to int", r.asInt());
        out.printf("%-15s | %10d%n", "Cast to long", r.asLong());
        out.printf("%-15s | %10.2f%n", "Cast to float", r.asFloat());
        out.printf("%-15s | %10d%n", "Cast to byte", r.asByte());
        out.printf("%-15s | %10d%n", "Cast to short", r.asShort());
        out.println("=================================");
    }

    // Method to run in runner with hardcoded value for double
    public static void run() {
        double shapeValue = 42.75;
        CastResult r = compute(shapeValue);
        printResults(shapeValue, r, System.out);
    }
}
