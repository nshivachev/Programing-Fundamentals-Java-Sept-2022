package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.next().charAt(0);
        char endSymbol = scanner.next().charAt(0);

        printSymbols(startSymbol, endSymbol);
    }

    public static void printSymbols(char startSymbol, char endSymbol) {
        if (startSymbol < endSymbol) {
            for (int i = startSymbol + 1; i <= endSymbol - 1; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = endSymbol + 1; i <= startSymbol - 1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
