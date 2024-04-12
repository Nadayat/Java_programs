package Javva_projects;

import java.util.Random;
import java.util.Scanner;

public class DiceRollingSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Dice Rolling Simulator!");

        while (true) {
            System.out.print("Press Enter to roll the dice (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Dice Rolling Simulator!");
                break;
            }

            int diceValue = random.nextInt(6) + 1; // Generate a random number between 1 and 6
            System.out.println("You rolled: " + diceValue);
        }

        scanner.close();
    }
}

