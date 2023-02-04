package Fundamentals.StringsExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] texts = scanner.nextLine().split("\\s+");
        String firstString = texts[0];
        String secondString = texts[1];

        System.out.println(multiplyCharCodes(firstString, secondString));

    }
    public static int multiplyCharCodes(String firstText, String secondText) {
        int sum = 0;
        if (firstText.length() <= secondText.length()) {
            for (int i = 0; i < firstText.length(); i++) {
                sum += firstText.charAt(i) * secondText.charAt(i);
            }
            for (char symbol : secondText.substring(firstText.length()).toCharArray()) {
                sum += symbol;
            }
        } else {
            for (int i = 0; i < secondText.length(); i++) {
                sum += firstText.charAt(i) * secondText.charAt(i);
            }
            for (char symbol : firstText.substring(secondText.length()).toCharArray()) {
                sum += symbol;
            }
        }
        return sum;
    }
}
