package com.mickyholmes.java60days.day03;

import java.util.Scanner;

public class Ex01CalorieCounter {

    public static int calculateTotal(int... calories){
        int total = 0;
        for (int c: calories){
            total +=c;
        }
        return total;
    }

    public static void run() {
        System.out.println("\nWelcome to Calorie Counter!");
        System.out.println("===========================");

        String food1, food2, food3;
        int calories1, calories2,  calories3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first food item:\t");
        food1 = scanner.nextLine();
        System.out.print("Enter the calories for " + food1 + ":\t\t\t");
        calories1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the name of the second food item:\t");
        food2 = scanner.nextLine();
        System.out.print("Enter the calories for " + food2 + ":\t\t\t");
        calories2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the name of the third food item:\t");
        food3 = scanner.nextLine();
        System.out.print("Enter the calories for " + food3 + ":\t\t\t");
        calories3 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int totalCalories = calculateTotal(calories1, calories2,  calories3);

        System.out.println("\nYour Calorie Intake:");
        System.out.println("---------------------");
        System.out.println("1. " + food1 + " - " + calories1 + " calories");
        System.out.println("2. " + food2 + " - " + calories2 + " calories");
        System.out.println("3. " + food3 + " - " + calories3 + " calories");
        System.out.println("\nTotal Calorie Intake: " + totalCalories + " calories");

        scanner.close();

    }
}
