package Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            int lastDigit;
            while (num != 0) {
                lastDigit = num % 10;
                sum += lastDigit;
                num = num / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> %s%n", i, "True");
            } else {
                System.out.printf("%d -> %s%n", i, "False");
            }
        }
    }
}
