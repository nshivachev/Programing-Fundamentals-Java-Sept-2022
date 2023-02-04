package Fundamentals.FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                Pattern digitPattern = Pattern.compile("\\d+");
                Matcher digitMatcher = digitPattern.matcher(barcode);
                StringBuilder productGroup = new StringBuilder();
                while (digitMatcher.find()) {
                    productGroup.append(digitMatcher.group());
                }
                if (productGroup.length() == 0) {
                    productGroup.append("00");
                }
                System.out.println("Product group: " + productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
