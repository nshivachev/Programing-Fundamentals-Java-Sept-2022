package Fundamentals.RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participantsList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> raceMap = new LinkedHashMap<>();

        Pattern patternLetters = Pattern.compile("[A-Za-z]+");
        Pattern patternDigits = Pattern.compile("\\d");

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            Matcher matcherLetters = patternLetters.matcher(input);
            StringBuilder name = new StringBuilder();
            while (matcherLetters.find()) {
                name.append(matcherLetters.group());
            }

            Matcher matcherDigits = patternDigits.matcher(input);
            int distance = 0;
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            String racerName = name.toString();
            if (participantsList.contains(racerName)) {
                raceMap.putIfAbsent(racerName, 0);
                raceMap.put(racerName, distance + raceMap.get(racerName));
            }
            input = scanner.nextLine();
        }
        List<String> firstThree = raceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}