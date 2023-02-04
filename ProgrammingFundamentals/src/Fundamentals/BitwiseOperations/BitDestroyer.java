package Fundamentals.BitwiseOperations;

import java.util.Scanner;

public class BitDestroyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        int mask = ~(1 << position);
        int newNumber = number & mask;
        System.out.println(newNumber);
    }
}
