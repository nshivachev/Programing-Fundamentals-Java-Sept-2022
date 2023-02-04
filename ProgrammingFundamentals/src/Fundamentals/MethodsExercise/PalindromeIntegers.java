package Fundamentals.MethodsExercise;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while(!command.equals("END")) {
            if (isPalindrome(command)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            command = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String command) {
        int[] numbers = new int[command.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = command.charAt(i);
        }
        for (int i = 0; i <= numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
