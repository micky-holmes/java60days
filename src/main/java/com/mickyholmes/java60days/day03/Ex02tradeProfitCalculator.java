package com.mickyholmes.java60days.day03;

import java.util.Scanner;

public class Ex02tradeProfitCalculator {

    public static double calculateProfit(double costPrice, double sellingPrice) {
        return sellingPrice - costPrice;
    }

    public record StockCalculation(int unitsAfterIncrement, int unitsAfterDecrement) {
    }

    public static StockCalculation calculateStock(int unitsSold) {
        int unitsAfterIncrement = ++unitsSold;
        int unitsAfterDecrement = --unitsSold;
        return new StockCalculation(unitsAfterIncrement, unitsAfterDecrement);
    }

    public static double calculateProfitOrLoss(int unitsSold, double profitPerUnit) {
        return unitsSold * profitPerUnit;

    }

    public static int calculateModulo(int unitsSold) {
        return unitsSold % 3;
    }

    public static void tradeProfitCalculator() {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the cost price and selling price
        System.out.print("Enter the cost price of the item:");
        double costPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the selling price of the item:");
        double sellingPrice = scanner.nextDouble();
        scanner.nextLine();

        // Calculate the profit or loss
        System.out.println("Profit: " + calculateProfit(costPrice, sellingPrice));

        // Demonstrate unary operators
        int unitsSold = 10;
        StockCalculation sc = calculateStock(unitsSold);
        System.out.println("\nDemonstrating Unary Operators:");
        System.out.println("Initial units sold: " + unitsSold);
        System.out.println("Units sold after increment: " + sc.unitsAfterIncrement());
        System.out.println("Units sold after decrement: " + sc.unitsAfterDecrement());

        // Demonstrate compound operators
        System.out.println("\nDemonstrating Compound Operators:");
        System.out.println("Total revenue after selling 10 units: $" + calculateProfitOrLoss(unitsSold, calculateProfit(costPrice, sellingPrice)));


        // Use the modulo operator
        // After incrementing and decrementing, unitsSold is back to 10
        // So, the modulo operation is done on 10

        System.out.println("\nDemonstrating Modulo Operator:");
        System.out.println("Remainder when units sold is divided by 3: " + calculateModulo(unitsSold));

        scanner.close();
    }

}
