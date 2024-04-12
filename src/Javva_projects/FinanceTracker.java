package Javva_projects;

import java.util.Scanner;

public class FinanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = 0;
        double expenses = 0;

        System.out.println("Welcome to the Personal Finance Tracker!");

        while (true) {
            System.out.println("\n1. Add income");
            System.out.println("2. Add expense");
            System.out.println("3. View summary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter income amount: ");
                    double incomeAmount = scanner.nextDouble();
                    income += incomeAmount;
                    System.out.println("Income added successfully.");
                    break;
                case 2:
                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scanner.nextDouble();
                    expenses += expenseAmount;
                    System.out.println("Expense added successfully.");
                    break;
                case 3:
                    System.out.println("Summary:");
                    System.out.println("Income: " + income + " Rupees");
                    System.out.println("Expenses: " + expenses + " Rupees");
                    System.out.println("Balance: " + (income - expenses) + " Rupees");
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
