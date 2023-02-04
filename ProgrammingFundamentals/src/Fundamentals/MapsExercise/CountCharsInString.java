package Fundamentals.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

        for (Character symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            countMap.putIfAbsent(symbol, 0);
            countMap.put(symbol, countMap.get(symbol) + 1);
        }
        countMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
