package Javva_projects;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%&*_+-=";

    private static final String PASSWORD_CHARS = CHAR_LOWER + CHAR_UPPER + DIGITS + SPECIAL_CHARS;
    private static final SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        int length = 12; // Password length

        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = secureRandom.nextInt(PASSWORD_CHARS.length());
            stringBuilder.append(PASSWORD_CHARS.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}

