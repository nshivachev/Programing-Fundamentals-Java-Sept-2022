package Fundamentals.BitwiseOperations;

import java.util.Scanner;

public class BitAtPosition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //int n = 1 << 1;
        int n = 1;


        //int bitAtPosition1 = (number & n) >> 1;
        number = number >> 1;
        int bitAtPosition1 = number & n;
        System.out.println(bitAtPosition1);


    }
}
