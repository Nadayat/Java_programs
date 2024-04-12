package Javva_projects;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates
        double usdToEurRate = 0.82;
        double usdToGbpRate = 0.73;
        double usdToRupee = 82.02;

        System.out.println("Welcome to the Currency Converter!");
        System.out.print("Enter amount in USD: ");
        double amountUSD = scanner.nextDouble();

        double amountEUR = amountUSD * usdToEurRate;
        double amountGBP = amountUSD * usdToGbpRate;
        double amountRUPEE = amountUSD * usdToRupee;


        System.out.println(amountUSD + " USD is equivalent to:");
        System.out.println(amountEUR + " EUR");
        System.out.println(amountGBP + " GBP");
        System.out.println(amountRUPEE + " Rupees");

        scanner.close();
    }
}

