package Fundamentals.RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalIncome = 0;

        String order = scanner.nextLine();
        while (!order.equals("end of shift")) {
            Matcher matcher = pattern.matcher(order);

            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = price * count;
                totalIncome = totalIncome + totalPrice;
                System.out.printf("%s: %s - %.2f%n", customer, product, totalPrice);
            }
            order = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
