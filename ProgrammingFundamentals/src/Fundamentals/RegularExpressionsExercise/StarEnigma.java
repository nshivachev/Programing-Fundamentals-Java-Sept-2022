package Fundamentals.RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern countLettersPattern = Pattern.compile("[s,t,a,r,S,T,A,R]");
        Pattern decryptPattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[A,D])[^@\\-!:>]*![^@\\-!:>]*->(?<soldierCount>\\d+)");

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String message = scanner.nextLine();
            int lettersCount = 0;
            Matcher lettersMatcher = countLettersPattern.matcher(message);
            while (lettersMatcher.find()){
                lettersCount++;
            }
            StringBuilder currentMessage = new StringBuilder();
            for (char symbol : message.toCharArray()) {
                currentMessage.append((char)(symbol - lettersCount));
            }
            Matcher decryptMatcher = decryptPattern.matcher(currentMessage);
            if (decryptMatcher.find()) {
                String planetName  = decryptMatcher.group("planetName");
                String attackType = decryptMatcher.group("attackType");

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }
}
