package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            if (isSumDivisibleBy8(number) && containsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean containsOddDigit(int number) {
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
