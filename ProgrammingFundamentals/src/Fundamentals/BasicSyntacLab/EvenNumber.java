package Fundamentals.BasicSyntacLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        while (number %2 != 0) {
            System.out.println("Please write an even number.");
            number = Math.abs(Integer.parseInt(scanner.nextLine()));
        }
        if (number % 2 == 0) {
            System.out.println("The number is: " + number);
        }
    }
}
