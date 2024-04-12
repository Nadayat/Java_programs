package Javva_projects;

import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You wake up in a mysterious room. What do you do?");

        boolean gameRunning = true;
        while (gameRunning) {
            System.out.println("1. Look around");
            System.out.println("2. Open the door");
            System.out.println("3. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You look around and find a key on the table.");
                    break;
                case 2:
                    System.out.println("You open the door and see a long corridor.");
                    System.out.println("Do you want to go down the corridor? (yes/no)");
                    scanner.nextLine(); // Consume newline
                    String decision = scanner.nextLine();
                    if (decision.equalsIgnoreCase("yes")) {
                        System.out.println("You walk down the corridor...");
                        System.out.println("You encounter a locked gate. You need a key to proceed.");
                    } else {
                        System.out.println("You stay in the room.");
                    }
                    break;
                case 3:
                    gameRunning = false;
                    System.out.println("Exiting the game...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }

        scanner.close();
    }
}

