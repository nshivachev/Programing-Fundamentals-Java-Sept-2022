package Fundamentals.StringsExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = "";

        String[] filePath = scanner.nextLine().split("\\\\");
        for (String pathPart : filePath) {
            if (pathPart.contains(".")) {
                file = pathPart;
            }
        }
        System.out.println("File name: " + file.split("\\.")[0]);
        System.out.println("File extension: " + file.split("\\.")[1]);
    }
}
