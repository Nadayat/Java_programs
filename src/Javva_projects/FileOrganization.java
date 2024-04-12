package Javva_projects;

import java.io.File;

public class FileOrganization {
    public static void main(String[] args) {
        // Path to the directory to be organized
        String directoryPath = "E:/";

        // Create a File object representing the directory
        File directory = new File(directoryPath);

        // Get list of files in the directory
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // Get the file extension
                    String extension = getFileExtension(file);

                    // Create directories based on file extensions
                    File destinationDirectory = new File(directory, extension);
                    if (!destinationDirectory.exists()) {
                        destinationDirectory.mkdirs();
                    }

                    // Move the file to the appropriate directory
                    file.renameTo(new File(destinationDirectory, file.getName()));
                    System.out.println("Moved file: " + file.getName() + " to directory: " + extension);
                }
            }
        } else {
            System.out.println("No files found in the directory.");
        }
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1);
        }
        return "Other";
    }
}

