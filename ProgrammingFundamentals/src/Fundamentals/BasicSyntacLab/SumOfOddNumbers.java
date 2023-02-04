package Fundamentals.BasicSyntacLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int i = 1;

        while (i <= number * 2) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
