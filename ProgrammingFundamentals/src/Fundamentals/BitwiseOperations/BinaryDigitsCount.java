package Fundamentals.BitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int binaryNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        while (num != 0) {
            if (num % 2 == binaryNum) {
                counter++;
            }
            num = num / 2;
        }
        System.out.println(counter);
    }
}
