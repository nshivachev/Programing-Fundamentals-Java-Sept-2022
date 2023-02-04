package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleSymbol(text);
    }

    public static void printMiddleSymbol(String text) {
        if (text.length() % 2 == 1) {
            System.out.println(text.charAt(text.length() / 2));
        } else {
            System.out.println("" + text.charAt(text.length() / 2 - 1) + text.charAt(text.length() / 2));
        }

    }
}
