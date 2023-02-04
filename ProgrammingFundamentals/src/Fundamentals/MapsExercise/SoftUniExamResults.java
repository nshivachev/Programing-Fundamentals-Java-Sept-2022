package Fundamentals.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> userPointsMap = new LinkedHashMap<>();
        Map<String, Integer> languageMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String username = input.split("-")[0];
            if (input.contains("banned")) {
                userPointsMap.remove(username);
            } else {
                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);
                userPointsMap.putIfAbsent(username, 0);
                if (userPointsMap.get(username) < points) {
                    userPointsMap.put(username, points);
                }
                languageMap.putIfAbsent(language, 0);
                languageMap.put(language, languageMap.get(language) + 1);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPointsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        languageMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
