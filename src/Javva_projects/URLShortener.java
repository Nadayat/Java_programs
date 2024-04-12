package Javva_projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class URLShortener {
    private Map<String, String> shortToOriginalMap;
    private Map<String, String> originalToShortMap;
    private static final String CHARACTERS = "lkjdsfglksdfglsdfl";
    private static final int SHORT_URL_LENGTH = 6;

    public URLShortener() {
        this.shortToOriginalMap = new HashMap<>();
        this.originalToShortMap = new HashMap<>();
    }

    public String shortenURL(String originalURL) {
        if (originalToShortMap.containsKey(originalURL)) {
            return originalToShortMap.get(originalURL);
        }

        String shortURL = generateRandomShortURL();
        while (shortToOriginalMap.containsKey(shortURL)) {
            shortURL = generateRandomShortURL();
        }

        shortToOriginalMap.put(shortURL, originalURL);
        originalToShortMap.put(originalURL, shortURL);

        return shortURL;
    }

    public String expandURL(String shortURL) {
        return shortToOriginalMap.getOrDefault(shortURL, "Short URL not found.");
    }

    private String generateRandomShortURL() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        URLShortener urlShortener = new URLShortener();
        String originalURL = "https://www.example.com/page1234?q=loremipsum&ref=abcdefg&sessionid=1234567890&timestamp=1646602481\n";

        String shortURL = urlShortener.shortenURL(originalURL);
        System.out.println("Shortened URL: " + shortURL);

        String expandedURL = urlShortener.expandURL(shortURL);
        System.out.println("Expanded URL: " + expandedURL);
    }
}

