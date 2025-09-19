package com.mickyholmes.java60days.day04;

import java.util.Scanner;

public class Ex01SimpleInterestCalculator {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSimple Interest Calculator");
        System.out.println("-========================-\n");

        boolean running = true;
        while (running) {

            double principal = readDouble(scanner, "Enter principal amount: ");
            double rate = readDouble(scanner, "Enter annual interest rate (%): ");
            double time = readDouble(scanner, "Enter time period (years): ");

            System.out.printf("Simple Interest: €%.2f", calculateSimpleInterest(principal, rate, time));

            System.out.print("\nCalculate again? (yes / no): ");
            String choice = scanner.next().trim().toLowerCase();
            scanner.nextLine(); // Consume newline
            if (choice.equals("no") || choice.equals("exit") || choice.equals("q") || (choice.startsWith("n"))) {
                running = false;
                System.out.println("Goodbye");
            }

        }
        scanner.close();
    }

    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Invalid input - enter a positive number. ");
                }


            } else {
                System.out.println("Invalid input - please enter a number. ");
                scanner.next();
            }
        }
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

}
