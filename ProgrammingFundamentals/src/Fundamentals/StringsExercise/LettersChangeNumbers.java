package Fundamentals.StringsExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split("\\s+");
        double sum = 0;

        for (String text : inputArray) {
            double number = Double.parseDouble(text.substring(1, text.length() - 1));
            if (Character.isUpperCase(text.charAt(0))) {
                sum = sum + number / (text.charAt(0) - 64);
            } else {
                sum = sum + number * (text.charAt(0) - 96);
            }

            if (Character.isUpperCase(text.charAt(text.length() - 1))) {
                sum = sum - (text.charAt(text.length() - 1) - 64);
            } else {
                sum = sum + (text.charAt(text.length() - 1) - 96);
            }
        }
        System.out.printf("%.2f", sum);
    }
}
