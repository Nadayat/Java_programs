package Javva_projects;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "banana", "orange", "grape", "melon"}; // List of words to choose from
        String word = words[(int) (Math.random() * words.length)]; // Choose a random word from the list
        char[] guessedWord = new char[word.length()]; // Array to store the guessed letters

        // Initialize guessedWord with underscores
        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = '_';
        }

        int attempts = 6; // Number of attempts allowed
        boolean wordGuessed = false;

        System.out.println("Welcome to Hangman!");
        System.out.println("It is a fruit guess the right fruit....");
        System.out.println("Try to guess the word:");
        displayWord(guessedWord);

        while (attempts > 0 && !wordGuessed) {
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            if (containsLetter(word, guessedWord, guess)) {
                System.out.println("Good guess!");
            } else {
                attempts--;
                System.out.println("Incorrect guess! Attempts remaining: " + attempts);
            }

            if (wordGuessed(guessedWord)) {
                wordGuessed = true;
            }

            displayWord(guessedWord);
        }

        if (wordGuessed) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Sorry, you ran out of attempts! The word was: " + word);
        }

        scanner.close();
    }

    // Method to display the current state of the word
    public static void displayWord(char[] guessedWord) {
        System.out.print("Word: ");
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Method to check if the guessed letter is in the word and update guessedWord accordingly
    public static boolean containsLetter(String word, char[] guessedWord, char guess) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessedWord[i] = guess;
                found = true;
            }
        }
        return found;
    }

    // Method to check if the entire word has been guessed
    public static boolean wordGuessed(char[] guessedWord) {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}

