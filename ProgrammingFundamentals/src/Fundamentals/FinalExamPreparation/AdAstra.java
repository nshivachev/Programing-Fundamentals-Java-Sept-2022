package Fundamentals.FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<item>[A-ZAa-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;

        StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            String itemName = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

            output.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", itemName, date, calories));
        }
        System.out.printf("You have food to last you for: %d days!%n", totalCalories/2000);
        System.out.printf(output.toString());

    }
}
