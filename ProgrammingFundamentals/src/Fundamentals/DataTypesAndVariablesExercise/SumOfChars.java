package Fundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short n = scanner.nextShort();
        short sum = 0;

        while (n > 0) {
            char letter = scanner.next().charAt(0);
            sum += letter;
            n--;
        }
        System.out.println("The sum equals: " + sum);
    }
}
