package com.mickyholmes.java60days.day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex02StringManipulationTest {

    @Test
    void testAnalyzeSentence() {
        Ex02StringManipulation.SentenceInfo info = Ex02StringManipulation.analyzeSentence("Michael");
        assertEquals(7, info.length());
        assertEquals('M', info.firstChar());
        assertEquals('l', info.lastChar());
    }

    @Test
    void testCompareSentence_equal() {
        assertEquals(
                "Sentences are exactly the same.",
                Ex02StringManipulation.compareSentence("Java", "Java")
        );
    }

    @Test
    void testCompareSentence_ignoreCase() {
        assertEquals(
                "The two sentences are the same, ignoring case (equalsIgnoreCase).",
                Ex02StringManipulation.compareSentence("Java", "java")
        );
    }

    @Test
    void testCompareSentence_different() {
        assertEquals(
                "Sentences are different.",
                Ex02StringManipulation.compareSentence("Michael", "MickyHolmes")
        );
    }

    @Test
    void testCompareLexicographically_before() {
        assertTrue(
                Ex02StringManipulation.compareLexicographically("apple", "zebra")
                        .contains("apple\" comes before \"zebra")
        );
    }

    @Test
    void testCompareLexicographically_after() {
        assertTrue(
                Ex02StringManipulation.compareLexicographically("zebra", "apple")
                        .contains("zebra\" comes after \"apple")
        );
    }

    @Test
    void testCompareLexicographically_same() {
        assertEquals(
                "Lexicographically, both sentences are the same.",
                Ex02StringManipulation.compareLexicographically("yoho", "yoho")
        );
    }

    @Test
    void testReplaceWord_found() {
        assertEquals(
                "I think therefore I am",
                Ex02StringManipulation.replaceWord("I dream therefore I am", "dream", "think")
        );
    }

    @Test
    void testReplaceWord_notFound() {
        assertEquals(
                "No change - word to replace not found!",
                Ex02StringManipulation.replaceWord("I think therefore I am", "dog", "cat")
        );
    }
}
