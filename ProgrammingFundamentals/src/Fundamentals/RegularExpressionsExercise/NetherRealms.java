package Fundamentals.RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demonsArr = scanner.nextLine().split("[, ]+");
        Pattern patternHealth = Pattern.compile("[^\\d+\\-*/.]");
        Pattern patternDamage = Pattern.compile("-?\\d+\\.?\\d*");
        Pattern patternOperator = Pattern.compile("[*/]");

        for (String demon : demonsArr) {
            Matcher matcher = patternHealth.matcher(demon);
            int totalHealth = 0;
            while (matcher.find()){
                totalHealth += matcher.group().charAt(0);
            }

            matcher = patternDamage.matcher(demon);
            double totalDamage = 0;
            while (matcher.find()) {
                totalDamage += Double.parseDouble(matcher.group());
            }

            matcher = patternOperator.matcher(demon);
            while (matcher.find()) {
                if (matcher.group().equals("*")) {
                    totalDamage = totalDamage * 2;
                } else if (matcher.group().equals("/")) {
                    totalDamage = totalDamage / 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demon, totalHealth, totalDamage);
        }
    }
}
