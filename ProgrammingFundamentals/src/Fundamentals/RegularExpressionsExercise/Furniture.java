package Fundamentals.RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);

        System.out.println("Bought furniture:");
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println(matcher.group("name"));
                totalPrice = totalPrice + Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
