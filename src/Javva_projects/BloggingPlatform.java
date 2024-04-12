package Javva_projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BloggingPlatform {
    private static Map<String, String> blogPosts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Blogging Platform!");

        while (true) {
            System.out.println("\n1. Create a new blog post");
            System.out.println("2. View all blog posts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter post title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter post content: ");
                    String content = scanner.nextLine();
                    createBlogPost(title, content);
                    System.out.println("Blog post created successfully.");
                    break;
                case 2:
                    if (blogPosts.isEmpty()) {
                        System.out.println("No blog posts available.");
                    } else {
                        System.out.println("All blog posts:");
                        for (Map.Entry<String, String> entry : blogPosts.entrySet()) {
                            System.out.println("Title: " + entry.getKey());
                            System.out.println("Content: " + entry.getValue());
                            System.out.println();
                        }
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

    private static void createBlogPost(String title, String content) {
        blogPosts.put(title, content);
    }
}

