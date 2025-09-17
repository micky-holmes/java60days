package com.mickyholmes.java60days.day01;

import java.util.Scanner;

public class Ex02DisplayingText {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = scanner.nextLine();

        System.out.println("Using println:");
        System.out.println(message);

        System.out.print("Using print:" + message);
        System.out.print("\n\n");

        System.out.println("Text with escape sequences:");
        System.out.println("Hello, \"Java Masterclass\" students!");
        System.out.println("Welcome to Day 1.");
        System.out.println("Let's get started!");

        scanner.close();
    }
}
