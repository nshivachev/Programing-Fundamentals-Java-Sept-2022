package Fundamentals.BitwiseOperations;

import java.util.Scanner;

public class PthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        number = number >> position;

        int bit = number & 1;
        System.out.println(bit);

    }
}
