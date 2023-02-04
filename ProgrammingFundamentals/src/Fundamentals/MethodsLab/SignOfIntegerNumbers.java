package Fundamentals.MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumberSign(Integer.parseInt(scanner.nextLine()));
    }
    public static void printNumberSign(int num) {
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}
