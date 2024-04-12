package Javva_projects;

import java.util.Scanner;

public class SentimentAnalysisTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined sets of positive and negative words
        String[] positiveWords = {"good", "happy", "awesome", "great", "excellent", "not a bad"};
        String[] negativeWords = {"sad", "terrible", "awful", "horrible"};

        System.out.println("Welcome to the Sentiment Analysis Tool!");
        System.out.print("Enter text to analyze: ");
        String text = scanner.nextLine().toLowerCase();

        int positiveCount = 0;
        int negativeCount = 0;

        // Count the occurrences of positive and negative words in the text
        for (String word : positiveWords) {
            if (text.contains(word)) {
                positiveCount++;
            }
        }
        for (String word : negativeWords) {
            if (text.contains(word)) {
                negativeCount++;
            }
        }

        // Determine sentiment based on the counts
        if (positiveCount > negativeCount) {
            System.out.println("Sentiment: Positive");
        } else if (positiveCount < negativeCount) {
            System.out.println("Sentiment: Negative");
        } else {
            System.out.println("Sentiment: Neutral");
        }

        scanner.close();
    }
}

