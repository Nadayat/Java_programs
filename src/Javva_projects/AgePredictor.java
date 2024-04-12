package Javva_projects;

import java.util.Calendar;
import java.util.Scanner;

public class AgePredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Age Predictor!");
        System.out.print("Please enter your birth year: ");

        int birthYear = scanner.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if (birthYear < currentYear) {
            int age = currentYear - birthYear;
            System.out.println("Based on the provided birth year, your age is approximately " + age + " years old.");
        } else {
            System.out.println("Invalid input: Please enter a birth year before the current year.");
        }

        scanner.close();
    }
}

