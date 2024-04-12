package Javva_projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeatherForecastApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> weatherData = new HashMap<>();
        weatherData.put("New York", "Sunny");
        weatherData.put("London", "Cloudy");
        weatherData.put("Tokyo", "Rainy");

        System.out.println("Welcome to the Weather Forecast App!");

        while (true) {
            System.out.println("\n1. Check weather forecast");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    if (weatherData.containsKey(city)) {
                        String weatherCondition = weatherData.get(city);
                        System.out.println("Weather forecast for " + city + ": " + weatherCondition);
                    } else {
                        System.out.println("Weather forecast not available for " + city);
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
}

