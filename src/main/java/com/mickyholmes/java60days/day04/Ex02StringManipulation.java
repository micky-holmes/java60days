package com.mickyholmes.java60days.day04;

import java.util.Scanner;

public class Ex02StringManipulation {

    public static void stringManipulation() {
        // Create a scanner object to take user input

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        System.out.print("Enter a full sentence:");
        String sentence1 = scanner.nextLine();

        SentenceInfo info = analyzeSentence(sentence1);

        System.out.println("The length of the sentence is: " + info.length());
        System.out.println("The first character of the sentence is: " + info.firstChar());
        System.out.println("The last character of the sentence is: " + info.lastChar());

        // Ask for another string to compare
        System.out.print("\nEnter another sentence to compare: ");
        String sentence2 = scanner.nextLine();

        System.out.println(compareSentence(sentence1, sentence2));
        System.out.println(compareLexicographically(sentence1, sentence2));

        System.out.print("\nEnter a word to replace in the first sentence: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        String newSentence = replaceWord(sentence1, wordToReplace, replacementWord);

        System.out.println("Modified sentence: " + newSentence);

        // Convert sentence to upper and lower case
        System.out.println("Uppercase version: " + newSentence.toUpperCase());
        System.out.println("Lowercase version: " + newSentence.toLowerCase());

        // Formatting with strings and numbers
        System.out.print("\nEnter an interest rate (e.g., 5.5):");
        double interestRate = scanner.nextDouble();
        System.out.printf("The formatted interest rate is: %.2f%%\n", interestRate);
    }

    // Print the length of the sentence
    // Print the first and last character of the sentence
    public record SentenceInfo(int length, char firstChar, char lastChar) {
    }

    public static SentenceInfo analyzeSentence(String sentence) {
        return new SentenceInfo(
                sentence.length(),
                sentence.charAt(0),
                sentence.charAt(sentence.length() - 1)
        );
    }

    // Compare the two sentences using equals and equalsIgnoreCase
    public static String compareSentence(String sentence1, String sentence2) {
        return switch (sentence1) {
            case String s when s.equals(sentence2) -> "Sentences are exactly the same.";
            case String s when s.equalsIgnoreCase(sentence2) ->
                    "The two sentences are the same, ignoring case (equalsIgnoreCase).";
            default -> "Sentences are different.";
        };
    }

    // Lexicographical comparison using compareTo
    public static String compareLexicographically(String sentence1, String sentence2) {
        int result = sentence1.compareTo(sentence2);

        return switch (Integer.signum(result)) {
            case -1 -> "\"" + sentence1 + "\" comes before \"" + sentence2 + "\".";
            case 0 -> "Lexicographically, both sentences are the same.";
            case 1 -> "\"" + sentence1 + "\" comes after \"" + sentence2 + "\".";
            default -> "Unexpected result.";
        };

    }

    // Demonstrate substring and replace methods
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        if (!sentence.contains(wordToReplace)) {
            return "No change - word to replace not found!";
        }
        return sentence.replace(wordToReplace, replacementWord);
    }


}
