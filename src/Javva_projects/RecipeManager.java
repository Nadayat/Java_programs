package Javva_projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecipeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> recipes = new HashMap<>();

        System.out.println("Welcome to the Recipe Manager!");

        while (true) {
            System.out.println("\n1. Add recipe");
            System.out.println("2. View recipe");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter recipe name: ");
                    String recipeName = scanner.nextLine();
                    System.out.print("Enter recipe description: ");
                    String recipeDescription = scanner.nextLine();
                    recipes.put(recipeName, recipeDescription);
                    System.out.println("Recipe added successfully.");
                    break;
                case 2:
                    System.out.print("Enter recipe name to view: ");
                    String viewRecipeName = scanner.nextLine();
                    if (recipes.containsKey(viewRecipeName)) {
                        System.out.println("Recipe: " + viewRecipeName);
                        System.out.println("Description: " + recipes.get(viewRecipeName));
                    } else {
                        System.out.println("Recipe not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}

