package Javva_projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> flashcards = new HashMap<>();
        flashcards.put("What is the capital of France?", "Paris");
        flashcards.put("What is the largest planet in our solar system?", "Jupiter");
        flashcards.put("What is the chemical symbol for water?", "H2O");

        System.out.println("Welcome to the Quiz App!");

        for (Map.Entry<String, String> entry : flashcards.entrySet()) {
            System.out.println("Question: " + entry.getKey());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(entry.getValue())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + entry.getValue());
            }
        }

        scanner.close();
    }
}

