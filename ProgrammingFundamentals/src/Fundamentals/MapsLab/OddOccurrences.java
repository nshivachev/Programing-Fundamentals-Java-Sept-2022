package Fundamentals.MapsLab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split("\\s+");

        Map<String, Integer> wordsCountMap = new LinkedHashMap<>();

        for (String word : wordsArray) {
            String wordLowerCase = word.toLowerCase();
            wordsCountMap.putIfAbsent(wordLowerCase, 0);
            wordsCountMap.put(wordLowerCase, wordsCountMap.get(wordLowerCase) + 1);
        }

        List<String> odds = new ArrayList<>();

        for (var entry : wordsCountMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));
    }
}
