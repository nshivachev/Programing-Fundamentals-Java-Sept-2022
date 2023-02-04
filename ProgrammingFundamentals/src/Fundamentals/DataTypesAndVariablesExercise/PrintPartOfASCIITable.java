package Fundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short start = scanner.nextShort();
        short end = scanner.nextShort();

        for (int i = start; i <= end; i++) {
            System.out.printf("%c ", (char)i);
        }
    }
}
