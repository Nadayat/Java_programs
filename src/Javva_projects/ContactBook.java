package Javva_projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    private Map<String, String> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact book is empty.");
        } else {
            System.out.println("Contacts:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone number: " + entry.getValue());
            }
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Name: " + name + ", Phone number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();

        while (true) {
            System.out.println("\nContact Book Menu:");
            System.out.println("1. Add contact");
            System.out.println("2. Display contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contactBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    contactBook.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    contactBook.searchContact(searchName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}

